
import java.net.*;
import java.util.*;
import java.io.*;

public class exercise6
{
    public static void main(String []args) throws Exception
    {
        Date now = new Date();
        String name = new String(now.toString()+"\n");
               
        byte[] buffer = new byte[1000];
        DatagramPacket p = new DatagramPacket(buffer, 1000);
        DatagramSocket ds = new DatagramSocket(7777);
        ds.receive(p);
        p.setData(name.getBytes());
        ds.send(p);
           
    }
}