package seminars.third.hw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MainHWTest {
    private final MainHW mainHW = new MainHW();

    @Test
    public void testEvenTrue() {
        assertThat(mainHW.evenNumber(2)).isTrue();
    }

    @Test
    public void testEvenFalse() {
        assertThat(mainHW.evenNumber(3)).isFalse();
    }

    @Test
    @DisplayName("Тест с числом в интервале")
    public void testNumInRangeTrue() {
        int number = 55;
        boolean result = mainHW.isInRange(number);
        assertTrue(result, "Ожидаем true");
    }

    @Test
    @DisplayName("Тест с числом вне интервала")
    public void testNumInRangeFalse() {
        int number = 125;
        boolean result = mainHW.isInRange(number);
        assertFalse(result, "Ожидаем false");
    }
}