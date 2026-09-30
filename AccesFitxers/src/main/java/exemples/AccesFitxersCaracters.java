package exemples;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AccesFitxersCaracters {


	 public static void main(String[] args) {
		 
		 //Obrim un flux d'escriptura de caràcters
	        try ( FileWriter fw = new FileWriter("fitxers/caracters1.txt", true)) {
	            fw.write("Hola Món!");
	            fw.write(700); //interpreta el caràcter correponen a Unicode
	            fw.write('w');
	            fw.write('\n');  //salt de línia   

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	        
	        
	    // Obrim un flux de lectura de caràcters
	        try ( FileReader fw = new FileReader("fitxers/caracters1.txt")) {

	            StringBuilder cad = new StringBuilder();
	            int llegit;
	            while (-1 != (llegit = fw.read())) {
	                cad.append((char) llegit);
	            }
	            System.out.println("caracters1.txt:\n" + cad.toString());

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }
	}