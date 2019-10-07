package java_patterns.bridge;

public class EmailMessageSender implements MessageSender {
    @Override
    public String sendMessage() {
        return EmailMessageSender.class + " Sending email message...";
    }
}
