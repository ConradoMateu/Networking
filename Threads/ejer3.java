import java.net.*;
import java.io.*;
import java.util.*;

public class ejer3 extends Thread
{
 Socket id;
 
 public ejer3(Socket s){id = s;}
 
 public void run(){
     try{
         PrintWriter salida = new PrintWriter(id.getOutputStream(), true);
         Scanner entrada = new Scanner(id.getInputStream());
         String out;
         do{
             out = entrada.nextLine();
             salida.println(out);
             sleep(100);
             
            }while(!out.equals("QUIT"));
         salida.close();
         entrada.close();
         //id.close();
         
        }catch(Exception e){}
    }
    
 public static void main(String args[]) throws IOException{
     ServerSocket ss = new ServerSocket(8888);
     while(true){
         Socket s = ss.accept();
         ejer3 t = new ejer3(s);
         t.start(); 
        }
      
    }
   
}
