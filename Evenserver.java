import java.io.*;
import java.net.*;
public class Evenserver {
    public static void main(String[] args) throws IOException {
        try{
            ServerSocket ss = new ServerSocket(53);
            Socket s =ss.accept();
             BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
             //DataInputStream reader=new DataInputStream(s.getInputStream());           
            String str = reader.readLine();
            System.out.println("Client's Messege: "+str);
              ss.close();
              s.close();
          }catch(Exception e){
            System.out.println(e);
          }
        }
}