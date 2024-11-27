package somativa;

public class LesaoArticular extends LesaoEsportiva implements Lesao{
	private String articulacao;

	public LesaoArticular(String nome, String sintomas, String gravidade, Esporte esporte, String articulacao) {
		super(nome, sintomas, gravidade, esporte);
		this.articulacao = articulacao;
	}

	public String getArticulacao() {
		return articulacao;
	}

	public void setArticulacao(String articulacao) {
		this.articulacao = articulacao;
	}
	
	@Override
	public void recomendarTratamento() {
		System.out.println("Medicamentos: Analgésicos, anti-inflamatórios, antibióticos e, em alguns casos, medicamentos que precisam ser tomados por toda a vida \r\n"
				+ "Fisioterapia: Exercícios de fortalecimento muscular, alongamentos e técnicas de mobilização articular \r\n"
				+ "Massagem: Para aliviar a dor e reduzir a inflamação \r\n"
				+ "Compressas: Frias ou quentes \r\n"
				+ "Repouso: Suspender a prática esportiva ou de atividades pesadas \r\n"
				+ "Elevar o membro: Para diminuir o inchaço \r\n"
				+ "Imobilização: Do local da lesão \r\n"
				+ "Cirurgia: Em casos graves");
	}
	
	@Override
	public void registrarProgresso(String progresso) {
		System.out.println("Registrar progresso: " + progresso);
		
	}
	
	public String diagnosticar() {
		return ("Diagnóstico: " + sintomas  + " Gravidade: " + gravidade + "Esporte praticado: " + esporte);
	}
}
