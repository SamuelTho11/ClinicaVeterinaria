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
public class Propietario {
    private String nombre;
    private List<Mascota> mascotas;
    private String telefono;

    public Propietario() {
        this.mascotas = new ArrayList<>();
    }

    public Propietario(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mascotas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void agregarMascota(Mascota mascota){
        this.mascotas.add(mascota);
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", mascotas=" + mascotas + ", telefono=" + telefono + '}';
    }
}
