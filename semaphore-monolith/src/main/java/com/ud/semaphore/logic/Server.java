package com.ud.semaphore.logic;

import com.ud.semaphore.presentation.Intersection1;
import com.ud.semaphore.presentation.Intersection2;
import com.ud.semaphore.presentation.Intersection3;
import com.ud.semaphore.presentation.Intersection4;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Server extends JFrame implements Runnable {
    private ServerSocket serverSocket;
    public Server(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(1000000);
    }

    public static void main(String[] args) {
        int port = 8080;
        try {
            Runnable t = new Server(port);
            t.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {

        while (true) {

            try {

                Logger.getLogger("Esperando conexión del cliente" +  serverSocket.getLocalPort());

                System.out.println("Esperando conexión del cliente " + serverSocket.getLocalPort());
                Socket server = serverSocket.accept();
                System.out.println("Servicio Conectado desde " + server.getRemoteSocketAddress());
                DataInputStream input = new DataInputStream(server.getInputStream());
                DataOutputStream output = new DataOutputStream(server.getOutputStream());

                output.writeUTF("\n\nSERVIDOR INICIADO\n" + menu());

                int service = input.readInt();
                System.out.println("Arrancando intersecciones...");

                do {
                    if (service == 0) {
                        output.writeUTF("Cerrando Semaforo...");
                        break; // from do while

                    } else if (service == 1) {

                        System.out.println("Arrancando Consola Intersección 1...");
                        Intersection1 intersection1 = new Intersection1();
                        intersection1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        intersection1.setSize(260, 570);
                        intersection1.setTitle("Intersección 1");
                        intersection1.setResizable(true);
                        intersection1.setVisible(true);

                    } else if (service == 2) {

                        System.out.println("Arrancando Consola Intersección 2...");
                        Intersection2 intersection2 = new Intersection2();
                        intersection2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        intersection2.setSize(260, 570);
                        intersection2.setTitle("Intersección 2");
                        intersection2.setResizable(true);
                        intersection2.setVisible(true);

                    }else if (service == 3) {

                        System.out.println("Arrancando Consola Intersección 3...");
                        Intersection3 intersection3 = new Intersection3();
                        intersection3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        intersection3.setSize(260, 570);
                        intersection3.setTitle("Intersección 3");
                        intersection3.setResizable(true);
                        intersection3.setVisible(true);

                    }else if (service == 4) {

                        System.out.println("Arrancando Consola Intersección 4...");
                        Intersection4 intersection4 = new Intersection4();
                        intersection4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        intersection4.setSize(260, 570);
                        intersection4.setTitle("Intersección 4");
                        intersection4.setResizable(true);
                        intersection4.setVisible(true);

                    }else if (service == 5) {
                        output.writeUTF("\n\nMenu Principal\n" + menu());
                    } else {
                        output.writeUTF("Opcion Invalida\n\t " + "Seleccion no valide");
                    }

                    service = input.readInt();

                } while (service != 0);

                output.writeUTF("Servidor -->\n\t " + "Gracias por conectarse a" + server.getLocalSocketAddress());
                server.close();


            } catch (SocketTimeoutException s) {

                System.out.println("Socket fuera de tiempo");
                break;

            } catch (IOException e) {

                e.printStackTrace();
                break;

            }
        }
    }

    private String menu() {
        return "\tServidor Iniciado...\n***************************\n" +
                "Seleccione una Opcion\n" +
                "0. Salir del Sistema\n" +
                " 1. Iniciar Intersección 1\n" +
                " 2. Iniciar Intersección 2\n" +
                " 3. Iniciar Intersección 3\n" +
                " 4. Iniciar Intersección 4\n" +
                " 5. Volver al Menu";
    }
}
