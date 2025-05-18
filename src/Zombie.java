/**
 * clase Zombie
 */
public class Zombie {
    private int puntosVida;
    private int puntosAtaque;

    Dado dado = new Dado();

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

    /**
     * metodo recibirAtaque
     * @param ataque
     * @return devuelve el daño que recibe el zombie
     */
    public int recibirAtaque(int ataque) {
        puntosVida -= ataque;
        return puntosVida;
    }

    /**
     * metodo realizarAtaque
     * @return devuelve el daño que hace el zombie pero como no tiene armas es solo el del dado
     */
    public int realizarAtaque() {
        return dado.lanzarDado(puntosAtaque);
    }

    /**
     * SETTERS
     */

    /**
     *  Set puntos de vida del zombie
     * @param puntosVida setter de los puntos de vida actuales
     */
    public void setpuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    /**
     *  Set puntos de ataque del zombie
     * @param puntosAtaque setter de los puntos de ataque del zombie
     */
    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    /**
     * GETTERS
     */

    /**
     *  get puntos de vida del zombie
     * @return puntosVida
     */
    public int getpuntosVida() {
        return puntosVida;
    }

    /**
     *  get puntos de ataque del zombie
     * @return puntosAtaque
     */
    public int getPuntosAtaque() {
        return puntosAtaque;
    }
}
