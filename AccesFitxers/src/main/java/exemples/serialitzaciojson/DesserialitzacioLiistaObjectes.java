package exemples.serialitzaciojson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.io.File;
import java.io.IOException;

public class DesserialitzacioLiistaObjectes {



	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		File fitxer = new File("fitxers/personesArray.json");
		try {
			List<Persona> recuperades =
					mapper.readValue(fitxer,
							new TypeReference<List<Persona>>() {}
							);

			//  Mostrar les persones recuperades
			System.out.println("\nPersones recuperades:");

			for (Persona p : recuperades) {
				System.out.println(p);
			}

		} catch (IOException e) {
			System.out.println("Error en llegir el fitxer: "
					+ e.getMessage());
		}
	}
}