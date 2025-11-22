package com.concepts.interface1;

public class EmailSenderService implements NotifyService {

    @Override
    public String send(String string) {
        return "";
    }

    public static void main(String[] args) {
        EmailSenderService emailSenderService = new EmailSenderService();
        System.out.println(emailSenderService.pleaseNotifyUser());
    }
}
