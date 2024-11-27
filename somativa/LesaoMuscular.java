package somativa;

public class LesaoMuscular extends LesaoEsportiva implements Lesao{
	private String musculo;

	public LesaoMuscular(String nome, String sintomas, String gravidade, Esporte esporte, String musculo) {
		super(nome, sintomas, gravidade, esporte);
		this.musculo = musculo;
	}

	public String getMusculo() {
		return musculo;
	}

	public void setMusculo(String musculo) {
		this.musculo = musculo;
	}
	
	public void recomendarTratamento() {
		System.out.println("Repouso: Para permitir a cicatrização do músculo \r\n"
				+ "Gelo: Aplicar no local da lesão de 2 em 2 horas para reduzir a inflamação e aliviar a dor \r\n"
				+ "Compressão: Para evitar inchaço \r\n"
				+ "Elevação: Elevar o membro afetado acima do nível do coração \r\n"
				+ "Analgésicos e anti-inflamatórios: Para controlar a dor e a inflamação \r\n"
				+ "Fisioterapia: Para recuperar a força e flexibilidade \r\n"
				+ "Ultrassom: Para acelerar a cicatrização e diminuir a cicatriz fibrótica \r\n"
				+ "Injeções de corticóides: Para aliviar a dor e reduzir o inchaço, mas podem atrasar a cura \r\n"
				+ "PRP: Plasma rico em plaquetas, que pode acelerar a cicatrização");
	}

	@Override
	public void registrarProgresso(String progresso) {
		System.out.println("Registrar progresso: " + progresso);
		
	}
	
	public String diagnosticar() {
		return ("Diagnóstico: " + sintomas  + " Gravidade: " + gravidade + "Esporte praticado: " + esporte);
	}
	
}
