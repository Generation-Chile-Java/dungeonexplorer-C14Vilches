package PlayerGroup;
//Define una clase Player que encapsule los datos y comportamientos del jugador.

import java.util.HashMap;

public class Player {
    //La clase debe incluir atributos como name, health, e inventory.
    String playerName;
    int playerHP = 10;
    HashMap playerInv;

    public Player() {
    }

    public Player(String playerName, int playerHP, HashMap playerInv) {
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

    public HashMap getPlayerInv() {
        return playerInv;
    }

    public void setPlayerInv(HashMap playerInv) {
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
        if (player inside room && GameObject inside TreasureRoom){
            add gameObjectTreasure to playerInv
        }
    }*/
    // métodos para que el jugador pueda mostrar su estado actual.
//    static void playerStatus(){
//        System.out.println("Estado del jugador:\nNombre: " + this.playerName + "\nPuntos de vida: " + getPlayerHP + "/10");
//    }
}
