import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] input2 = {2,3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3, 2 }, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest(){
    double [] input1 = {1, 5, 6};
    assertEquals(5.5, ArrayExamples.averageWithoutLowest(input1), 0.0);
    double [] input2 = {1, 1, 1};
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(input2), 0.0);
  }
}
