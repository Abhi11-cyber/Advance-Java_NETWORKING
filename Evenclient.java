import java.io.*;
import java.net.*;
public class Evenclient {
    public static void main(String[] args) throws IOException {
        try{
            Socket s = new Socket("Localhost",53);
            System.out.print("Enter your messeage: ");
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             String Msg = br.readLine();
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());        
            dout.writeBytes(Msg);
            dout.flush();
            dout.close();
            s.close();
}
        catch(Exception e){
            System.out.println(e);
        }
    }
}
 
