package exemples.serialitzaciojson;

import java.io.IOException;
import java.io.File;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerialitzacioJSON {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();

		Persona p = new Persona("Anna", 20);

		String json;
		try {
			//PASSAR D'OBJECTE A JSON EN STRING
			json = mapper.writeValueAsString(p);
			System.out.println(json);


		} catch (JsonProcessingException e) {

			e.printStackTrace();
		} 

		try {
			//PASSAR D'OBJECTE JAVA A JSON EN FITXER
			mapper.writeValue(new File("fitxers/persona.json"), p);
			System.out.println("Objecte desat correctament.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}
