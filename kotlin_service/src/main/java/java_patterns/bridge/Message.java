package java_patterns.bridge;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Message {
    MessageSender messageSender;

    public abstract String send();
}
