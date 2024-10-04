package PlayerGroup;
//Define una clase Player que encapsule los datos y comportamientos del jugador.

import GameObjectGroup.GameObject;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {
    //La clase debe incluir atributos como name, health, e inventory.
    private String playerName;
    private int playerHP = 10;
    private ArrayList<GameObject> playerInv;

    public Player() {
    }

    public Player(String playerName, int playerHP, ArrayList playerInv) {
        this.playerName = playerName;
        this.playerHP = playerHP;
        this.playerInv = playerInv;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerHP() {
        return playerHP;
    }

    public void setPlayerHP(int playerHP) {
        this.playerHP = playerHP;
    }

    public ArrayList<GameObject> getPlayerInv() {
        return playerInv;
    }

    public void setPlayerInv(ArrayList<GameObject> playerInv) {
        this.playerInv = playerInv;
    }

    public void setPlayerInv() {

    }

    //Proporciona métodos para que el jugador pueda recibir daño
    /*static void playerHurt(){
        //TODO: creat metodo enemyAtack()
        if (enemyAtack() = true ){
            setPlayerHP(getPlayerHP()-1);
        }
    }*/

    // métodos para que el jugador pueda recoger objetos
    /*static void checkRoom(){
        if (player inside room && GameObject inside same room){
            add gameObjectTreasure to playerInv
        }
    }*/
    
    // métodos para que el jugador pueda mostrar su estado actual.
//    static void playerStatus(){
//        System.out.println("Estado del jugador:\nNombre: " + this.playerName + "\nPuntos de vida: " + getPlayerHP + "/10");
//    }
}
