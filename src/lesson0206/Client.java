package lesson0206;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static lesson0206.Server.IP_ADDRESS;
import static lesson0206.Server.PORT;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        DataInputStream in;
        DataOutputStream out;

        Scanner scanner = new Scanner(System.in);
        try {
            socket = new Socket(IP_ADDRESS, PORT);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            Thread thread = new Thread(() -> {
                try {
                    while (true) {
                        out.writeUTF(scanner.nextLine());
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            });
            thread.setDaemon(true);
            thread.start();

            while (true) {
                String str = in.readUTF();
                if (str.equals("/end")) {
                    System.out.println("Клиент отключился");
                    break;
                }
                System.out.println("Клиент: " + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Мы отключились от сервера");
            try {
                assert socket != null;
                socket.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}

