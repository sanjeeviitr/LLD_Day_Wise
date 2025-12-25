package org.example.abstractVSinterface;

public class PushNotification implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("Send Push Notification");
    }
}
