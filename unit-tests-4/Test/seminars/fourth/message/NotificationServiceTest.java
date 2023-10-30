package seminars.fourth.message;


import org.junit.jupiter.api.Test;



import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

class NotificationServiceTest {
    @Test
    void messageServiceTest() {
        MessageService messageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);

        messageService.sendMessage("Hello", "Vasia");

        verify(messageService, times(1)).sendMessage("Hello", "Vasia");
    }
}