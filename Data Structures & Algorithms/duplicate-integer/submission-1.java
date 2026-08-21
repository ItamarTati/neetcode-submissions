class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numbersInArray = new HashSet<>();
        for(var index = 0; index < nums.length; index++) {
            var num = nums[index];
            if(numbersInArray.contains(num)) {
                return true;
            }
            numbersInArray.add(num);
        }
        return false;
    }
}