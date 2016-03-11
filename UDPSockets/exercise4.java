
import java.net.*;
import java.util.*;
import java.io.*;

public class exercise4
{
    public static void main(String []args) throws Exception
    {
        String name = new String("Name to send");
        //rdc00.redes.upv.es
        DatagramPacket dp = new DatagramPacket(name.getBytes(),name.getBytes().length, InetAddress.getByName("localhost"),7777);
        
    
    
    }
}
