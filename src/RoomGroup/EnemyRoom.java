package RoomGroup;

public class EnemyRoom extends RoomEmpty{
    Boolean enemyInRoom;
    int currentEnemy;

    public EnemyRoom(Boolean enemyInRoom, int currentEnemy) {
        this.enemyInRoom = enemyInRoom;
        this.currentEnemy = currentEnemy;
    }

    public EnemyRoom(String RoomName, String RoomType, int RoomNumber, String RoomDescription, Boolean enemyInRoom, int currentEnemy) {
        super(RoomName, RoomType, RoomNumber, RoomDescription);
        this.enemyInRoom = enemyInRoom;
        this.currentEnemy = currentEnemy;
    }

    public Boolean getEnemyInRoom() {
        return enemyInRoom;
    }

    public void setEnemyInRoom(Boolean enemyInRoom) {
        this.enemyInRoom = enemyInRoom;
    }

    public int getCurrentEnemy() {
        return currentEnemy;
    }

    public void setCurrentEnemy(int currentEnemy) {
        this.currentEnemy = currentEnemy;
    }
}
