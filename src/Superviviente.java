//Clase superviviente que hereda de zombie

public final class Superviviente {
    private final int numMaxVida = 20;
    private int puntosVidaActuales;
    private int puntosAtaque;
    private boolean llevaBotiquin;
    private int cantArmas;
    private int cantProteccion;

    /**
     *
     * @param numMaxVida
     * @param puntosVidaActuales
     * @param puntosAtaque
     * @param llevaBotiquin
     * @param cantArmas
     * @param cantProteccion
     */

    public Superviviente() {
        this.puntosVidaActuales = 20;
        this.puntosAtaque = 4;
        this.llevaBotiquin = false;
        this.cantArmas = 0;
        this.cantProteccion = 0;
    }

    // Constructor
    public Superviviente(int puntosVidaActuales, int puntosAtaque, boolean llevaBotiquin, int cantArmas, int cantProteccion) {
        this.puntosVidaActuales = puntosVidaActuales;
        this.puntosAtaque = puntosAtaque;
        this.llevaBotiquin = llevaBotiquin;
        this.cantArmas = cantArmas;
        this.cantProteccion = cantProteccion;
    }

    // recibir ataque
    public int recibirAtaque(int ataque) {
        return puntosVidaActuales - ataque;
    }

    // realizar ataque


    /**
     * función Currarse
     * añade 4 puntos de vida
     */
    public void currarse() {
        if (llevaBotiquin) {
            puntosVidaActuales += 4;
        }
        else {
            System.out.println("No tienes botiquin");
        }
    }

    //SETTERS
    /**
     *
     * @param puntosVidaActuales
     */
    // Setter de numMaxVida
    @Override
    public void setPuntosVidaActuales(int puntosVidaActuales) {
        this.puntosVidaActuales = puntosVidaActuales;
    }

    /**
     *
     * @param puntosAtaque Set de puntos de ataque
     */
    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }


    // Setter de llevaBotiquin
    public void setLlevaBotiquin(boolean llevaBotiquin) {
        this.llevaBotiquin = llevaBotiquin;
    }


    // Setter de cantArmas
    public void setCantArmas(int cantArmas) {
        this.cantArmas = cantArmas;
    }


    // Setter de cantArmas
    public void setCantProteccion(int cantProteccion) {
        this.cantProteccion = cantProteccion;
    }




}
