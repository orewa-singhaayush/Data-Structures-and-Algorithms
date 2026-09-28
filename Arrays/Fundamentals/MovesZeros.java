class Solution{
    public void moves(int []nums){
        int zeroPosition = 0;
        int n = nums.length;
        for(int current =0;current<n;current++)
        {
            if(nums[current]!=0)
            {
                int temp = nums[current];
                nums[current] = nums[zeroPosition];
                nums[zeroPosition] = temp;

                zeroPosition++;
            }

        }
    }
}



public class MovesZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
 
        Solution solution = new Solution();
        solution.moves(nums);
 
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
