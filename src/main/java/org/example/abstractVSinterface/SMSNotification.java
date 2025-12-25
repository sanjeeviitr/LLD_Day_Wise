package org.example.abstractVSinterface;

public class SMSNotification implements Notification{


    @Override
    public void sendNotification() {
        System.out.println("Send SMS");
    }
}
