import java.net.*;
import java.util.*;
import java.io.*;

public class Ejercicio7 
{
  public static void main(String[] args)
  {
   try{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce nombre del servidor: ");
    String serv = scanner.nextLine();
    System.out.println("Introduce puerto de escucha: ");
    int port = scanner.nextInt();
    Socket s = new Socket(serv, port);
    PrintWriter out = new PrintWriter(s.getOutputStream());
    Scanner inserver = new Scanner (s.getInputStream());
    System.out.println("Puerto Local: " + s.getLocalPort());
    System.out.println("Puerto Remoto: " + s.getPort());
    System.out.println("IP Remota: " + s.getInetAddress().getHostAddress());
  
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