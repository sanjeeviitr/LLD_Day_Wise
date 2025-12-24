package org.example.Composition;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Room> rooms;
    public House(int houseNo){
        this.rooms = new ArrayList<>();
    }

    public void addRoom(RoomType roomType, int roomID){
        Room room = new Room(roomType, roomID);
        rooms.add(room);
        System.out.println("Added room " + roomID);
    }

    public void getAllRooms(){
        for(int i=0;i<rooms.size();i++){
            System.out.println("Rooms present in house are: " + rooms.get(i).getRoomID());
        }
    }

//    public void removeRoom(int roomId) {
//        for (int i = 0; i < rooms.size(); i++) {
//            if (rooms.get(i).getRoomID() == roomId) {
//                rooms.remove(i);
//                System.out.println("Removed room " + roomId);
//                return;
//            }
//        }
//        System.out.println("Room not found: " + roomId);
//    }

    public void removeRoom(int id){
        rooms.removeIf(room -> room.getRoomID() == id);
        System.out.println("Removed room " + id);
    }



}
