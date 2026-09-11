/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.modelo;

/**
 *
 * @author Samuel
 */
public class Animal {
    private String nombre;
    private String especie;
    private double peso;

    public Animal() {
    }

    public Animal(String nombre, String especie, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String AnimalToString() {
        return "Animal{" + "nombre=" + nombre + ", especie=" + especie + ", peso=" + peso + "kg)";
    }
}
