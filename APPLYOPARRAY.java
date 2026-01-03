package DSARevision;

public class APPLYOPARRAY {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4,4,6,7,7};
        int[] res = applyOperations(nums);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
    public static int[] applyOperations(int[] nums) {
    int[] ans = new int[nums.length];

    for (int i = 0; i + 1 < nums.length; ++i)
      if (nums[i] == nums[i + 1]) {
        nums[i] *= 2;
        nums[i + 1] = 0;
      }

    int i = 0;
    for (final int num : nums)
      if (num > 0)
        ans[i++] = num;

    return ans;
        
    }    
}
