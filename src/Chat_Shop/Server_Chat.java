package Chat_Shop;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class Server_Chat {
    private static ConcurrentHashMap<String, ClientHandler> clients = new ConcurrentHashMap<>();
    private static int clientIdCounter = 1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Server");
        JTextArea textArea = new JTextArea();
        JTextField clientIdField = new JTextField();
        JTextField messageField = new JTextField();
        JButton sendButton = new JButton("Send");
        sendButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        sendButton.setForeground(new Color(255, 0, 0));
        frame.getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(0, 0, 511, 429);
        frame.getContentPane().add(scrollPane);

        JPanel panel = new JPanel(new GridLayout(1, 4));
        panel.setBounds(0, 439, 511, 21);
        JLabel label = new JLabel("Client ID:");
        label.setForeground(new Color(0, 128, 0));
        label.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(label);
        panel.add(clientIdField);
        JLabel label_1 = new JLabel("Message:");
        label_1.setForeground(new Color(255, 0, 128));
        label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(label_1);
        panel.add(messageField);
        panel.add(sendButton);

        frame.getContentPane().add(panel);
        frame.setSize(533, 510);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        textArea.append("Server started...\n");

        sendButton.addActionListener(e -> {
            String clientId = clientIdField.getText();
            String message = messageField.getText();
            sendMessageToClient(clientId, message);
            textArea.append("To Client " + clientId + ": " + message + "\n");
        });

        try (ServerSocket serverSocket = new ServerSocket(5555)) {
            ExecutorService executor = Executors.newCachedThreadPool();
            while (true) {
                Socket socket = serverSocket.accept();
                String clientId = String.valueOf(clientIdCounter++);
                ClientHandler clientHandler = new ClientHandler(socket, clientId, textArea);
                clients.put(clientId, clientHandler);
                executor.execute(clientHandler);
                textArea.append("Client " + clientId + " connected.\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ClientHandler implements Runnable {
        private Socket socket;
        private String clientId;
        private JTextArea textArea;
        private PrintWriter out;

        public ClientHandler(Socket socket, String clientId, JTextArea textArea) {
            this.socket = socket;
            this.clientId = clientId;
            this.textArea = textArea;
        }

        @Override
        public void run() {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                out = new PrintWriter(socket.getOutputStream(), true);
                String message;
                while ((message = in.readLine()) != null) {
                    textArea.append("Client " + clientId + ": " + message + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                clients.remove(clientId);
                textArea.append("Client " + clientId + " disconnected.\n");
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public void sendMessage(String message) {
            if (out != null) {
                out.println(message);
            }
        }
    }

    public static void sendMessageToClient(String clientId, String message) {
        ClientHandler clientHandler = clients.get(clientId);
        if (clientHandler != null) {
            clientHandler.sendMessage(message);
        }
    }
}
