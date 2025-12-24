package org.example.Composition;

import java.util.ArrayList;

public class Main_4 {

    public static void main(String[] args) {
        House h1 = new House(1);
        House h2 = new House(2);
        h1.addRoom(RoomType.KITCHEN, 2);
        h1.addRoom(RoomType.LIVING_ROOM, 3);
        h1.getAllRooms();
        h1.addRoom(RoomType.BATHROOM, 4);
        h1.addRoom(RoomType.BEDROOM, 5);
        h1.getAllRooms();
        h1.removeRoom(2);
        h1.getAllRooms();
    }
}
