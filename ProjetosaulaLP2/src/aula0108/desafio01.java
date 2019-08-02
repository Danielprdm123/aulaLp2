package aula0108;

public class desafio01 {
	public static boolean Veri (int matriz[][],int pegaval ) {
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz.length;j++) {
				if(pegaval == matriz[i][j])
					return false;
			}
		}
		return true;
	}
	public static void Print(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
	}
	
	
	
	public static void main(String[] args) {
		int [][] matriz = new int [5][5];
		long inicio = System.currentTimeMillis();
		System.out.println("Tempo inicial = " + inicio);
		for (int i=0; i< matriz.length;i++) {
			for(int j = 0;j<matriz.length;j++) {
				int pegaval = (int) ((int) 1 + (Math.random() * 26));
				while(Veri (matriz,pegaval) == false) {
					pegaval = (int) ((int) 1 + (Math.random() * 26));
				}
				matriz[i][j] = pegaval;
			}
		}
		Print(matriz);
    long tempfinal = System.currentTimeMillis();
	System.out.println("Tempo final = " + inicio);
	System.out.println(tempfinal - inicio);
	
	}
}
