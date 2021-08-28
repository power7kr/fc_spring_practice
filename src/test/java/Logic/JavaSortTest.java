package Logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @DisplayName("자바소트 기본 테스트")
    @Test
    void Bubble_sorting_simple_test()
    {
        //Given
        JavaSort<Integer> javaSort = new JavaSort<>();

        //When
        List<Integer> actual = javaSort.sort(List.of(5,2,4,3,1));

        //Then
        assertEquals(List.of(1,2,3,4,5), actual);
    }

}