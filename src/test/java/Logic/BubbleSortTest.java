package Logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @DisplayName("버블소트 기본 테스트")
    @Test
    void Bubble_sorting_simple_test()
    {
        //Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        //When
        List<Integer> actual = bubbleSort.sort(List.of(5,2,4,3,1));

        //Then
        assertEquals(List.of(1,2,3,4,5), actual);
    }
}