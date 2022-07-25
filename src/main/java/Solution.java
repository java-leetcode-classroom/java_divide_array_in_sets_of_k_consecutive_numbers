import java.util.*;

public class Solution {
  public boolean isPossibleDivide(int[] nums, int k) {
    int nLen = nums.length;
    if (k == 1) {
      return true;
    }
    if (nLen % k != 0) {
      return false;
    }
    HashMap<Integer, Integer> freq = new HashMap<>();
    for (int num: nums) {
      int currentFreq = 0;
      if (freq.containsKey(num)) {
        currentFreq = freq.get(num);
      }
      freq.put(num, currentFreq+1);
    }
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (a - b));
    Set<Map.Entry<Integer, Integer>> entrySet = freq.entrySet();
    for (Map.Entry<Integer, Integer> pair : entrySet) {
      pq.add(pair.getKey());
    }
    while (pq.size() > 0) {
      int start = pq.peek();
      int end = start + k;
      for (int num = start ; num < end ;num++) {
        if (!freq.containsKey(num)) {
          return false;
        }
        int currentFreq = freq.get(num);
        int remain = currentFreq - 1;
        freq.put(num, remain);
        if (remain == 0) {
          pq.poll();
        }
      }
    }
    return true;
  }
}
