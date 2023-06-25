package org.example;

public class PacienteEstadoClinicaGeral extends PacienteEstado {

    private PacienteEstadoClinicaGeral() {};
    private static PacienteEstadoClinicaGeral instance = new PacienteEstadoClinicaGeral();
    public static PacienteEstadoClinicaGeral getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Paciente foi para clinica";
    }

    public boolean clinica(Paciente paciente) {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        return false;
    }
    public boolean salaEspera(Paciente paciente) {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        return true;
    }
    public boolean uti(Paciente paciente) {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        return true;
    }
}
