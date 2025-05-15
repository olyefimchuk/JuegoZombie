public class Juego {
    private int numHabitacion;
    private int numIntentoBusqueda;
    private int habitacionActual;
    private int numZombieHabitacion;

    /**
     *
     * @param numHabitacion
     */
    public Juego(int numHabitacion) {
        this.numHabitacion = numHabitacion;
        this.numIntentoBusqueda = 3;
        this.habitacionActual = 1;
        this.numZombieHabitacion = 1;
    }


    // Hay que hacer los metodos:
    // avanzarHabitacionSiguente() - metodo para pasar a habitacion siguente
    // combatirContraZombie() - metodo para combatir contra un zombie
    // buscar() - metodo para buscar por la habitacion
    // elegirAccionJugador() - metodo para elegir acciones
    // comprobarFinDeJuego() - devuelve "true" si puntos de vida del jugador es 0 o si el jugador ha salido de la mansion y devuelve "false" en caso contrario y el juego continúa (true - fin de juego, false - el juego continúa)



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

}
