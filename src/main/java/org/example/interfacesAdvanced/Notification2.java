package org.example.interfacesAdvanced;

public interface Notification2 extends Notification3{

    void send();

    default void logNotification(){
        System.out.println("logging in notification 2");
    }
}
