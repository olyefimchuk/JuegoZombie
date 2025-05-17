import java.util.Scanner;

public class Principio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("BIENVENIDO A LA MANSIÓN ZOMBIE. ELIGE DIFICULTAD:");
        System.out.println("1. FÁCIL (5 HABITACIONES)");
        System.out.println("2. DIFÍCIL (10 HABITACIONES)");

        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("> OPCIÓN:");
            opcion = sc.nextInt();
        }while (opcion != 1 && opcion != 2);


        int numHabitaciones = 0;
        switch (opcion) {
            case 1 -> numHabitaciones = 5;
            case 2 -> numHabitaciones = 10;
        }

        Juego juego = new Juego(numHabitaciones);
        Superviviente jugador = new Superviviente();

        while (!juego.comprobarFinDejuego(jugador)) {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("** PV: " + jugador.getPuntosVidaActuales() + " #MAX(20); ARMAS: " + jugador.getCantArmas() + "; PROTECCIÓN: " + jugador.getCantProteccion());
            System.out.println("** LA HABITACIÓN " + juego.getHabitacionActual() + " CONTIENE: " + juego.getNumZombieHabitacion() + " ZOMBIES.");

            juego.elegirAccionJugador(jugador);


        }

    }
}