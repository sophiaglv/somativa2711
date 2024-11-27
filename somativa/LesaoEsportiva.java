package somativa;

abstract class LesaoEsportiva{
	   private String nome;
	   protected String sintomas;
	   protected String gravidade;
	   protected Esporte esporte;
	   

	    public LesaoEsportiva(String nome, String sintomas, String gravidade, Esporte esporte) {
	        this.nome = nome;
	        this.sintomas = sintomas;
	        this.gravidade = gravidade;
	        this.esporte = esporte;
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getSintomas() {
			return sintomas;
		}
		
		public void setSintomas(String sintomas) {
			this.sintomas = sintomas;
		}
		
		public String getGravidade() {
			return gravidade;
		}
		
		public void setGravidade(String gravidade) {
			this.gravidade = gravidade;
		}

		public Esporte getEsporte() {
			return esporte;
		}

		public void setEsporte(Esporte esporte) {
			this.esporte = esporte;
		}

		
}

