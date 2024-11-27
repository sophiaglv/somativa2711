package somativa;

public class Atendimento implements Lesao{
	
	 public void registrarProgresso(String progresso) {
	        // lógica para registrar o progresso do tratamento
	        System.out.println("Progresso registrado: " + progresso);
	        this.tratamento += "\n" + progresso;  // adiciona ao historico do tratamento.
	    }

}
