import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.*;


public class ListTests {
    @Test
    public void test1(){
        List<String> result = new ArrayList<>();
        result.add("a");
        result.add("b");
        result.add("c");
        
        //List<String> one = ListExamples.filter(result, "a")
        //assertEquals(one, result);
        List<String> two = Arrays.asList("a", "b", "c");

    }
}
