/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.practicamvc.modelo;

/**
 *
 * @author mundo
 */
public class Tarea {
   
    private int id;
    private String titulo;
    private String descripcion;
    private boolean tareaCompletada;

    public Tarea(int id, String titulo, String descripcion, boolean tareaCompletada) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tareaCompletada = tareaCompletada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isTareaCompletada() {
        return tareaCompletada;
    }

    public void setTareaCompletada(boolean tareaCompletada) {
        this.tareaCompletada = tareaCompletada;
    }
   
    
    
}
