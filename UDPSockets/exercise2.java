import java.net.*;
import java.util.*;
import java.io.*;

public class exercise2
{
   public static void main(String []args) throws Exception
   {    
       InetAddress[] listaIps = InetAddress.getAllByName("www.hotmail.com");
       System.out.println(Arrays.toString(listaIps));
       
   }
}
