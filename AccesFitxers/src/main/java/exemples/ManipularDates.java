package exemples;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ManipularDates {

	public ManipularDates() {
		
	}

	public static void main(String[] args) {
		long millis = 1759240000000L;

		LocalDateTime data = LocalDateTime.ofInstant(
		    Instant.ofEpochMilli(millis),
		    ZoneId.systemDefault()
		);

		System.out.println(data);
		
		long millisegons = data
		        .atZone(ZoneId.systemDefault())//se li pot passar una zona
		        //ZoneId.of("Europe/Madrid")
		        .toInstant()
		        .toEpochMilli();

	System.out.println(	millisegons);

	}

}
