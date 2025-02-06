/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.practicamvc.controlador;

import ec.edu.espoch.practicamvc.modelo.GestordeTareas;
import ec.edu.espoch.practicamvc.modelo.Tarea;
import ec.edu.espoch.practicamvc.vista.Vista;


public class Controlador {

    private Vista vista;
    private GestordeTareas modelo;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.modelo = new GestordeTareas();
    }

    public void procesoGestorTareas() {
        String titulo, descripcion, estado;

        try {
            titulo = vista.getTxtTitulo();
            descripcion = vista.getTxtDescripcion();
            estado = vista.getEstadoSeleccionado(); 

            if (titulo.isEmpty() || descripcion.isEmpty() || estado.isEmpty()) {
                throw new Exception("Por favor complete todos los campos y seleccione un estado.");
            }

            modelo.agregarTareas(new Tarea(0, titulo, descripcion, true));

            vista.Error("Tarea registrada con éxito.");

        } catch (Exception e) {
            vista.Error("Error: " + e.getMessage());
        }
    }
}

