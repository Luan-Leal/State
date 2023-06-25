package org.example;

public class PacienteEstadoSalaEspera extends PacienteEstado {

    private PacienteEstadoSalaEspera() {};
    private static PacienteEstadoSalaEspera instance = new PacienteEstadoSalaEspera();
    public static PacienteEstadoSalaEspera getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Paciente foi para sala de espera";
    }

    public boolean clinica(Paciente paciente) {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        return true;
    }

    public boolean salaEspera(Paciente paciente) {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        return false;
    }

    public boolean uti(Paciente paciente) {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        return true;
    }
}
