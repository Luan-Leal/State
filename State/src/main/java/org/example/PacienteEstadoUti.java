package org.example;

public class PacienteEstadoUti extends PacienteEstado {

    private PacienteEstadoUti() {};
    private static PacienteEstadoUti instance = new PacienteEstadoUti();
    public static PacienteEstadoUti getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Paciente foi para UTI";
    }

    public boolean salaEspera(Paciente paciente) {
        paciente.setEstado(PacienteEstadoClinicaGeral.getInstance());
        return true;
    }
    public boolean clinica(Paciente paciente) {
        paciente.setEstado(PacienteEstadoClinicaGeral.getInstance());
        return true;
    }
    
    public boolean uti(Paciente paciente) {
        paciente.setEstado(PacienteEstadoSalaEspera.getInstance());
        return false;
    }
}
