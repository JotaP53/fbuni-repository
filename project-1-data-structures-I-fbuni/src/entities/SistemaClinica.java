package entities;

public class SistemaClinica {
	 	private FilaAtendimento filaAtendimento;
	    private Paciente[] pacientesCadastrados;
	    private int totalPacientes;
	    private final int capacidade;
	    
	    public SistemaClinica(int capacidade) {
	        this.capacidade = capacidade;
	        this.setFilaAtendimento(new FilaAtendimento(capacidade));
	        this.setPacientesCadastrados(new Paciente[capacidade]);
	        this.totalPacientes = 0;
	    }
	    
	   public void cadastrarPaciente(String nome, String motivo) {
	        if (totalPacientes >= capacidade) return;
	        Paciente novoPaciente = new Paciente(nome, motivo);
	        getPacientesCadastrados()[totalPacientes++] = novoPaciente;
	    }
	    
	    public int tamanhoEspera() {
	        return totalPacientes;
	    }
	    
	    public void visualizarPacientesCadastrados() {
	        for (int i = 0; i < totalPacientes; i++) {
	            System.out.println((i + 1) + ". " + getPacientesCadastrados()[i].toString());
	        }
	    }

		public FilaAtendimento getFilaAtendimento() {
			return filaAtendimento;
		}

		public void setFilaAtendimento(FilaAtendimento filaAtendimento) {
			this.filaAtendimento = filaAtendimento;
		}

		public Paciente[] getPacientesCadastrados() {
			return pacientesCadastrados;
		}

		public void setPacientesCadastrados(Paciente[] pacientesCadastrados) {
			this.pacientesCadastrados = pacientesCadastrados;
		}
}