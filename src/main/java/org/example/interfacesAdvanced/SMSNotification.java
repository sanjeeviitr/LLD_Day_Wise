package org.example.interfacesAdvanced;

public class SMSNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending SMS");
    }

    @Override
    public void logNotification(){
        System.out.println("log notification in child ");
    }
}
