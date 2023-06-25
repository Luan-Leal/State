package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PacienteTest {

    Paciente paciente;

    @BeforeEach
    public void setUp() {
        paciente = new Paciente();
    }

    // Paciente Uti

    @Test
    public void deveMandarPacienteDaClinicaParaUti() {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        assertTrue(paciente.clinica());
    }

    @Test
    public void deveMandarPacienteNaUtiParaSalaDeEspera() {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        assertTrue(paciente.salaEspera());
        assertEquals(PacienteEstadoClinicaGeral.getInstance(), paciente.getEstado());
    }

    @Test
    public void naoDeveMandarPacienteNaUtiParaUti() {
        paciente.setEstado(PacienteEstadoUti.getInstance());
        assertFalse(paciente.uti());
        assertEquals(PacienteEstadoSalaEspera.getInstance(), paciente.getEstado());
    }

    // Paciente sala de espera

    @Test
    public void deveMandarPacienteNaSalaDeEsperaParaClinica() {
        paciente.setEstado(PacienteEstadoSalaEspera.getInstance());
        assertTrue(paciente.clinica());
        assertEquals(PacienteEstadoUti.getInstance(), paciente.getEstado());
    }

    @Test
    public void naoDeveMandarPacienteNaSalaDeEsperaParaSalaDeEspera() {
        paciente.setEstado(PacienteEstadoSalaEspera.getInstance());
        assertFalse(paciente.salaEspera());
    }

    @Test
    public void deveMandarPacienteNaSalaDeEsperaParaUti() {
        paciente.setEstado(PacienteEstadoSalaEspera.getInstance());
        assertTrue(paciente.uti());
    }


    // Paciente Clinica

    @Test
    public void naoDeveMandarPacienteNaClinicaParaClinica() {
        paciente.setEstado(PacienteEstadoClinicaGeral.getInstance());
        assertFalse(paciente.clinica());
    }

    @Test
    public void DeveMandarPacienteNaClinicaParaSalaDeEspera() {
        paciente.setEstado(PacienteEstadoClinicaGeral.getInstance());
        assertTrue(paciente.salaEspera());
    }

    @Test
    public void DeveMandarPacienteNaClinicaParaUti() {
        paciente.setEstado(PacienteEstadoClinicaGeral.getInstance());
        assertTrue(paciente.uti());
    }
}