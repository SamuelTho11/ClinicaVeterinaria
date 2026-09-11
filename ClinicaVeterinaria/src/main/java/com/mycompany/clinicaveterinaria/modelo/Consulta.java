/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class Consulta {
    private String motivo;
    private String fecha;
    private Mascota mascota;
    private List<Medicamento> medicamentos;

    public Consulta() {
        this.medicamentos = new ArrayList<>();
    }

    public Consulta(String motivo, String fecha, Mascota mascota, List<Medicamento> medicamentos) {
        this.motivo = motivo;
        this.fecha = fecha;
        this.mascota = mascota;
        this.medicamentos = new ArrayList<>();
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    public void agregarMedicamento(Medicamento medicamento){
        this.medicamentos.add(medicamento);
    }

    @Override
    public String toString() {
        return "Consulta{" + "motivo=" + motivo + ", fecha=" + fecha + ", mascota=" + mascota + ", medicamentos=" + medicamentos + '}';
    }
}
