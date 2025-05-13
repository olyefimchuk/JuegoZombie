
public class Zombie {
    private int puntosVidaActuales;
    private int puntosAtaque;

    /**
     * @param puntosVidaActuales
     * @param puntosAtaque
     */
    // Constructor
    public Zombie(int puntosVidaActuales, int puntosAtaque) {
        this.puntosVidaActuales = puntosVidaActuales;
        this.puntosAtaque = puntosAtaque;
    }

    /**
     *
      * @param puntosVidaActuales setter de los puntos de vida actuales
     */
    public void setPuntosVidaActuales(int puntosVidaActuales) {
        this.puntosVidaActuales = puntosVidaActuales;
    }

    /**
     *
     * @param puntosAtaque setter de los puntos de ataque del zombie
     */
    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    /**
     *
     * @return puntosVidaActuales
     */
    public int getPuntosVidaActuales() {
        return puntosVidaActuales;
    }

    /**
     *
     * @return puntosAtaque
     */
    public int getPuntosAtaque() {
        return puntosAtaque;
    }
}
