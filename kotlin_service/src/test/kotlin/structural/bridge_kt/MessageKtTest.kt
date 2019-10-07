package structural.bridge_kt

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class MessageKtTest {

    @Test
    fun `Sending text message via TextMessageSender`() {
        val textMsgSender = TextMessageSender()
        val msg = TextMessage(textMsgSender)
        assertTrue(msg.send().contains("Sending text message..."))
    }

    @Test
    fun `Sending email message via TextMessageSender`() {
        val textMsgSender = EmailMessageSender()
        val msg = EmailMessage(textMsgSender)
        assertTrue(msg.send().contains("Sending email message..."))
    }
}