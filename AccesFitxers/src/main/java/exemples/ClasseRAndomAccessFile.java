package exemples;

	import java.io.*;
import java.util.Iterator;

	public class ClasseRAndomAccessFile {
	    public static void main(String[] args) {
	        try(RandomAccessFile raf = new RandomAccessFile("fitxers/exempleRandom.dat", "rw")) { //fitxer obert per lectura i escriptura                      
	            //buidar fitxer
	        	raf.setLength(0L);
	        raf.writeBoolean(false);
					/*
					 * // Escriure dades raf.writeUTF("Hola"); raf.writeInt(123);
					 */
	            
	            System.out.println("Mida fitxer: " + raf.length());

				/*
				 * 
				 * // Llegir dades en el mateix ordre d'escriptura raf.seek(0); String text =
				 * raf.readUTF();
				 * 
				 * int num = raf.readInt();
				 * 
				 * System.out.println("text: " + text); System.out.println("num: " + num);
				 * 
				 * 
				 * // Tornar al principi raf.seek(6); //sobreescriure el valor enter
				 * //raf.writeInt(888888); raf.writeChar('H');
				 * 
				 * // Llegir dades en el mateix ordre d'escriptura raf.seek(0); text =
				 * raf.readUTF();
				 * 
				 * // num = raf.readInt(); char c=raf.readChar();
				 * 
				 * System.out.println("text: " + text); System.out.println("num: " + num);
				 * System.out.println("c: "+ c);
				 * 
				 */
				
	       } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}



