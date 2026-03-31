class Solution {
    HashSet<Integer> list = new HashSet<Integer>();
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        if(list.size() < nums.length){
            return true;
        }else{
            return false;
        }
    }
}