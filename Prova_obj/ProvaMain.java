import java.util.Scanner;
public class ProvaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		Prova provinha = new Prova();
		
		System.out.print("Informe o tamano da cadeia: ");
		int tam = input.nextInt();
		
		String [] original = new String [tam];
		
		for(int i = 0; i < tam; i++) {
			System.out.print("Informe o "+(i+1)+"º valor.");
			original [i] = input.next();
		
		}
		provinha.setOriginal(original);
		provinha.setTam(tam);
		
		System.out.println(provinha.mostraValor(original, tam));
		System.out.println(provinha.mudaValor(original, tam));
		
		input.close();
	}
	
}
