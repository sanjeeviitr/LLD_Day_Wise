package org.example.interfacesAdvanced;

public class Main {

    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        if(Notification.validateNotification(n1)){
            n1.logNotification();
            n1.send();
        }

        Notification n2 = new SMSNotification();
        n2.logNotification();
        n2.send();

        Notification2 n3 = new PushNotification();
        n3.logNotification();
        n3.retry();
    }
}
