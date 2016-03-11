public class ejer2 extends Thread
{
   int id;
   public ejer2(int i)
   {
     
       id = i;
    
   }
    
   public void run()
   {
      try{
        sleep(150);
        System.out.println(id);      
     }catch(Exception e){System.err.println(e);}
    
   }
   
   public static void main (String args[])
   {
    for(int j = 0; j<10; j++){
     ejer2 e = new ejer2(j);
     e.start();
     System.out.println("Creado y Ejecutado " + j );
    }
   }
}

