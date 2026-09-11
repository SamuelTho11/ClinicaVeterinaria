/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.controlador;

import com.mycompany.clinicaveterinaria.modelo.Medicamento;
import com.mycompany.clinicaveterinaria.modelo.Consulta;
import com.mycompany.clinicaveterinaria.modelo.Mascota;
import com.mycompany.clinicaveterinaria.modelo.Propietario;
import com.mycompany.clinicaveterinaria.modelo.Veterinario;
import com.mycompany.clinicaveterinaria.vista.VeterinariaVista;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author Samuel
 */
public class ClinicaController {
    private VeterinariaVista vista;

    public ClinicaController() {
        this.vista = new VeterinariaVista();
    }
    
    public void iniciar(){
        List<Propietario> propietarios = crearPropietariosDePrueba();
        List<Consulta> consultas = crearConsultasDePrueba(propietarios);
        
        vista.mostrarPropietariosConMascotas(propietarios);
        vista.mostrarConsultas(consultas);
        vista.mostrarMedicamentosRecetados(consultas);
    }
    
    private List<Propietario> crearPropietariosDePrueba(){
        List<Propietario> propietarios = new ArrayList<>();
        
        Propietario luisa = new Propietario("Luisa Agudelo", "3051789836");
        Mascota rocky = new Mascota("Rocky", "Perro", 12.5, "Husky", 4);
        Mascota choco = new Mascota("Choco", "Gato", 4.2, "Criollo", 3);
        luisa.agregarMascota(rocky);
        luisa.agregarMascota(choco);
        
        Propietario miguel = new Propietario("Miguel Torres", "3153945812");
        Mascota kaiser = new Mascota("Kaiser", "Perro", 8.5, "Criollo", 3);
        miguel.agregarMascota(kaiser);
        
        propietarios.add(luisa);
        propietarios.add(miguel);
        
        return propietarios;
    }
    
    private List<Consulta> crearConsultasDePrueba(List<Propietario> propietarios){
        List<Consulta> consultas = new ArrayList<>();
        
        Veterinario drGonzales = new Veterinario("Dr. Andres Gonzales", "Medicina General");
        Veterinario draViera = new Veterinario("Dra. Viera", "Dermatologia");
        
        Mascota rocky = propietarios.get(0).getMascotas().get(0);
        Mascota choco = propietarios.get(0).getMascotas().get(1);
        Mascota kaiser = propietarios.get(1).getMascotas().get(0);
        
        Consulta consulta1 = new Consulta("Control semestral", "20-06-2026", rocky);
        Consulta consulta2 = new Consulta("Alergia en la piel", "07-08-2026", choco);
        Consulta consulta3 = new Consulta("Vacunacion", "14-05-2026", kaiser);
        
        drGonzales.asociarConsulta(consulta1);
        drGonzales.asociarConsulta(consulta2);
        draViera.asociarConsulta(consulta3);
        
        drGonzales.recetar(consulta1, new Medicamento("Vitaminico canino", "1 tableta/dia"));
        draViera.recetar(consulta2, new Medicamento("Antihistaminico", "5 mg cada 12h"));
        drGonzales.recetar(consulta3, new Medicamento("Antiparasitario", "Dosis unica"));

        consultas.add(consulta1);
        consultas.add(consulta2);
        consultas.add(consulta3);
        
        return consultas;
    }
}
