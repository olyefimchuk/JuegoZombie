import java.util.Random;

public class Dado {
    Random rand = new Random();

    private int dado;

    /**
     * genera un número aleatorio entre 1 y 6
     */
    public Dado() {
        dado = rand.nextInt(6) + 1;
    }

    /**
     * Constructor que recibe numero de caras y genera un número aleatorio entre 1 y ese número
     * @param caras
     *
     */
    public Dado(int caras) {
        dado = rand.nextInt(caras) + 1;
    }

    /**
     *
     * @param num
     * @return el resultado del dado entre 0 y num
     */
    public int lanzarDado(int num) {
        int numero;
        numero = rand.nextInt(num);
        return numero;
    }

    /**
     *
     * @return resultado del dado
     */
    public int getDado() {
        return dado;
    }

    /**
     *
     * @return muestra por pantalla el resultado del dado
     */
    public String mostrarResultado() {
        return "Resultado del dado: " + dado;
    }

}
