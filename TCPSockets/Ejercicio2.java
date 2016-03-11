import java.net.*;
import java.util.*;
import java.io.*;

public class Ejercicio2 
{
  public static void main(String[] args) 
  {
   try{
    Socket s = new Socket("www.upv.es",80);
    System.out.println("Vuelto a conectar!");
    s.close();
    System.out.println("Desconectado!");
   }catch(UnknownHostException e) {
    System.out.println("Host desconocido!");
    System.out.println(e);
   }catch(IOException e) {
    System.out.println("No se puede conectar!");
    System.out.println(e);
   }
  }
}
