import java.io.*;

public class SerializacionHija extends SerializacionPadre {

    public SerializacionHija(String nombre, String raza) {
        super(nombre, raza);
    }

    public static void main (String []args)throws IOException{

        ObjectInputStream in =null;
        ObjectOutputStream out = null;

        SerializacionPadre[] s = {new SerializacionPadre("canela", "labrador"), new SerializacionPadre("camba", "calleconbereda")};

        try{
            File f = new File("perros.txt");
            f.createNewFile();

            out = new ObjectOutputStream(new FileOutputStream(f));
            for (SerializacionPadre aux : s){
                out.writeObject(aux);
            }
            SerializacionPadre[] s2 = new SerializacionPadre[2];
            SerializacionPadre aux;

            in = new ObjectInputStream(new FileInputStream(f));
            
            for(int i = 0; i<2; i++){
                aux = (SerializacionPadre)in.readObject();
                System.out.println(aux);
            }

         }catch(Exception e){
            e.printStackTrace();
         }

    }
    
}
