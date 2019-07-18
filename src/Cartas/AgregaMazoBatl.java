package Cartas;

import java.io.*;
import java.util.ArrayList;

public class AgregaMazoBatl {
             

    public ArrayList<String> selectCarta= new ArrayList<>();
    public void buscar(String nombre) {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
         try {
         
         archivo = new File (nombre+".txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         
         while((linea=br.readLine())!=null){
               
             String[] carta=linea.split("\\.");
            this.selectCarta.add(carta[0]);
             
           
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
        
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
          
         }
      }
    }

}
