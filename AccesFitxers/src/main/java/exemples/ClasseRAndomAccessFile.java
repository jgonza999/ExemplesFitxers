package exemples;

	import java.io.*;
import java.util.Iterator;

	public class ClasseRAndomAccessFile {
	    public static void main(String[] args) {
	        try(RandomAccessFile raf = new RandomAccessFile("fitxers/exempleRandom.dat", "rw")) { //fitxer obert per lectura i escriptura                      
	            // Escriure dades
	            raf.writeUTF("Hola");
	            raf.writeInt(123);
	            
	            System.out.println("Mida fitxer: " + raf.length());

	            // Tornar al principi
	            raf.seek(0);

	            // Llegir dades en el mateix ordre d'escriptura
	            String text = raf.readUTF();
	            int num = raf.readInt();

	            System.out.println("text: " + text);
	            System.out.println("num: " + num);

	            // Escriure en una posició específica (per exemple, després de la primera cadena)
	            
	            System.out.println("posició punter: " + raf.getFilePointer());
	            raf.seek(raf.length()-10L); 
	            System.out.println("posició punter: " + raf.getFilePointer());
	            raf.writeInt(44444);
	            // Tornar al principi
	            raf.seek(0);

	            // Llegir dades en el mateix ordre d'escriptura
	            text = raf.readUTF();
	            int num2 = raf.readInt();
	            System.out.println("text: " + text);
	            System.out.println("num2: " + num2);

	       } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}



