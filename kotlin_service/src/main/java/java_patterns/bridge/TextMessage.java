package java_patterns.bridge;

public class TextMessage extends Message {
    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public String send() {
        return messageSender.sendMessage();
    }
}
