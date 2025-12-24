package org.example.basic_proj;

public class SMS implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS");
    }
}
