import java.net.*;
import java.io.*;
import java.util.*;

public class ServidorTCP {
    
    public static void ej1(){
       try{
            ServerSocket ss = new ServerSocket(7777);

            Socket s = ss.accept();
            
            PrintWriter salida=new PrintWriter(s.getOutputStream(),true);
            salida.println("Se ha conectado un cliente al servidor");
            
            s.close();

        }catch(IOException e) { 
            System.out.println(e); 
        }        
        
    }
    
    public static void ej2a(){
       try{
            ServerSocket ss = new ServerSocket(7777);
            
            Socket s = ss.accept();
            
            PrintWriter salida = new PrintWriter(s.getOutputStream(),true);
            Calendar now = Calendar.getInstance();
            int hour = now.get(Calendar.HOUR_OF_DAY);
            int min = now.get(Calendar.MINUTE);
            int seg = now.get(Calendar.SECOND);
            
            salida.println(hour + ":" + min + ":" + seg);
            
            s.close();             
        }catch(IOException e) { System.out.println(e); }        
        
    }    
    
    public static void ej2b(){
       try{
            ServerSocket ss = new ServerSocket(7777);
            while(true){                
                Socket s = ss.accept();
                
                PrintWriter salida = new PrintWriter(s.getOutputStream(),true);
                Calendar now = Calendar.getInstance();
                int hour = now.get(Calendar.HOUR_OF_DAY);
                int min = now.get(Calendar.MINUTE);
                int seg = now.get(Calendar.SECOND);
                
                salida.println(hour + ":" + min + ":" + seg);            
                
                s.close();
            }
       }catch(IOException e) { System.out.println(e); }        
        
    } 
    
    public static void ej3(){
       try{
            ServerSocket ss = new ServerSocket(7777);
            while(true){                
                Socket s = ss.accept();
                
                Scanner entrada = new Scanner(s.getInputStream());
                String cabecera = entrada.nextLine();
                
                PrintWriter salida = new PrintWriter(s.getOutputStream(),true);
                salida.println("HTTP/1.0 200 OK\r\n");   
                salida.println("<html><body>Cabecera sin tocar <br/><br/>" + cabecera + "</body></html>");
                s.close();
            }
       }catch(IOException e) { System.out.println(e); }        
        
    }
    
    public static void ej4a(){
       try{            
            ServerSocket ss = new ServerSocket(7777);
            while(true){                
                Socket s = ss.accept();

                Socket smtp = new Socket("smtp.upv.es", 25);
                
                PrintWriter salida = new PrintWriter(smtp.getOutputStream());
                salida.printf("HELO prueba@upv.es");
                salida.flush();
                salida.printf("MAIL FROM: prueba@practicaredes.es");
                salida.flush();
                salida.printf("RCPT TO: fracacan@upv.es");
                salida.flush();
                salida.printf("DATA");
                salida.flush();
                salida.printf("Subject: Esto es una prueba");
                salida.flush();
                salida.printf("From: prueba@practicaredes.es");
                salida.flush();                
                salida.printf("To: fracacan@upv.es");
                salida.flush();                
                salida.printf("\n");
                salida.flush();                
                salida.printf("Prueba\n\n.");
                salida.flush();                
                salida.printf("quit");
                salida.flush();

                s.close();
            }
       }catch(IOException e) { System.out.println(e); }        
        
    }
    
    public static void ej4b(){
       try{
            ServerSocket ss = new ServerSocket(7777);
            while(true){                
                Socket s = ss.accept();
                
                Scanner entrada = new Scanner(s.getInputStream());
                String cabecera = entrada.nextLine();
                
                PrintWriter salida = new PrintWriter(s.getOutputStream(),true);
                salida.println("HTTP/1.0 200 OK\r\n");   
                salida.println("<html><body>Cabecera sin tocar <br/><br/>" + cabecera + "</body></html>");
                s.close();
            }
       }catch(IOException e) { System.out.println(e); }        
        
    }    
}