
public class Zombie {
    int puntosVidaActuales;
    int puntosAtaque;

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
}
