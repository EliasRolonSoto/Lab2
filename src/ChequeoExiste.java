import java.io.*;


public class ChequeoExiste implements Serializable {
public static void main (String[]args)throws Exception{
    try{
        boolean newFile = false;
        File file = new File("filewrite.txt"); //creo la variable de ref a "filewrite.txt"
        
        System.out.println(file.exists()); //comprueba si existe el archivo

        newFile = file.createNewFile(); //crea el archivo
        System.out.println(newFile); //existe?
        System.out.println(file.exists()); //vuelve a chequear si el archivo existe
    }catch(IOException e){

    }
    
    
    
    }
}    

