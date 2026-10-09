import java.net.*;

public class inet {
    public static void main(String[] args)throws UnknownHostException
    {
        InetAddress i = InetAddress.getLocalHost(); //factory method which is static and return object of class
        System.out.println(i);
        System.out.println("Hostname:"+i.getHostName());
        System.out.println("Address:"+i.getHostAddress());
        i=InetAddress.getByName("figma.com");
        System.out.println(i);
        System.out.println("Multicast : "+i.isMulticastAddress());
        InetAddress[] I = InetAddress.getAllByName("figma.com");

        /*for(int j =0; j<I.lenght ; j++){
        System.out.println(I[j]);
        }*/
    }
}
