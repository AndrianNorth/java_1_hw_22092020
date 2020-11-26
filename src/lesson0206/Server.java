package lesson0206;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static final String IP_ADDRESS = "localhost";
    public static final int PORT = 8291;

    public static void main(String[] args) {
        Socket clientSocket = null;
        DataInputStream in;
        DataOutputStream out;

        Scanner scanner = new Scanner(System.in);

        try (ServerSocket serverSocket = new ServerSocket(PORT)){
            System.out.println("Сервер запущен");
            clientSocket = serverSocket.accept();
            System.out.println("Клиент подключился " + clientSocket.getRemoteSocketAddress());
            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());

            Thread thread = new Thread(() -> {
                try {
                    while (true) {
                        out.writeUTF(scanner.nextLine());
                    }
                    } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            });
                    thread.start();

                    while (true){
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
            assert clientSocket != null;
            System.out.println(clientSocket.getRemoteSocketAddress() + " отключился от сервера");
                    try {
                        clientSocket.close();
                    } catch (IOException | NullPointerException e) {
                        e.printStackTrace();
                    }
            }
    }
}
