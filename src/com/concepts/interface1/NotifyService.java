package com.concepts.interface1;

public interface NotifyService {

    String send(String string);

    default String pleaseNotifyUser() {
        return "Always notify user";
    }

    private String testNotification() {
        return "Before sending, test notification";
    }
}

    class MessageService implements NotifyService {

        @Override
        public String send(String string) {
            return string;
        }

        @Override
        public String pleaseNotifyUser() {
            return "Always notify message-user";
        }
    }
    
    class EmailSenderService implements NotifyService {

            @Override
            public String send(String string) {
                return string;
            }

            @Override
            public String pleaseNotifyUser() {
                return "Always notify email-user";
            }
        }

    class Main {
        public static void main(String[] args) {
            NotifyService messageService =  new MessageService();
            System.out.println(messageService.send("This is a message service notification"));
            String message = messageService.pleaseNotifyUser();
            System.out.println(message);

            NotifyService emailService = new EmailSenderService();
            System.out.println(emailService.send("This is an email service nootification"));
            String email = emailService.pleaseNotifyUser();
            System.out.println(email);



        }
    }

