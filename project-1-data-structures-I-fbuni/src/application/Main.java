package application;

import java.util.Scanner;

import entities.Paciente;
import entities.SistemaClinica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        SistemaClinica sistema = new SistemaClinica(100);

        int opcao = -1;
        while (opcao != 7) { // Modificado para incluir a nova opção
            System.out.println("\n=== SISTEMA DA CLÍNICA ===");
            System.out.println("1. Cadastrar paciente");
            System.out.println("2. Adicionar paciente à fila");
            System.out.println("3. Adicionar paciente à fila em posição de prioridade");
            System.out.println("4. Chamar próximo paciente");
            System.out.println("5. Visualizar fila de espera");
            System.out.println("6. Retornar paciente à fila de espera"); // Nova opção
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do paciente: ");
                    String nome = sc.nextLine();
                    System.out.print("Motivo da consulta: ");
                    String motivo = sc.nextLine();
                    sistema.cadastrarPaciente(nome, motivo);
                    System.out.println("Paciente cadastrado com sucesso!");
                    break;
                case 2:
                	sistema.visualizarPacientesCadastrados();
                    System.out.print("Informe o número do paciente para adicionar à fila: ");
                    int pacienteIndex0 = sc.nextInt() - 1;
                    sistema.getFilaAtendimento().adicionarPacienteNaProximaPosicao(sistema.getPacientesCadastrados()[pacienteIndex0]);
                    break;
                case 3:
                	sistema.visualizarPacientesCadastrados();
                    System.out.print("Informe o número do paciente para adicionar à fila: ");
                    int pacienteIndex = sc.nextInt() - 1;
                    System.out.print("Posição na fila (0 para prioridade máxima): ");
                    int posicao = sc.nextInt();
                    sistema.getFilaAtendimento().adicionarPaciente(sistema.getPacientesCadastrados()[pacienteIndex], posicao);
                    System.out.println("Paciente adicionado à fila!");
                	break;
                case 4:
                    Paciente atendido = sistema.getFilaAtendimento().chamarProximoPaciente();
                    if (atendido != null) {
                        System.out.println("Atendendo paciente: " + atendido);
                    } else {
                        System.out.println("Nenhum paciente na fila.");
                    }
                    break;
                case 5:
                    System.out.println("Fila de espera:");
                    sistema.getFilaAtendimento().visualizarFilaDeEspera();
                    break;
                case 6:
                	System.out.println("PACIENTES NA FILA DE ESPERA");
                    sistema.getFilaAtendimento().visualizarFilaDeEspera();
                    System.out.println("PACIENTES ATENDIDOS");
                    sistema.getFilaAtendimento().visualizarFilaHistorico();
                    // Retornar paciente à fila de espera                 
                    System.out.print("Informe o número do paciente a ser retornado à fila: ");
                    System.out.print("Informe a posição na fila (0 para prioridade máxima): ");
                    int posicaoRetorno = sc.nextInt();
                    // Chama o método retornarParaFilaDeEspera
                    sistema.getFilaAtendimento().retornarParaFilaDeEspera(posicaoRetorno);
                    System.out.println("Paciente retornado à fila de espera!");
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
	}

}