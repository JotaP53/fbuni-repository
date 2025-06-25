package entities;

public class Paciente {
	String nome;
    String motivoConsulta;
    
    public Paciente(String nome, String motivoConsulta) {
        this.nome = nome;
        this.motivoConsulta = motivoConsulta;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append(", ");
        sb.append("Motivo da Consulta: ").append(motivoConsulta);
        return sb.toString();
    }
}