import java.util.*;
import java.io.*;
import java.net.*;
public class Client {
    public static void main(String[] args) throws Exception{
        System.out.println("Client started...");
        Socket soc = new Socket("localhost", 4564);
        ClientThread1 t1 = new ClientThread1(soc);
        ClientThread2 t2 = new ClientThread2(soc);
        t1.start();
        t2.start();
    }
}
