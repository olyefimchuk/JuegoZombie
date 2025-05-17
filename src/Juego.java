import java.util.Scanner;

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
        comprobarFinDejuego(jugador);
    }


    /**
     * metodo para combatir contra zombie
     * @param jugador
     */
    // numeroAlearorio(2) + 2 + (Habitación-1)
    public void combatirContraZombie(Superviviente jugador) {
        // 1. Se crea un zombie
        int puntosVida = dado.lanzarDado(2) + 2 + (habitacionActual - 1); // (numero aleatorio entre 0 y 1) + 2 + (habitacionActual - 1)
        int puntosAtaque = dado.lanzarDado(2) + 2 + (habitacionActual - 1); // (numero aleatorio entre 0 y 1) + 2 + (habitacionActual - 1)
        Zombie zombie = new Zombie(puntosVida, puntosAtaque);
        
        // 2.
        int ronda = 1;

        System.out.println("El zombie tiene " + zombie.getPuntosAtaque() + " puntos de ataque.");
        System.out.println("El zombie tiene " + zombie.getpuntosVida() + " puntos de vida.");

        while(jugador.estaVivo() && zombie.estaVivo()) {
            System.out.println(">> RONDA: " + ronda + ":");

            int puntosAtaqueJugador = jugador.realizarAtaque();
            System.out.println("> El superviviente ataca con valor " + puntosAtaqueJugador);
            zombie.recibirAtaque(puntosAtaqueJugador);
            if (zombie.estaVivo()) {
                int puntosAtaqueZombie = zombie.realizarAtaque();
                System.out.println("> El zombie ataca con valor " + puntosAtaqueZombie);
                jugador.recibirAtaque(puntosAtaqueZombie);
            }
            else {
                System.out.println("Has eliminado al zombie.");
            }
            ronda++;
        }
        if (!jugador.estaVivo()) {
            System.out.println("¡HAS MUERTO! FIN DEL JUEGO");
        }
        numZombieHabitacion--;
    }

    /**
     * Este es el menú de eleccion.
     * En el menú encontramos 4 opciones
     * 1 combatir
     * 2 buscar
     * 3 avanzar
     * 4 curarse
     * @param jugador
     */
    public void elegirAccionJugador(Superviviente jugador) {
        Scanner sc = new Scanner(System.in);
        boolean accionValida = false;

        while (!accionValida) {
            System.out.println("* ELIGE UNA DE LAS SIGUIENTES ACCIONES:");
            System.out.println("1. COMBATIR CONTRA UN ZOMBI.");
            System.out.println("2. BUSCAR POR LA HABITACIÓN (" + numIntentoBusqueda + " INTENTOS). ");
            System.out.println("3. AVANZAR A OTRA HABITACIÓN.");
            System.out.println("4. CURARSE");
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("> OPCIÓN:");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 ->{
                    if (numZombieHabitacion > 0) {
                        combatirContraZombie(jugador);
                        accionValida = true;
                    }else{
                        System.out.println("No hay zombies en esta habitacón para combatir.");
                    }
                }
                case 2 ->{
                    if (numIntentoBusqueda > 0 ){
                        buscar(jugador);
                        accionValida = true;
                    }else{
                        System.out.println("Ya no puedes buscar más en esta habitación.");
                    }
                }
                case 3 ->{
                    if (numZombieHabitacion == 0) {
                        avanzarHabitacionSiguente(jugador);
                        accionValida = true;
                    }else{
                        System.out.println("Aun hay zombies. No puedes avanzar. ");
                    }
                }
                case 4 ->{
                    if (jugador.getLLevaBotiquin()) {
                        jugador.curarse();
                        jugador.setLlevaBotiquin(false); // se consume el botiquín
                        System.out.println("Te has curado. Vida actual: " + jugador.getPuntosVidaActuales());
                        accionValida = true;
                    } else {
                        System.out.println("No tienes un botiquín para curarte.");
                    }
                }
                default -> System.out.println("Opcion invalida. Elige una entre el 1 y el 4. ");
            }
        }
    }


    

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
