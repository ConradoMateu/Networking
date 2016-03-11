
import java.net.*;
import java.util.*;
import java.io.*;

public class exercise5
{
    public static void main(String []args) throws Exception
    {
        String name = new String("Prueba envio datagrama\n");
        DatagramPacket dp = new DatagramPacket(name.getBytes(),name.getBytes().length, InetAddress.getByName("localhost"),7777);      
        byte[] buffer = new byte[200];
        DatagramPacket p = new DatagramPacket(buffer, 200);
        DatagramSocket ds = new DatagramSocket();
        ds.send(dp);                        //Envia Datagrama
        ds.receive(p);                      //Espera recibir Datagrama
        String s = new String(p.getData(),0,p.getLength());
        System.out.println(s);              //Imprime Datagrama recibido  
    }
}
