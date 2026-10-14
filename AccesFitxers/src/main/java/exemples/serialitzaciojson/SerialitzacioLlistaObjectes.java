package exemples.serialitzaciojson;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SerialitzacioLlistaObjectes {

		public static void main(String[] args) {
			 ObjectMapper mapper = new ObjectMapper();

		        List<Persona> persones = new ArrayList<>();

		        persones.add(new Persona("Anna", 20));
		        persones.add(new Persona("Joan", 25));

		        try {
		           // mapper.writeValue(new File("fitxers/personesArray.json"), persones);
		            //JSON AMB FORMAT:
		          mapper.writerWithDefaultPrettyPrinter().writeValue(new File("fitxers/personesArray.json"), persones);

		            System.out.println("Persones desades correctament.");

		        } catch (IOException e) {
		            e.printStackTrace();
		        }
	}

}
