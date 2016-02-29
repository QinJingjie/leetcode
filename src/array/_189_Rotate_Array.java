package array;

public class _189_Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7};
		int k=10;
		nums = rotate(nums,k);
		for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]);
	}
	public static void RightRotate(int[] nums,int begin,int end){
		int tmp;
		for(;begin<end;begin++,end--){
			tmp = nums[begin];
			nums[begin] = nums[end];
			nums[end] = tmp;
		}
	}
	public static int[] rotate(int[] nums, int k) {
		int n = nums.length;
		k %= n;
		RightRotate(nums,0,n-k-1);
		RightRotate(nums,n-k,n-1);
		RightRotate(nums,0,n-1);
        return nums;
   }
}
