/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.vista;

import com.mycompany.clinicaveterinaria.modelo.Consulta;
import com.mycompany.clinicaveterinaria.modelo.Mascota;
import com.mycompany.clinicaveterinaria.modelo.Propietario;
import com.mycompany.clinicaveterinaria.modelo.Medicamento;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class VeterinariaVista {
    public void mostrarPropietariosConMascotas(List<Propietario> propietarios){
        System.out.println("PROPIETARIOS Y SUS MASCOTAS");
        for(Propietario propietario : propietarios){
            System.out.println("- Propietario "+propietario.getNombre() + ", telefono: "+propietario.getTelefono());
            
            List<Mascota> mascotas = propietario.getMascotas();
            if(mascotas.isEmpty()){
                System.out.println("No hay mascota registrada");
            } else {
                for(Mascota mascota : mascotas){
                    System.out.println("    * " + mascota.toString());
                }
            }
            System.out.println();
        }
    }
    public void mostrarConsultas(List<Consulta> consultas){
        System.out.println("CONSULTAS REALIZADAS");
        for(Consulta consulta : consultas){
            System.out.println("Motivo: "+consulta.getMotivo()+", fecha: "+ consulta.getFecha()+", Mascota: "+consulta.getMascota().getNombre());
        }
        System.out.println();
    }
    
    public void mostrarMedicamentosRecetados(List<Consulta> consultas){
        System.out.println("MEDICAMENTOS RECETADOS");
        for(Consulta consulta : consultas){
            System.out.println("Consulta del "+consulta.getFecha()+", Mascota: "+consulta.getMascota().getNombre());
            List<Medicamento> medicamentos = consulta.getMedicamentos();
            if(medicamentos.isEmpty()){
                System.out.println("No hay medicamentos recetados");
            } else{
                for(Medicamento medicamento : medicamentos){
                    System.out.println("    *"+medicamento);
                }
            }
        }
        System.out.println();
    }
}
