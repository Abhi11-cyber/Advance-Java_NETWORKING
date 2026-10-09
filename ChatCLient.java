import java.io.*;
import java.net.*;
public class ChatCLient {
    public static void main(String[] args) throws IOException {

      try{  
        Socket s = new Socket("localhost",1234);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String str="",str2="";
        while(!str2.equals("stop")){
            str = br.readLine();
            dout.writeUTF(str);
            str2=din.readUTF();
            System.out.println("Server's Messeage: "+str2);
            dout.flush();

        }

        din.close();
        s.close();
        dout.close();
    }catch(Exception e){
        System.out.println(e);
    }
}
}
