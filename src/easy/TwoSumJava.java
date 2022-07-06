package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumJava {
    /*
 First, brute force. Loop through nums twice, adding the values to see
 which combinations add up to the target. this has O(n^2)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    solution[0] = i;
                    solution[1] = j;
                    break;
                }
            }
        }

    // Return empty array if no results found
    return solution;
    }
}

*/


/* We already know the target value, so we should be able to derive
the "second" value and see if it exists in the nums array. We can store
the values in a HashMap for O(1) lookup for the second value

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Key = num val, value = num indice
        Map<Integer,Integer> numsHash = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            numsHash.put(nums[i], i);
        }

        int[] solution = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int neededVal = target - nums[i];
            if(numsHash.get(neededVal) != null) {
                solution[0] = i;
                solution[1] = numsHash.get(neededVal);
                break;
            }
        }

    // Return empty array if no results found
    return solution;
    }
}
*/

/* Now we traversed the array exactly twice, in two non-nested for loops
which leads to a time complexity of O(n) + O(n) = O(n)
However, we can remove duplicated code by traversing the array
just once, and populating the hashmap as we go */

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            // Key = num vals, value = num indices
            Map<Integer,Integer> numsHash = new HashMap<>();

            int[] solution = new int[2];
            for(int i = 0; i < nums.length; i++) {
                int neededVal = target - nums[i];
                if(numsHash.get(neededVal) != null) {
                    solution[0] = i;
                    solution[1] = numsHash.get(neededVal);
                    break;
                } else {
                    numsHash.put(nums[i], i);
                }
            }

            // Return empty array if no results found
            return solution;
        }
    }

/* We now have a single loop and add values to the hashmap for future
lookup if a match was not yet found. This remains O(n) but simplified to
a single loop */
}
