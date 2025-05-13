public class Juego {
    private int numHabitacion;
    private int numIntentoBusqueda;
    private int habitacionActual;
    private int numZombieHabitacion;

    /**
     *
     * @param numHabitacion
     */
    public Juego(int numHabitacion, int numIntentoBusqueda,int habitacionActual, int numZombieHabitacion) {
        this.numHabitacion = numHabitacion;
        this.numIntentoBusqueda = 3;
        this.habitacionActual = 0;
        this.numZombieHabitacion = 0;
    }
    //SETTERS
    /**
     *
     * @param numHabitacion Setter para el numero de habitaciones
     */
    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    /**
     *
     * @param numIntentoBusqueda Setter para el numero de intentos de busqueda
     */
    public void setNumIntentoBusqueda(int numIntentoBusqueda) {
        this.numIntentoBusqueda = numIntentoBusqueda;
    }

    /**
     *
     * @param habitacionActual Setter para la habitacion actual
     */
    public void setHabitacionActual(int habitacionActual) {
        this.habitacionActual = habitacionActual;
    }

    /**
     *
     * @param numZombieHabitacion setter para el numero de zombies en la habitacion
     */
    public void setNumZombieHabitacion(int numZombieHabitacion) {
        this.numZombieHabitacion = numZombieHabitacion;
    }
    //GETTERS
    /**
     *
     * @return get para el numero de habitacion
     */
    public int getNumHabitacion(){
        return numHabitacion;
    }

    /**
     *
     * @return get para el número de intentos de búsqueda
     */
    public int getNumIntentoBusqueda(){
        return numIntentoBusqueda;
    }

    /**
     *
     * @return get para la habitación actual
     */
    public int getHabitacionActual(){
        return habitacionActual;
    }

    /**
     *
     * @return get para el número de zombies de la habitación
     */
    public int getNumZombieHabitacion(){
        return numZombieHabitacion;
    }

//

}
