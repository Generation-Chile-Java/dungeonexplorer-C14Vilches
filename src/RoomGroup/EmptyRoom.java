package RoomGroup;
//TODO: import RoomGroup.Room; RoomEmpty implements Room
//Crea una clase EmptyRoom que represente una sala vacía.

public class EmptyRoom {
    //atributos
    private String roomName;
    private String roomType;
    private int roomNumber;
    private String roomDescription;

    //constructor vacio
    public EmptyRoom() {
    }

    //constructor lleno
    public EmptyRoom(String RoomName, String RoomType, int RoomNumber, String RoomDescription) {
        this.roomName = RoomName;
        this.roomType = RoomType;
        this.roomNumber = RoomNumber;
        this.roomDescription = RoomDescription;
    }

    //getters and setters
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getRoomDescription() {
        return roomDescription;
    }
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public void emptyRoomChecked (){
        System.out.println("No hay nada en este lugar, siguamos adelante.");
    } //ERROR: Identifier expected TODO: Que esta generando este error ??????????
}