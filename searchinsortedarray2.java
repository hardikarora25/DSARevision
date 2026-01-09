package DSARevision;

public class searchinsortedarray2 {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <=high ){
            int mid = low + (high - low)/2;
            if(nums[mid]== target ) return true ;
            // the very edge case where lets say arr=[3 1 2 3 3 3 3] then our left and right sorted condition fails so we trim down the space that is causing trouble
            if(nums[low]==nums[mid] && nums[mid]== nums[high]){
                low = low+1;
                high = high - 1;
                continue;
            }
            // left sorted 
            if(nums[low]<=nums[mid]){
            if (target >=nums[low] && target<=nums[mid]){
                high = mid - 1;  
            }
            else{
                low = mid+1;
            }
            }
            //right sorted
            else{
                if(target >= nums[mid] && target <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return false;
        
    }
    
}
