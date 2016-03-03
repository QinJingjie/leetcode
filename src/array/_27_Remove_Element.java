package array;

public class _27_Remove_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int removeElement(int[] nums, int val) {
		 int j=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i] != val){
	                nums[j] = nums[i];//j一定小于等于i
	                j++;
	            }
	        }
	        return j;
	}
}
