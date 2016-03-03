package array;

public class _26_Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,2,2,3,3,3};
		System.out.println(removeDuplicates(nums));
	}
	public static int removeDuplicates(int[] nums) {
		int j = 0;
		for(int i=0;i<nums.length;i++){
			while(i<nums.length-1&&nums[i] == nums[i+1]){
				i++;
			}
			nums[j++] = nums[i];
		}
		return j;
	}
}
