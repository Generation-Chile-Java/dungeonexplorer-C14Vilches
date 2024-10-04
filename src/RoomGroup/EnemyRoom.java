package RoomGroup;

public class EnemyRoom  extends EmptyRoom{
    Boolean enemyInRoom;
    int currentEnemy;

    public EnemyRoom() {
    }

    public EnemyRoom(String RoomName, String RoomType, int RoomNumber, String RoomDescription, Boolean enemyInRoom, int currentEnemy) {
        super(RoomName, "Sala con enemigo.", RoomNumber, RoomDescription);
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
