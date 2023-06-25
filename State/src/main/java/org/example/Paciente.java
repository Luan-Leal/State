package org.example;

public class Paciente {
    
    private String nome;
    private PacienteEstado estado;

    public Paciente() {
        this.estado = PacienteEstadoUti.getInstance();
    }
    
    public void setEstado(PacienteEstado estado) {
        this.estado = estado;
    }
    
    public boolean clinica() {
        return estado.clinica(this);
    }
    
    public boolean salaEspera() {
        return estado.salaEspera(this);
    }
    
    public boolean uti() {
        return estado.uti(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PacienteEstado getEstado() {
        return estado;
    }    
}
