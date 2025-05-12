//Clase superviviente que hereda de zombie

public final class Superviviente extends Zombie {
    final int numMaxVida = 20;
    boolean llevaBotiquin;
    int cantArmas;
    int cantProteccion;

    /**
     *
     *
     * @param puntosVidaActuales
     * @param puntosAtaque
     * @param llevaBotiquin
     * @param cantArmas
     * @param cantProteccion
     */
    // Constructor
    public Superviviente(int puntosVidaActuales, int puntosAtaque, boolean llevaBotiquin, int cantArmas, int cantProteccion) {
        super(puntosVidaActuales, puntosAtaque);
        this.llevaBotiquin = llevaBotiquin;
        this.cantArmas = cantArmas;
        this.cantProteccion = cantProteccion;
    }

    /**
     *
     * @param puntosVidaActuales
     */
    // Setter de numMaxVida
    @Override
    public void setPuntosVidaActuales(int puntosVidaActuales) {
        this.puntosVidaActuales = puntosVidaActuales;
    }


    // Setter de puntosAtaque
    @Override
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
