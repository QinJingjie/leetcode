package array;
import java.util.HashSet;

public class _217Contains_Duplocate {
	public static void main(String[] args){
		int[] nums = {4,3,7,2,-4,4,9};
		boolean a = containsDuplicate(nums);
		System.out.print(a);
	}
	public static boolean containsDuplicate(int[] nums) {
		HashSet hash = new HashSet();
		for(int i=0;i<nums.length;i++){
			if(!hash.add(nums[i])){
				return true;
			}
		}
		return false;
	}


}
