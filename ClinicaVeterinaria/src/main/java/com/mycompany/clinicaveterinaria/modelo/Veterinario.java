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
public class Veterinario {
    private String nombre;
    private String especialidad;
    private List<Consulta> consultas;

    public Veterinario() {
        this.consultas = new ArrayList<>();
    }

    public Veterinario(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.consultas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    
    public void asociarConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }
    
    public void recetar(Consulta consulta, Medicamento medicamento){
        consulta.agregarMedicamento(medicamento);
    }

    @Override
    public String toString() {
        return "Veterinario{" + "nombre=" + nombre + ", especialidad=" + especialidad + ", consultas=" + consultas + '}';
    }
}
