import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBubbleSort {

    @Test
    public void testBubbleSort(){
        int[] array = {5,6,2,1,8,2};
        int[] sortedArray = {1,2,2,5,6,8};
        BubbleSort.sort(array);
        assertArrayEquals(sortedArray,array);
    }

}
