package Chat_Shop;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Client_Chat {
    private static String clientName;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Client");
        JTextArea textArea = new JTextArea();
        textArea.setForeground(new Color(0, 128, 0));
        JTextField nameField = new JTextField();
        JTextField textField = new JTextField();
        JButton sendButton = new JButton("Send");
        sendButton.setBackground(new Color(255, 0, 0));
        sendButton.setForeground(new Color(0, 255, 0));
        sendButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Your Name: ");
        label.setForeground(new Color(0, 0, 255));
        label.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(label, BorderLayout.WEST);
        panel.add(nameField, BorderLayout.CENTER);

        JPanel southPanel = new JPanel(new BorderLayout());
        southPanel.add(textField, BorderLayout.CENTER);
        southPanel.add(sendButton, BorderLayout.EAST);

        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.getContentPane().add(southPanel, BorderLayout.SOUTH);

        frame.setSize(491, 521);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        try {
            Socket socket = new Socket("localhost", 5555);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            Thread readerThread = new Thread(() -> {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        textArea.append(message + "\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        in.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            readerThread.start();

            sendButton.addActionListener(e -> {
                if (clientName == null || clientName.isEmpty()) {
                    clientName = nameField.getText().trim();
                }
                if (!clientName.isEmpty()) {
                    String message = textField.getText();
                    if (!message.isEmpty()) {
                        out.println(clientName + ": " + message);
                        textArea.append("You: " + message + "\n");
                        textField.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter your name.");
                }
            });

            textField.addActionListener(e -> {
                if (clientName == null || clientName.isEmpty()) {
                    clientName = nameField.getText().trim();
                }
                if (!clientName.isEmpty()) {
                    String message = textField.getText();
                    if (!message.isEmpty()) {
                        out.println(clientName + ": " + message);
                        textArea.append("You: " + message + "\n");
                        textField.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter your name.");
                }
            });

            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                try {
                    out.close();
                    in.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }






}
