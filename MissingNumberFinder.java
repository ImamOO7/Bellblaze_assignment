import java.util.HashSet;
import java.util.Set;

public class MissingNumberFinder {

    public static Integer findMissingWithSet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        for (int i = min; i <= max; i++) {
            if (!numSet.contains(i)) {
                return i; 
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] data = {-3, -2, 0, 1, 2};
        Integer missing = findMissingWithSet(data);
        if (missing != null) {
            System.out.println("Missing number is: " + missing);
        } else {
            System.out.println("No missing number found.");
        }
    }
}
