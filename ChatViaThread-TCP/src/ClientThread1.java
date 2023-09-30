import java.net.*;
import java.io.*;
import java.util.*;
import static java.lang.System.exit;
public class ClientThread1 extends Thread{
    Socket sct;
    ClientThread1(Socket socket){
        sct = socket;
    }
    public void run(){
        System.out.println("ClientThread1 starts...");
        Scanner sc = new Scanner(System.in);
        try{
            while(true){
                DataOutputStream out = new DataOutputStream(sct.getOutputStream());
                String str = sc.nextLine();
                System.out.println("Client: "+ str);
                String stop = "EXIT";
                if(str.equals(stop))
                    exit(0);
                else
                    out.writeBytes(str+ '\n');
            }
        }catch (Exception e){
//            System.out.println("Exception: "+ e);
        }
    }
}
