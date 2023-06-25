package org.example;

public abstract class PacienteEstado {
    
    public abstract String getEstado();

    public boolean clinica(Paciente paciente) {
        return false;
    }

    public boolean salaEspera(Paciente paciente) {
        return false;
    }

    public boolean uti(Paciente paciente) {
        return false;
    }

    
}
