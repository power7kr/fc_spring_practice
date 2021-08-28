import Logic.BubbleSort;
import Logic.Sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        Sort<String> sort = new BubbleSort<>();

        System.out.println("[Result] : " + sort.sort(Arrays.asList(args)));
    }
}
