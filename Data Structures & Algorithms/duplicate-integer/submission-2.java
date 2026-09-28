class Solution {
    public boolean hasDuplicate(int[] nums) {
        // we have an array of numbers that we loop through (ideally once)
        // we must check if an element has already shown up before in the array
        // if so -> return true
        // else -> return false
        // 1. Loop through the nums array
        // 2. Add that element to a new array
        // 3. On the next iteration - check if element is present in array
        // 4. If not in the array -> add it to the array
        // 5. If in array -> return true
        // 6. continue until the end
        // Time complexity: O(N^2)
        // Space complexity: O(1)
        ArrayList<Integer> newNums = new ArrayList<Integer>();
        if (nums.length > 0) {
            newNums.add(nums[0]);
        }

        for (int i = 1; i < nums.length; i++) {
            if (newNums.contains(nums[i])) {
                return true;
            } else {
                newNums.add(nums[i]);
            }
        }

        return false;
    }
}