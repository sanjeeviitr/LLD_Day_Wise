package org.example.basic_proj;

public class Main {
    public static void main(String[] args) {
        Notification email = new Email();
        email.sendNotification();
        Notification SMS = new SMS();
        SMS.sendNotification();
    }

}
