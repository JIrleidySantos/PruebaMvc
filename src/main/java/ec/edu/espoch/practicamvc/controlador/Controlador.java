/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.practicamvc.controlador;

import ec.edu.espoch.practicamvc.modelo.GestordeTareas;
import ec.edu.espoch.practicamvc.modelo.Tarea;
import ec.edu.espoch.practicamvc.vista.Completas;
import ec.edu.espoch.practicamvc.vista.Pendientes;
import ec.edu.espoch.practicamvc.vista.Vista;

public class Controlador {

    private Vista vista;
    private GestordeTareas gestor;
    private Completas completa;
    private Pendientes pendientes;

    public Controlador(Vista vista, Completas completa, Pendientes incompleta) {
        this.vista = vista;
        this.gestor = new GestordeTareas();
        this.completa = completa;
        this.pendientes = incompleta;
    }

    public void ejecutarCompleta() {
        gestor.listarTareasCompletadas();

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

            gestor.agregarTareas(new Tarea(0, titulo, descripcion, true, true));

            vista.error("Tarea registrada con éxito. ");

        } catch (Exception e) {
            vista.error("Error: " + e.getMessage());

        }

    }

    public String[] listarTodasTareas() {
        vista.totalTareas(listarTodasTareas().toString());
        return null;
    }

    public void tareasPendiente() {
        try {
            String[] tareasPendientes = new String[10];
            tareasPendientes = gestor.listarTareasPendientes();
            pendientes.mostrarTareasPendientes(tareasPendientes);
        } catch (Exception e) {
            pendientes.error("Error: " + e.getMessage());

        }
    }

    public void tareasCompletas() {
        try {
            String[] tareasCompletas = new String[10];
            tareasCompletas = gestor.listarTareasPendientes();
            completa.mostrarTareasCompletas(tareasCompletas);
        } catch (Exception e) {
            pendientes.error("Error: " + e.getMessage());

        }
    }

}
