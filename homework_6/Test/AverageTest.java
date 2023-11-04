import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AverageTest {
    static NumList numList;

    @BeforeAll
    public static void SetUp() {
        numList = new NumList(5);
    }

    @Test
    void testGetAverage(){
        numList.setArray(new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);

        }});
        assertThat(numList.getAverage()).isEqualTo(2);
    }

    @Test
    void testAverageOfNumList(){
        NumList numList = mock(NumList.class);

        when(numList.getAverage()).thenReturn(2.5);

        assertThat(numList.getAverage()).isEqualTo(2.5);
    }

    @Test
    void testAverageEquals(){
        NumList numList1 = mock(NumList.class);
        NumList numList2 = mock(NumList.class);
        when(numList1.getAverage()).thenReturn(2.0);
        when(numList2.getAverage()).thenReturn(2.0);
        Average avg = new Average(numList1, numList2);


        assertThat(avg.compareAverage()).isEqualTo("Среднее арифметическое первого массива 2.0 равно среднему " +
                "арифметическому второго массива 2.0");

    }

    @Test
    void testAverageFirstMoreSecond(){
        NumList numList3 = mock(NumList.class);
        NumList numList4 = mock(NumList.class);
        when(numList3.getAverage()).thenReturn(3.0);
        when(numList4.getAverage()).thenReturn(2.0);
        Average avg = new Average(numList3, numList4);


        assertThat(avg.compareAverage()).isEqualTo("Среднее арифметическое первого массива 3.0 больше среднего " +
                "арифметического второго массива 2.0");

    }

    @Test
    void testAverageSecondMoreFirst(){
        NumList numList5 = mock(NumList.class);
        NumList numList6 = mock(NumList.class);
        when(numList5.getAverage()).thenReturn(2.0);
        when(numList6.getAverage()).thenReturn(3.0);
        Average avg = new Average(numList5, numList6);


        assertThat(avg.compareAverage()).isEqualTo("Среднее арифметическое первого массива 2.0 меньше среднего " +
                "арифметического второго массива 3.0");

    }

}
