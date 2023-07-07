import java.io.*;

public class LeerCaracteres {
public static void main (String [] args){
    try{
        File file = new File("MyFile.txt"); //creo la var de ref
        file.createNewFile(); //creo el archivo
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getCanonicalFile());
        System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		System.out.println(file.isDirectory());
		System.out.println(file.isHidden());
        file.renameTo(new File("rename.txt"));

    }catch(Exception e){e.printStackTrace();}

}    
}
