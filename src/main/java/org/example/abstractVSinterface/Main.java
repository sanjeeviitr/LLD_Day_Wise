package org.example.abstractVSinterface;

public class Main {

    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        Notification n2 = new PushNotification();
        Notification n3 = new SMSNotification();
        n1.sendNotification();
        n2.sendNotification();
        n3.sendNotification();
    }
}
