package somativa;

public class LesaoOssea extends LesaoEsportiva implements Lesao{
	private String tipoOsso;

	public LesaoOssea(String nome, String sintomas, String gravidade, Esporte esporte, String tipoOsso) {
		super(nome, sintomas, gravidade, esporte);
		this.tipoOsso = tipoOsso;
	}

	public String getTipoOsso() {
		return tipoOsso;
	}

	public void setTipoOsso(String tipoOsso) {
		this.tipoOsso = tipoOsso;
	}
	
	public void recomendarTratamento() {
		System.out.println("Imobilização: Para fraturas simples e estáveis, a imobilização com gesso, tala, órtese ou bota de caminhada permite a cicatrização. O tempo de imobilização varia de acordo com a gravidade da fratura. \r\n"
				+ "Redução fechada: Para fraturas desalinhadas ou instáveis, pode ser necessário realinhar os ossos fraturados. \r\n"
				+ "Cirurgia: Para fraturas mais complexas, como fraturas expostas, fraturas quebradas em múltiplos fragmentos, ou fraturas que afetam articulações. \r\n"
				+ "Medicamentos: Para ajudar no controle da dor e reduzir o risco de infecção. \r\n"
				+ "PRICE: Proteção, repouso, gelo, compressão e elevação. \r\n"
				+ "Dieta: Uma dieta rica em cálcio, vitamina D e proteínas pode ajudar a curar contusões ósseas mais rapidamente.");
	}
	@Override
	public void registrarProgresso(String progresso) {
		System.out.println("Registrar progresso: " + progresso);
		
	}
	
	public String diagnosticar() {
		return ("Diagnóstico: " + sintomas  + " Gravidade: " + gravidade + "Esporte praticado: " + esporte);
	}
}
