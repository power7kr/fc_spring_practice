package Logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> implements Sort<T>{
    @Override
    public List<T> sort(List<T> list){
        List<T> output = new ArrayList<>(list);

        for(int i = output.size() - 1; i >= 0; i--)
        {
            for(int j = 0; j <= i - 1; j++)
            {
                if(output.get(j).compareTo(output.get(j+1)) > 0)
                {
                    Collections.swap(output, j, j+1);
                }
            }
        }

        return output;
    }
}
