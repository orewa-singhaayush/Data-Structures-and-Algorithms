public class LargestElement {
    public int largestElement(int[] nums) {
        int largest=nums[0];
        for(int i =0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
            
        }
        return largest;
    
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        LargestElement obj = new LargestElement();
        int result=obj.largestElement(nums);
        System.out.println("Largest Element is: "+result);
    }
}
