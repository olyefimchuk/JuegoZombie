public class Habitacion {
    int numHabitacion;
    int numIntentoBusqueda;
    int habitacionActual;
    int numZombieHabitacion;

    /**
     *
     * @param numHabitacion
     */
    public Habitacion(int numHabitacion, int numIntentoBusqueda,int habitacionActual, int numZombieHabitacion) {
        this.numHabitacion = numHabitacion;
        this.numIntentoBusqueda = 3;
        this.habitacionActual = 0;
        this.numZombieHabitacion = 0;
    }

    /**
     *
     * @param numHabitacion
     */
    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public void setNumIntentoBusqueda(int numIntentoBusqueda) {
        this.numIntentoBusqueda = numIntentoBusqueda;
    }

    public void setHabitacionActual(int habitacionActual) {
        this.habitacionActual = habitacionActual;
    }

    public void setNumZombieHabitacion(int numZombieHabitacion) {
        this.numZombieHabitacion = numZombieHabitacion;
    }
}
