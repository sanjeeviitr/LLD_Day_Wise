package org.example.interfacesAdvanced;

public interface Notification {

    void send();

    default void logNotification(){
        System.out.println("Logging notification");
    }

    static boolean validateNotification(Notification n){
        if(n!=null) return true;
        return false;
    }
}
