
public class ejer1 extends Thread
{
   int id;
   public ejer1(int i)
   {
     
       id = i;
    
   }
    
   public void run()
   {
      try{
      
        System.out.println(id);
      
     }catch(Exception e){System.err.println(e);}
    
   }
   
   public static void main (String args[])
   {
    for(int j = 0; j<10; j++){
     ejer1 e = new ejer1(j);
     e.start();
     System.out.println("Creado y Ejecutado " + j );
    }
   }
}


