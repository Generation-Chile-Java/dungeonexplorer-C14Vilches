package GameExecutable;

import PlayerGroup.Player;
import RoomGroup.RoomEmpty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Define una clase principal que inicialice el jugador y una serie de salas.
        Player nuevoJugador = new Player();

        Scanner scannerNombre = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador:");
        nuevoJugador.setPlayerName(scannerNombre.nextLine());

        nuevoJugador.setPlayerHP(nuevoJugador.getPlayerHP());
        nuevoJugador.setPlayerInv();
        System.out.println("El nombre de tu personaje es " + nuevoJugador.getPlayerName() + ". \nTu personaje tiene " + nuevoJugador.getPlayerHP() + " puntos de vida.\nEste es tu inventario actual: " + nuevoJugador.getPlayerInv() + ".");

        //TODO: Inicializar serie de salas.
    }
}