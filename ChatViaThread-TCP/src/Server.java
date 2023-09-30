import java.util.*;
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("Waiting for the client...");
        ServerSocket ss = new ServerSocket(4564);
        Socket soc = ss.accept();
        System.out.println("Connection established...");
        while(true){
            ServerThread1 t1 = new ServerThread1(soc);
            ServerThread2 t2 = new ServerThread2(soc);
            t1.start();
            t2.start();
        }
    }
}
