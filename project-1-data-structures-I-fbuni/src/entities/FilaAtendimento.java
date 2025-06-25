package entities;

public class FilaAtendimento {
	private Paciente[] filaEspera;
	private Paciente[] filaHistorico;
	private int tamanhoEspera;
	private int tamanhoHistorico;
	private final int capacidade;

	public FilaAtendimento(int capacidade) {
		this.capacidade = capacidade;
		this.filaEspera = new Paciente[capacidade];
		this.filaHistorico = new Paciente[capacidade];
		this.tamanhoEspera = 0;
		this.tamanhoHistorico = 0;
	}
//
	public void adicionarPaciente(Paciente paciente, int posicao) {
		if (tamanhoHistorico == 0 || posicao < 0 || posicao > tamanhoEspera) {
			System.out.println("Operação inválida: não há pacientes no histórico ou posição inválida.");
			return;
		}

		for (int i = 0; i < tamanhoEspera; i++) {
			if (filaEspera[i].equals(paciente)) {
				System.out.println("Paciente já está na fila de espera.");
				return;
			}
		}

		for (int i = 0; i < tamanhoHistorico; i++) {
			if (filaHistorico[i].equals(paciente)) {
				System.out.println("Para adicionar um paciente que já foi atendido, use a opção 6.");
				return;
			}
		}

		for (int i = tamanhoEspera; i > posicao; i--) {
			filaEspera[i] = filaEspera[i - 1];
		}
		filaEspera[posicao] = paciente;
		tamanhoEspera++;
		System.out.println("Paciente adicionado à fila!");
	}

	public void adicionarPacienteNaProximaPosicao(Paciente paciente) {
		if (tamanhoEspera >= capacidade) {
			System.out.println("Fila de espera está cheia!");
		}
		for (int i = 0; i < tamanhoEspera; i++) {
			if (filaEspera[i].equals(paciente)) {
				System.out.println("Paciente já está na fila de espera.");
				return;
			}
		}

		filaEspera[tamanhoEspera++] = paciente;
		System.out.println("Paciente adicionado à fila!");
	}

	public Paciente chamarProximoPaciente() {
		if (tamanhoEspera == 0)
			return null;
		Paciente pacienteAtendido = filaEspera[0];
		for (int i = 0; i < tamanhoEspera - 1; i++) {
			filaEspera[i] = filaEspera[i + 1];
		}
		filaEspera[--tamanhoEspera] = null;
		filaHistorico[tamanhoHistorico++] = pacienteAtendido;
		return pacienteAtendido;
	}

	public Paciente retornarParaFilaDeEspera(int posicao) {
		if (tamanhoHistorico == 0 || posicao < 0 || posicao > tamanhoEspera) {
			System.out.println("Operação inválida: não há pacientes no histórico ou posição inválida.");
			return null;
		}

		// Recupera o primeiro paciente do histórico
		Paciente pacienteRetornado = filaHistorico[0];

		// Reorganiza a fila de histórico após a remoção do paciente
		for (int i = 0; i < tamanhoHistorico - 1; i++) {
			filaHistorico[i] = filaHistorico[i + 1];
		}
		filaHistorico[--tamanhoHistorico] = null; // Limpar última posição do histórico

		// Adicionar paciente de volta à fila de espera na posição desejada
		if (tamanhoEspera < capacidade) {
			for (int i = tamanhoEspera; i > posicao; i--) {
				filaEspera[i] = filaEspera[i - 1];
			}
			filaEspera[posicao] = pacienteRetornado;
			tamanhoEspera++; // Incrementa o tamanho da fila de espera
		} else {
			System.out.println("Erro: A fila de espera está cheia.");
			return null;
		}

		System.out.println("Paciente " + pacienteRetornado.nome + " retornou para a fila de espera.");
		return pacienteRetornado;
	}

	public void visualizarFilaDeEspera() {
		System.out.println("\nFila de Espera (Pacientes Aguardando Atendimento):");
		if (tamanhoEspera == 0) {
			System.out.println("Nenhum paciente esperando atendimento ainda.");
		} else {
			for (int i = 0; i < tamanhoEspera; i++) {
				System.out.println((i + 1) + ". " + filaEspera[i].nome);
			}
		}
	}

	public void visualizarFilaHistorico() {
		System.out.println("\nFila de Histórico (Pacientes Atendidos):");
		if (tamanhoHistorico == 0) {
			System.out.println("Nenhum paciente atendido ainda.");
		} else {
			for (int i = 0; i < tamanhoHistorico; i++) {
				System.out.println((i + 1) + ". " + filaHistorico[i].nome);
			}
		}
	}
}