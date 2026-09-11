/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.modelo;

/**
 *
 * @author Samuel
 */
public class Mascota extends Animal {
    private String raza;
    private int edad;

    public Mascota() {
        super();
    }
    
    public Mascota(String nombre, String especie, double peso, String raza, int edad) {
        super(nombre, especie, peso);
        this.raza = raza;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String AnimalToString() {
        return super.AnimalToString() + ", raza=" + raza + ", edad=" + edad + '}';
    }
}
