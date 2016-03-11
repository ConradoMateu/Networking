
import java.net.*;
import java.util.*;
import java.io.*;

public class Ejercicio3 
{
  public static void main(String[] args) 
  {
   try{
    Socket s = new Socket("smtp.upv.es",25);
    PrintWriter out = new PrintWriter(s.getOutputStream());
    Scanner inserver = new Scanner (s.getInputStream());
    System.out.println(inserver.nextLine());
    s.close();
   }catch(UnknownHostException e) {
    System.out.println("Host desconocido!");
    System.out.println(e);
   }catch(IOException e) {
    System.out.println("No se puede conectar!");
    System.out.println(e);
   }
  }
}