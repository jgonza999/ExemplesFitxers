package exemples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EscriureLlegirObjectes {

	public static void main(String[] args) throws FileNotFoundException, IOException  {

		//Escrivim varis objectes al fitxer amb la mateixa instància d'ObjectOutputStream
		try (ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream("fitxers/persones.dat",true))) {

			oos.writeObject(new Persona("Maria", 20));
			oos.writeObject(new Persona("Joan", 21));
		}catch (IOException e) {
			e.printStackTrace();
		}


		//Llegim els objectes del fitxer
		try (ObjectInputStream ois =
				new ObjectInputStream(new FileInputStream("fitxers/persones.dat"))) {		

			try {
				while (true) {
					Persona p = (Persona) ois.readObject();
					System.out.println(p);
				}
			} catch (EOFException e) {
				// Final del fitxer
			}

		} catch (ClassNotFoundException|IOException e) {
			e.printStackTrace();
		} 		

		/*
		 * 
		 * // UTILITZANT BUFFER //Escrivim varis objectes al fitxer amb la mateixa
		 * //instància d'ObjectOutputStream try (ObjectOutputStream boos = new
		 * ObjectOutputStream(new BufferedOutputStream(new
		 * FileOutputStream("fitxers/personesBuffer.dat",true)))) {
		 * 
		 * boos.writeObject(new Persona("Maria", 20)); boos.writeObject(new
		 * Persona("Joan", 21)); }catch (IOException e) { e.printStackTrace(); }
		 * 
		 * 
		 * //Llegim els objectes del fitxer try (ObjectInputStream ois = new
		 * ObjectInputStream(new BufferedInputStream(new
		 * FileInputStream("fitxers/personesBuffer.dat")))) {
		 * 
		 * try { while (true) { Persona p = (Persona) ois.readObject();
		 * System.out.println(p); }
		 * 
		 * } catch (EOFException e) { // Final del fitxer }
		 * 
		 * } catch (ClassNotFoundException|IOException e) { e.printStackTrace(); } }
		 */

	}	
}
