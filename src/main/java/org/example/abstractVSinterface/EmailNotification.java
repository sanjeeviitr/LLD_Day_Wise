package org.example.abstractVSinterface;

public class EmailNotification implements Notification{


    @Override
    public void sendNotification() {
        System.out.println("Send Email");
    }
}
