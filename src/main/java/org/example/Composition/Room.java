package org.example.Composition;

class Room {
    private RoomType roomType;
    private int roomID;
    public Room(RoomType roomType, int roomID){
        this.roomType = roomType;
        this.roomID = roomID;
    }

    public int getRoomID(){
        return roomID;
    }

    public void setRoomID(int roomID){
        this.roomID = roomID;
    }

    public void closeRoom(){
        System.out.println("Closing room " + roomID);
    }

    public void openRoom(){
        System.out.println("Opening room " + roomID);
    }


}
