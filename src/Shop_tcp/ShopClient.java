package Shop_tcp;

import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;

import View.Login;

public class ShopClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private boolean connected;

    public ShopClient() {
        try {
            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            connected = true;

            String encodedKey = in.readLine();
            CryptoUtil.setDecodedKey(encodedKey);

            new Thread(new Listener()).start();
        } catch (IOException e) {
            e.printStackTrace();
            connected = false;
        }
    }

    public boolean isConnected() {
        return connected;
    }

    public void sendMessage(String message) {
        if (connected) {
            String encryptedMessage = CryptoUtil.encrypt(message);
            out.println(encryptedMessage);
        } else {
            System.out.println("Not connected to the server.");
        }
    }

    private class Listener implements Runnable {
        @Override
        public void run() {
            try {
                String message;
                while ((message = in.readLine()) != null) {
                    String decryptedMessage = CryptoUtil.decrypt(message);
                    System.out.println("Server: " + decryptedMessage);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ShopClient client = new ShopClient();
        if (client.isConnected()) {
            Login login = new Login(client);
            login.setVisible(true);
        } else {
            System.out.println("Failed to connect to the server.");
            JOptionPane.showMessageDialog(null, "Failed to connect to the server.", "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
