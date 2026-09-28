public class SecondLargest {
    public int secondLargestElement(int[] nums) {
        int largest= Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        
        int n = nums.length;
        if (n<1){
            System.out.println("Cannot be compared");
        }
        for(int i =0; i<n;i++){
            if (nums[i]>largest){
                secondlargest=largest;
                largest=nums[i]; 
            }
            else if (nums[i]<largest&&nums[i]>secondlargest){
                secondlargest=nums[i];
            }
            else{
                secondlargest = -1;
            }
        }
        return secondlargest;
    }

    public static void main(String[] args) {
        int nums[]={2,2,2,2,2};
        SecondLargest obj= new SecondLargest();
        int result=obj.secondLargestElement(nums);
        System.out.println("Second largest element in the array is: "+result);
    }
}
