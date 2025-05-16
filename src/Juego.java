public class Juego {
    private int numHabitacion;
    private int numIntentoBusqueda;
    private int habitacionActual;
    private int numZombieHabitacion;

    Dado dado = new Dado();

    public Juego(int numHabitacion) {
        this.numHabitacion = numHabitacion;
        this.numIntentoBusqueda = 3;
        this.habitacionActual = 1;
        this.numZombieHabitacion = 1;
    }


    public void avanzarHabitacionSiguente(Superviviente jugador) {
        habitacionActual++;
        numIntentoBusqueda = 3;
        numZombieHabitacion = 1;
        System.out.println("Has entrado a habitacion siguente");
        comprobarFinDejuego(jugador);
    }


    public void elegirAccionJugador() {

    }

    // numeroAlearorio(2) + 2 + (Habitación-1)
    public void combatirContraZombie() {
        // 1. Se crea un zombie
        int puntosVida = dado.lanzarDado(2) + 2 + (habitacionActual - 1); // (numero aleatorio entre 0 y 1) + 2 + (habitacionActual - 1)
        int puntosAtaque = dado.lanzarDado(2) + 2 + (habitacionActual - 1); // (numero aleatorio entre 0 y 1) + 2 + (habitacionActual - 1)
        Zombie zombie = new Zombie(puntosVida, puntosAtaque);
        
        // 2.
    }


    // combatirContraZombie() - metodo para combatir contra un zombie
    // elegirAccionJugador() - metodo para elegir acciones




    

    /**
     * metodo Buscar(). (busca por la habitación)
     * @param jugador
     * ● 1-75: Hacemos ruido (ver resultados de ruido).
     * ● 76-90: Encontramos un botiquín.
     * ● 91-95: Encontramos una protección (+1).
     * ● 96-100: Encontramos un arma (+1).
     */
    public void buscar(Superviviente jugador){
        int resultadoDado = dado.lanzarDado(101);
        numIntentoBusqueda --;
        if (resultadoDado <= 75) {
            System.out.println("Has hecho ruido...");
            int hacerRuido= dado.lanzarDado(101);
            if (hacerRuido <= 40) {
                System.out.println("No ha pasado nada...");
            } else if (hacerRuido <=80) {
                System.out.println("Hay un zombie");
                numZombieHabitacion++;
            }else{
                System.out.println("Hay 2 zombies");
                numZombieHabitacion += 2;
            }
        } else if (resultadoDado <=90) {
            if(!jugador.getLLevaBotiquin()){
                System.out.println("Has encontrado un botiquin");
                jugador.setLlevaBotiquin(true);
            }else{
                System.out.println("Has encontrado un botiqun, pero ya tienes uno. No lo puedes llevar. ");
            }
        } else if (resultadoDado <= 95) {
            System.out.println("Has encotrado protección");
            jugador.setCantProteccion(jugador.getCantProteccion() + 1);
        }else {
            System.out.println("Has encontrado un arma. ");
            jugador.setCantArmas(jugador.getCantArmas() + 1);
        }

    }

    /**
     * ComprobarFinDeJuego()
     * @param jugador
     * @return devuele true si el jugador tiene menos de 0 puntos de vida o si ya no hay mas habitaciones y false en caso contrario (continua el juego).
     */
    public boolean comprobarFinDejuego(Superviviente jugador){
         if(jugador.getPuntosVidaActuales() <= 0 || habitacionActual > numHabitacion) {
             return true;
         }
         return false;
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

}
