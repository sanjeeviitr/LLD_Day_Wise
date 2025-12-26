package org.example.interfacesAdvanced;

public class PushNotification implements Notification, Notification2{
    @Override
    public void send() {
        System.out.println("sending push");
    }

    @Override
    public void logNotification() {
        Notification2.super.logNotification();
    }

    @Override
    public void retry() {
        System.out.println("Push retrying");
    }
}
