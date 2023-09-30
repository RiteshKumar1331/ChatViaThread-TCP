import java.net.*;
import java.io.*;
import java.util.*;

public class ServerThread2 extends Thread {
    Socket sct;

    ServerThread2(Socket socket) {
        sct = socket;
    }

    public void run() {
//        System.out.println("ServerThread2 starts...");
//        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                BufferedReader in = new BufferedReader(new InputStreamReader(sct.getInputStream()));
                    System.out.println("Client: " + in.readLine());
            }
        } catch (Exception e) {
//            System.out.println("Exception: " + e);
        }
    }
}
