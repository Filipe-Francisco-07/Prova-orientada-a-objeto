
public class Prova {
	
	private int tam;
	private String[] original;
	
	public int getTam() {
		return tam;
	}
	public void setTam(int tam) {
		this.tam = tam;
	}
	public String[] getOriginal() {
		return original;
	}
	public void setOriginal(String[] original) {
		this.original = original;
	}
	
	public String mostraValor(String[] original , int tam) {
		this.tam = tam;
		this.original = original;
		
		int A = 0;
		int T = 0;
		int G = 0;
		int C = 0;
		
		StringBuilder output = new StringBuilder();
		
		output.append("\nValor inicial: \n");
		
		for(int i = 0; i < tam; i++) {
			System.out.println(original[i]);
			if(original[i].equalsIgnoreCase("A")){
				A++;
			}else if(original[i].equalsIgnoreCase("T")){
				T++;
			}else if(original[i].equalsIgnoreCase("G")){
				G++;
			}else{
				C++;
			}
			output.append(original[i]);
		}
		output.append("\nLetras A: "+A);
		output.append("\nLetras T: "+T);
		output.append("\nLetras G: "+G);
		output.append("\nLetras C: "+C);
		return output.toString();
	}
	
	public String mudaValor(String[] original , int tam) {
		this.tam = tam;
		this.original = original;
		
		String [] altera = new String[tam];
		
		StringBuilder output2 = new StringBuilder();
		
		int A = 0;
		int U = 0;
		int G = 0;
		int C = 0;
		
		output2.append("\nValor Alterado: \n");
		
		for(int i = 0; i < tam; i++) {
			if(original[i].equalsIgnoreCase("A")) {
				altera[i] = "U";
				U++;
			}else if(original[i].equalsIgnoreCase("T")) {
				altera[i]="A";
				A++;
			}else if(original[i].equalsIgnoreCase("G")) {
				altera[i]="C";
				C++;
			}else{
				altera[i]= "G";
				G++;
			}
			output2.append(altera[i]);
		}
		output2.append("\nLetras A: "+A);
		output2.append("\nLetras U: "+U);
		output2.append("\nLetras G: "+G);
		output2.append("\nLetras C: "+C);
		return output2.toString();
	}
	
}
