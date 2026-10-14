package exemples;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExempleDataInputOutStreams {

	public static void main(String[] args) {
		// Escriure dades a un fitxer, passant-li al constructor el buffer BufferedOutputStream
		//i el flux FileOutputStream

		try ( DataOutputStream dos = 
				new DataOutputStream( new BufferedOutputStream(new FileOutputStream("fitxers/dades.bin",true)))) {

			dos.writeInt(42);
			dos.writeDouble(3.1416);
			dos.writeBoolean(true);
			dos.writeUTF("Hola, món!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Llegir dades del fitxer passant-li el flux FileInputStream
		Integer x=null;
		Double y=null;
		Boolean b=null;
		String s=null;
		int reg=0;

		//també es pot utilitzar amb el buffer BufferInputStream
		try ( DataInputStream dis = new DataInputStream(new FileInputStream("fitxers/dades.bin"))) {
			while(dis.available()>0) {
				x = dis.readInt();
				y = dis.readDouble();
				b = dis.readBoolean();
				s = dis.readUTF();

				// Mostrar les dades llegides
				System.out.println("REGISTRE: "+ (reg++));
				System.out.println("Integer: x= " + x);
				System.out.println("Double: y= " + y);
				System.out.println("Boolean: b= " + b);
				System.out.println("String: s= " + s);
			}         

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

