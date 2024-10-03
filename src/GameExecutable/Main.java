package GameExecutable;

import PlayerGroup.Player;
import PlayerGroup.PlayerAction;
import PlayerGroup.PlayerMovement;

import RoomGroup.EmptyRoom;
import RoomGroup.EnemyRoom;
import RoomGroup.TreasureRoom;

import java.util.ArrayList;
import java.util.List;
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
        System.out.println("El nombre de tu personaje es " + nuevoJugador.getPlayerName() + ". \nTiene " + nuevoJugador.getPlayerHP() + " puntos de vida.\nEste es tu inventario actual: " + nuevoJugador.getPlayerInv() + ". \n");

        //Inicializar serie de salas.

        //Lista salas vacias
        EmptyRoom salaVacia1 = new EmptyRoom("Entrada", "Sala vacia", 1, "Esta es la entrada del calabozo.");
        List<EmptyRoom> listaSalasVacias = new ArrayList<>();
        listaSalasVacias.add(salaVacia1);

        //lista salas con enemigos
        EnemyRoom salaEnemigo1 = new EnemyRoom("Sala jefe final","sala con enemigo", 1,"Te encuentras en la sala del guardian del tesoro final del calabozo.",true,1);
        List<EnemyRoom> listaSalasEnemigo = new ArrayList<>();
        listaSalasEnemigo.add(salaEnemigo1);

        //lista salas con tesoro
        TreasureRoom salaTesoro1 = new TreasureRoom("Tesoro final", "sala con tesoro", 1, "En esta sala se encuentra el tesoro custodiado por el guardian del calabozo.");
        List<TreasureRoom> listaSalasTesoro = new ArrayList<>();
        listaSalasTesoro.add(salaTesoro1);

        System.out.println("Este calabozo tiene 3 salas:"); //una vacia, otra con un enemigo, y la ultima con un tesoro.

        ArrayList<String> calabozoBase = new ArrayList<>();
        calabozoBase.add(listaSalasVacias.getFirst().getRoomName());
        calabozoBase.add(listaSalasEnemigo.getFirst().getRoomName());
        calabozoBase.add(listaSalasTesoro.getFirst().getRoomName());
        System.out.println(calabozoBase + "\n");

        //Implementa un bucle que permita al jugador moverse por las salas.

        PlayerMovement movimiento = PlayerMovement.ESPERAR;

        switch(movimiento) {
            case NORTE:
                System.out.println("El jugador se mueve al norte.");
                break;
            case ESTE:
                System.out.println("El jugador se mueve al este.");
                break;
            case SUR:
                System.out.println("El jugador se mueve al sur.");
                break;
            case OESTE:
                System.out.println("El jugador se mueve al oeste.");
                break;
            default:
                System.out.println("El jugador espera donde mismo está.");
        }

        //Maneja las interacciones del jugador con las salas y los objetos.

        PlayerAction acciones = PlayerAction.PENSAR;

        switch(acciones) {
            case MOVERSE:
                System.out.println("El jugador se mueve al norte.");
                break;
            case LUCHAR:
                System.out.println("El jugador se mueve al este.");
                break;
            case ESCAPAR:
                System.out.println("El jugador se mueve al sur.");
                break;
            case REVISAR:
                System.out.println("El jugador se mueve al oeste.");
                break;
            case USAR:
                System.out.println("El jugador se mueve al .");
                break;
            default:
                System.out.println("El jugador piensa a donde moverse.");
        }

    }
}