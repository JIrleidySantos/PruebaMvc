/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.practicamvc.controlador;

import ec.edu.espoch.practicamvc.modelo.Modelo;
import ec.edu.espoch.practicamvc.vista.Vista;

/**
 *
 * @author mundo
 */
public class Controlador {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.modelo = new Modelo();
    }
    
    
}
