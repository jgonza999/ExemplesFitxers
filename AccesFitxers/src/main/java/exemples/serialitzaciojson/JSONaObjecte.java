package exemples.serialitzaciojson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONaObjecte {



	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();

		String json = "{\"nom\":\"Anna\",\"edat\":20}";

		Persona p;
		try {
			//PASSAR DE JSON EN STRING A OBJECTE JAVA 
			p = mapper.readValue(json, Persona.class);
			System.out.println(p);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		} 

		try {
			//PASSAR DE JSON EN FITXER A OBJECTE JAVA 
			p = mapper.readValue(new File("fitxers/persona.json"), Persona.class);
			System.out.println("Objecte llegit correctament.");
			System.out.println(p);
		} catch (IOException e) {

			e.printStackTrace();
		} 

	}
}
