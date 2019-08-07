package aula0208;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class desafio02 {
	public static void main(String[] args) {
	
		LocalDateTime hora = LocalDateTime.now();
	     ZoneId brasil = ZoneId.of("America/Sao_Paulo");
	     ZonedDateTime horabrasil = ZonedDateTime.of(hora, brasil);
	   
	 
	     ZoneId europa = ZoneId.of("Europe/Madrid");
	     ZonedDateTime europahora = ZonedDateTime.of(hora, europa);
	     
	 
	     Duration duracao = Duration.between( europahora,horabrasil);
	     System.out.println("Diferença em segundos " + duracao.getSeconds() );
	     System.out.println("Diferença em horas: " + duracao.toHours() );

}
	
}
