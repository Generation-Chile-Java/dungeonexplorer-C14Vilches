package RoomGroup;
//Crea una clase TreasureRoom que represente una sala con un tesoro.

public class TreasureRoom extends RoomEmpty{
    //cofre contiene tesoro o esta vacio
    Boolean treasureInChest;
    String treasureDescription;

    public TreasureRoom() {
    }

    public TreasureRoom(String RoomName, String RoomType, int RoomNumber, String RoomDescription) {
        super(RoomName, RoomType, RoomNumber, RoomDescription);
        this.treasureInChest = treasureInChest;
        this.treasureDescription = treasureDescription;
    }

    public Boolean getTreasureInChest() {
        return treasureInChest;
    }

    public void setTreasureInChest(Boolean treasureInChest) {
        this.treasureInChest = treasureInChest;
    }

    public String getTreasureDescription() {
        return treasureDescription;
    }

    public void setTreasureDescription(String treasureDescription) {
        this.treasureDescription = treasureDescription;
    }
}
