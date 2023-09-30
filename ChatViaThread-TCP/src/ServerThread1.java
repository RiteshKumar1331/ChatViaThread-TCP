import java.net.*;
import java.io.*;
import java.util.*;
public class ServerThread1 extends Thread{
    Socket sct;
    ServerThread1(Socket socket){
        sct = socket;
    }
    public void run(){
//        System.out.println("ServerThread1 starts...");
        Scanner sc = new Scanner(System.in);
        try{
            while(true){
                DataOutputStream out = new DataOutputStream(sct.getOutputStream());
                String str = sc.nextLine();
                System.out.println("Server: "+ str);
                out.writeBytes(str+ '\n');
            }
        }catch (Exception e){
//            System.out.println("Exception "+ e);
        }
    }
}
