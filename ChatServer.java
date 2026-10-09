import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws IOException{
        try{
        ServerSocket ss =new ServerSocket(1234);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str="";
        String str2="";

        while(!str.equals("stop")){
            str = din.readUTF();
            System.out.println("Rushikesh's Messeage: "+str);
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
    
      ss.close();   
      s.close();
      din.close();
      dout.close();

    }catch(Exception e){
        System.out.println(e);
    }
}
}