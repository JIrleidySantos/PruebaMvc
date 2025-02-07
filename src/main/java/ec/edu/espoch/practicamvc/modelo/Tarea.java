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
    private boolean tareIncompleta;

    public Tarea(int id, String titulo, String descripcion, boolean tareaCompletada, boolean tareIncompleta) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tareaCompletada = tareaCompletada;
        this.tareIncompleta = tareIncompleta;
    }

    public boolean isTareIncompleta() {
        return tareIncompleta;
    }

    public void setTareIncompleta(boolean tareIncompleta) {
        this.tareIncompleta = tareIncompleta;
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
