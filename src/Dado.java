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
     * @return resultado del dado
     */
    @Override
    public String toString() {
        return dado + "";
    }

    public static void main(String[] args) {
        Dado d = new Dado();
        System.out.println("Resultado= " + d);
    }
}
