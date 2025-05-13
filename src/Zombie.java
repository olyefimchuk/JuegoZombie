
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

    // Setter de numMaxVida
    public void setPuntosVidaActuales(int puntosVidaActuales) {
        this.puntosVidaActuales = puntosVidaActuales;
    }

    // Setter de puntosAtaque
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
