import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void isPossibleDivideExample1() {
    assertTrue(sol.isPossibleDivide(new int[]{1,2,3,3,4,4,5,6}, 4));
  }
  @Test
  void isPossibleDivideExample2() {
    assertTrue(sol.isPossibleDivide(new int[]{3,2,1,2,3,4,3,4,5,9,10,11}, 3));
  }
  @Test
  void isPossibleDivideExample3() {
    assertFalse(sol.isPossibleDivide(new int[]{1,2,3,4}, 3));
  }
}