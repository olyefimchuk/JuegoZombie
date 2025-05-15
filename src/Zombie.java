
public class Zombie {
    private int puntosVida;
    private int puntosAtaque;

    /**
     * @param puntosVida
     * @param puntosAtaque
     */
    // Constructor
    public Zombie(int puntosVida, int puntosAtaque) {
        this.puntosVida = puntosVida;
        this.puntosAtaque = puntosAtaque;
    }

    /**
     * Metodo para comprobar si el zombie está vivo
     * @return true si zombie está vivo y false en caso contrario
     */
    public boolean estaVivo() {
        if (puntosVida <= 0) return false;
        return true;
    }

    // recibir ataque
    public int recibirAtaque(int ataque) {
        return puntosVida - ataque;
    }

    // realizar ataque


    /**
     *
      * @param puntosVida setter de los puntos de vida actuales
     */
    public void setpuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
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
     * @return puntosVida
     */
    public int getpuntosVida() {
        return puntosVida;
    }

    /**
     *
     * @return puntosAtaque
     */
    public int getPuntosAtaque() {
        return puntosAtaque;
    }
}
