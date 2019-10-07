package java_patterns.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {

    @Test
    void sendText() {
        MessageSender textMsgSender = new TextMessageSender();
        Message msg = new TextMessage(textMsgSender);
        assertTrue(msg.send().contains("Sending text message..."));
    }

    @Test
    void sendEmail() {
        MessageSender emailMsgSender = new EmailMessageSender();
        EmailMessage msg = new EmailMessage(emailMsgSender);
        assertTrue(msg.send().contains("Sending email message..."));
    }
}