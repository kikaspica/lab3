import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverse3() {
    int[] input = {3, 4, 1};
    assertArrayEquals(new int[] {1, 4, 3}, ArrayExamples.reversed(input));
  }

  @Test
  public void testReverseInPlace3() {
    int[] input = {3, 4, 1};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[] {1, 4, 3}, input);
  }
}
