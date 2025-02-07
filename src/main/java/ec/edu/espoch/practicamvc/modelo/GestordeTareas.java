package ec.edu.espoch.practicamvc.modelo;

/**
 *
 * @author mundo
 */
public class GestordeTareas {

    private String[] tareas;
    private int contadorId;
    private int cantidadTareas;

    public GestordeTareas() {
        tareas = new String[20];
        contadorId = 1;
        cantidadTareas = 0;
    }

    public void agregarTareas(Tarea tarea) {
        if (cantidadTareas < tareas.length) {
            tarea.setId(contadorId++);
            tareas[cantidadTareas] = tarea.toString();
            cantidadTareas++;
        } else {
            System.out.println("No se pueden agregar más tareas. Límite alcanzado.");
        }

    }

    public String[] listarTareasPendientes() {
        String[] pendientes = new String[cantidadTareas];
        int contador = 0;
        for (int i = 0; i < cantidadTareas; i++) {
            if (!tareas[i].contains("Completa")) {
                pendientes[contador++] = tareas[i];
            }
        }
        return pendientes;
    }

    public String[] listarTareasCompletadas() {
        String[] completadas = new String[cantidadTareas];
        int contador = 0;
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i].contains("Completa")) {
                completadas[contador++] = tareas[i];
            }
        }
        return completadas;
    }

    public String[] listarTodasTareas() {
        String[] todasTareas = new String[cantidadTareas];
        int contador = 0;
        for (int i = 0; i < cantidadTareas; i++) {
            todasTareas[contador++] = tareas[i];
        }
        return todasTareas;
    }

    public boolean marcarComoCompletas(int id) {
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i].contains("ID: " + id)) {
                tareas[i] = tareas[i].replace("Pendiente", "Completa");
                return true;
            }
        }
        return false;
    }

}
