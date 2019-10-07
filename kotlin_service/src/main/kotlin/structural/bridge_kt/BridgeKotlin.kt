package structural.bridge_kt


import lombok.AllArgsConstructor

interface MessageSenderKt {
    fun sendMessage(): String
}

@AllArgsConstructor
abstract class MessageKt(messageSender: MessageSenderKt) {
    internal abstract var messageSender: MessageSenderKt
    abstract fun send(): String
}


class EmailMessage(override var messageSender: MessageSenderKt) : MessageKt(messageSender) {
    override fun send(): String {
        return messageSender.sendMessage()
    }
}

class TextMessage(override var messageSender: MessageSenderKt) : MessageKt(messageSender) {
    override fun send(): String {
        return messageSender.sendMessage()
    }
}


class EmailMessageSender : MessageSenderKt {
    override fun sendMessage(): String {
        return EmailMessageSender::class.java.toString() + " Sending email message..."
    }
}

class TextMessageSender : MessageSenderKt {
    override fun sendMessage(): String {
        return TextMessageSender::class.java.toString() + " Sending text message..."
    }
}
