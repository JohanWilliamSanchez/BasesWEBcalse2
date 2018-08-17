/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author LabingXEON
 */
public class BaseDatos {
    private ArrayList<Persona> personas;

    public BaseDatos() {
        this.personas = new ArrayList<>();
        this.personas.add(new Persona ("Johan", "Sanchez"));
        this.personas.add(new Persona ("Dayana", "Sanchez"));
        this.personas.add(new Persona ("Josep", "Sanchez"));
    }
    
    public boolean insertar(Persona p){
     return this.personas.add(p);
    }
    public ArrayList<Persona> listar(){
        return this.personas;
    }
}
