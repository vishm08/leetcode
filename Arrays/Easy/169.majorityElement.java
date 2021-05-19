package Leetcode.Arrays.Easy;

class majorityElement {

    public static int majorElem(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for(int num : nums) {
            if(count==0) candidate = num;

            count += (candidate==num) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2,2};

        int res = majorElem(nums);

        System.out.println(res);
    }
}