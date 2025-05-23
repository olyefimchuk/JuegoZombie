public final class Superviviente {
    private final int numMaxVida = 20;
    private int puntosVidaActuales;
    private int puntosAtaque;
    private boolean llevaBotiquin;
    private int cantArmas;
    private int cantProteccion;

    Dado dado = new Dado();


    public Superviviente() {
        this.puntosVidaActuales = 20;
        this.puntosAtaque = 4;
        this.llevaBotiquin = false;
        this.cantArmas = 0;
        this.cantProteccion = 0;
    }

    /**
     * Constructor de Superviviente
     * @param puntosVidaActuales
     * @param puntosAtaque
     * @param llevaBotiquin
     * @param cantArmas
     * @param cantProteccion
     */
    public Superviviente(int puntosVidaActuales, int puntosAtaque, boolean llevaBotiquin, int cantArmas, int cantProteccion) {
        this.puntosVidaActuales = puntosVidaActuales;
        this.puntosAtaque = puntosAtaque;
        this.llevaBotiquin = llevaBotiquin;
        this.cantArmas = cantArmas;
        this.cantProteccion = cantProteccion;


    }

    /**
     *
     * @param ataque número de ataque
     * @return devuelve el daño que recibe el superviviente
     */
    public int recibirAtaque(int ataque) {
        puntosVidaActuales -= ataque;
        return puntosVidaActuales;
    }

    /**
     *
     * @return metodo realizar ataque utiliza Dado para calcular el daño
     */

    public int realizarAtaque() {
        int resultado = (dado.lanzarDado(puntosAtaque) + 1) + cantArmas;
        return resultado;
    }


    /**
     * función Curarse
     * añade 4 puntos de vida
     * Si hay zombies en la habitacion no deja curarse
     */
    public void curarse(Juego juego) {
        if (juego.getNumZombieHabitacion() > 0) {
            System.out.println("No puedes curarte, hay zombies en la habitacion");
            return;
        }else{
            if (llevaBotiquin) {
                puntosVidaActuales += 4;
                if (puntosVidaActuales > numMaxVida) { // si puntosVidaActuales > 20 se asigna 20
                    puntosVidaActuales = numMaxVida;
                }
            } else {
                System.out.println("No tienes botiquin");
            }
        }
    }


    /**
     * Metodo para comprobar si el jugador está vivo
     * @return true si jugador está vivo y false en caso contrario
     */
    public boolean estaVivo() {
        if (puntosVidaActuales <= 0) return false;
        return true;
    }

    //SETTERS
    /**
     *  Set puntosVidaActuales
     * @param puntosVidaActuales Setter de puntosVidaActuales
     */
    public void setPuntosVidaActuales(int puntosVidaActuales) {
        this.puntosVidaActuales = puntosVidaActuales;
    }

    /**
     *  Set PuntosAtaque
     * @param puntosAtaque Set de puntos de ataque
     */
    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    /**
     *  set LlevaBotiquin
     * @param llevaBotiquin Set de LlevaBotiquin
     */
    public void setLlevaBotiquin(boolean llevaBotiquin) {
        this.llevaBotiquin = llevaBotiquin;
    }

    /**
     *  set CantArmas
     * @param cantArmas Setter de cantidad de armas
     */
    public void setCantArmas(int cantArmas) {
        this.cantArmas = cantArmas;
    }

    /**
     *  set CantProteccion
     * @param cantProteccion Setter de cantidad de protección
     */
    public void setCantProteccion(int cantProteccion) {
        this.cantProteccion = cantProteccion;
    }

    /**
     *  Metodo llevaBotiquin
     * @return devuelve si lleva o no botiquin
     */
    public boolean isLlevaBotiquin() {
        return llevaBotiquin;
    }
    //GETTERS
    /**
     *  get PuntosVidaActuales
     *  @return get para los puntos de vida actuales
     */
    public int getPuntosVidaActuales() {
        return puntosVidaActuales;
    }

    /**
     *  get puntos ataque
     * @return get para los puntos de ataque
     */
    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    /**
     *  get cant armas
     * @return Get para la cantidad de armas
     */
    public int getCantArmas() {
        return cantArmas;
    }

    /**
     *  get cant proteccion
     * @return Get para la cantidad de protección
     */
    public int getCantProteccion() {
        return cantProteccion;
    }

    /**
     *  get lleva botiquin
     * @return devuelve si el superviviente lleva o no botiquín
     */
    public boolean getLLevaBotiquin(){
        return llevaBotiquin;
    }
}
