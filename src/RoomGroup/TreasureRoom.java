package RoomGroup;
//Crea una clase TreasureRoom que represente una sala con un tesoro.

public class TreasureRoom extends RoomEmpty{
    //cofre contiene tesoro o esta vacio
    Boolean treasureInRoom;
    String treasureDescription;

    public TreasureRoom() {
    }

    public TreasureRoom(String RoomName, String RoomType, int RoomNumber, String RoomDescription) {
        super(RoomName, RoomType, RoomNumber, RoomDescription);
        this.treasureInRoom = treasureInRoom;
        this.treasureDescription = treasureDescription;
    }

    public Boolean getTreasureInRoom() {
        return treasureInRoom;
    }

    public void setTreasureInRoom(Boolean treasureInRoom) {
        this.treasureInRoom = treasureInRoom;
    }

    public String getTreasureDescription() {
        return treasureDescription;
    }

    public void setTreasureDescription(String treasureDescription) {
        this.treasureDescription = treasureDescription;
    }
}
