import java.util.Scanner;

	public class Contador {
	    static class ParametrosInvalidosException extends Exception {
	        public ParametrosInvalidosException(String message) {
	            super(message);
	        }
	    }
	    
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
			
		System.out.println("Digite o primeiro número: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo número: ");
		int parametroDois = terminal.nextInt();
		
	try {		
		contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
				System.err.println("Erro: " + exception.getMessage());
		}
	}
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
			if(parametroDois <= parametroUm) {
				throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
			}			
			
			int contagem = parametroDois - parametroUm;
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número" + i);
			}
		}

}