public class AddTwoNumber {

/*
*
*
* */

    public static void main(String[] args) {
        AddTwoNumber addTwoNumber = new AddTwoNumber();
        /*
        * TEST CASES
        * */

         addTwoNumber.twoSum(new int[]{2,5,5,11},10);
        // addTwoNumber.twoSum(new int[]{3,3},6);
    }


    public int[] twoSum(int[] nums, int target) {

        for(int i = 0;i< nums.length;i++)
        {
            for(int j = i+1; j <nums.length ;j++)
            {
                if(nums[j]== target-nums[i])
                {
                    System.out.println("["+i+","+j+"]");
                    return new int[]{i,j};
                }
            }

        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
