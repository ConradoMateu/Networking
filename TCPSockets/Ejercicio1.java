import java.net.*;
import java.util.*;
import java.io.*;

public class Ejercicio1 
{
  public static void main(String[] args) throws Exception
  {
    Socket s = new Socket("www.upv.es",80);
    System.out.println("Conectado!");
    s.close();
    System.out.println("Desconectado!");
  }
   
}
