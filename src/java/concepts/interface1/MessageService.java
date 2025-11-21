package java.concepts.interface1;

public class MessageService implements NotifyService{
    @Override
    public String send(String string) {
        return "This is a message service notification";
    }
}
