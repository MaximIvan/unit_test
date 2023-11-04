import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class NumListTest {
    static NumList numList;

    @BeforeAll
    public static void SetUp() {
        numList = new NumList(5);
    }

    @Test
    void testNumList(){
        assertThat(numList.getArray()).isInstanceOf(ArrayList.class);
    }

    @Test
    void testLengthNumList(){
        assertThat(numList.getArrayLength()).isEqualTo(5);
    }
}
