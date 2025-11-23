package com.concepts.interface1;

public interface NotifyService {

    default String pleaseNotifyUser(){
        return "Always Notify user";
    }

    private String testNotification(){
        return "Before sending test notification";
    }
    String send(String string);
}
