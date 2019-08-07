package aula0208;

import java.time.Duration;
import java.time.Instant;

public class aula {
	public static void Print(int matriz[][]) {
		Instant inicio = Instant.now();
		
		try {
			Thread.sleep(1000); // fazer processador esperar
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Instant fim = Instant.now();
		Duration duracao = Duration.between(inicio, fim);
		System.out.println("Dura��o em nanos segundos" + duracao.toNanos());
		System.out.println("Dura��o em minutos" + duracao.toMinutes());
		System.out.println("Dura��o em horas" + duracao.toHours());
		System.out.println("Dura��o em milissegundos" + duracao.toMillis());
		System.out.println("Dura��o em dias" + duracao.toDays());
	}
	

}
