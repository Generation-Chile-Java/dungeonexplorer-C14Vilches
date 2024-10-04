package GameExecutable;

import GameObjectGroup.GameObject;
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
        ArrayList<GameObject> inventarioVacios = new ArrayList<>();
        nuevoJugador.setPlayerInv(inventarioVacios);
        System.out.println("El nombre de tu personaje es " + nuevoJugador.getPlayerName() + ". \nTiene " + nuevoJugador.getPlayerHP() + " puntos de vida.\nEste es tu inventario actual: " + nuevoJugador.getPlayerInv() + ". \n");

        //Inicializar serie de salas.
        //TODO: Crear superclase "TemplateRoom" padre de todas las demas room (subclasses)
        //TODO: inicializar salas y pasar a check game over linea 112, y validarlo dentro de metodo

        //Lista salas vacias
        EmptyRoom salaVacia1 = new EmptyRoom("Entrada", "Sala vacia", 1, "Esta es la entrada del calabozo.");
        List<EmptyRoom> listaSalasVacias = new ArrayList<>();
        listaSalasVacias.add(salaVacia1);

        //lista salas con enemigos
        EnemyRoom salaEnemigo1 = new EnemyRoom("Sala jefe final", "sala con enemigo", 1, "Te encuentras en la sala del guardian del tesoro final del calabozo.", true, 1);
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

        //TODO: comienzo del game loop
        //toda la logica del juego se encuentra aqui
        //switch movimiento y acciones dentro es este loop

        //Implementa un bucle que permita al jugador moverse por las salas.

        PlayerMovement movimiento = PlayerMovement.ESPERAR;

        switch (movimiento) {
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
                System.out.println("El jugador espera donde mismo está. El jugador se podria mover al NORTE...");
        }

        //Maneja las interacciones del jugador con las salas y los objetos.

        //flujo de gameloop

        //flujo de movimiento
        //esperar movimiento scanner
        //validar con swtich el movimiento

        //flujo de pelea
        //esperar accion scanner
        //validar con swtich

        PlayerAction acciones = PlayerAction.PENSAR;

        switch (acciones) {
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
                System.out.println("El jugador piensa que podria REVISAR...");
        }

        //antes del final de gameloop , string mensaje final (game over) string 1.- perdiste por HP 2.- ganaste por revisar cada sala
        while (checkGameOver(nuevoJugador.getPlayerHP())) {
            System.out.println("Game Over"); //TODO: agregar mas detalles
        } //final game loop
    }//endmain

    public static boolean checkGameOver(int playerHP) {
        if (playerHP <= 0) { //no simplificar if para agregar mas detalles
            return false;
        } else {
            return true;
        }
    }
}