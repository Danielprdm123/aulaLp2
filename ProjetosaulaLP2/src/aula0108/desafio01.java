package aula0108;

public class desafio01 {
	public static void main(String[] args) {
		int [][] matriz = new int [5][5];
		long inicio = System.currentTimeMillis();
		System.out.println("Tempo inicial = " + inicio);
		for (int i=0; i< matriz.length;i++) {
			for(int j = 0;j<matriz.length;j++) {
				int pegaval = (int) ((int) 1 + (Math.random() * 26));
				int per =0;
				while(per < matriz.length) {
					if(matriz[i][per] == pegaval) {
						 pegaval = (int) ((int) 1 + (Math.random() * 26));
						 per =0;
					}
					per++;
				}
				matriz[i][j] = pegaval;
			}
		}
	 	

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
 long tempfinal = System.currentTimeMillis();
	System.out.println("Tempo final = " + inicio);
	System.out.println(tempfinal - inicio);
	
	}
}
