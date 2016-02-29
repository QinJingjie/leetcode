package array;
import java.util.HashMap;


public class _219_Contains_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap map = new HashMap();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i]) && (i-(int)map.get(nums[i])) <= k)
				return true;
			else
				map.put(nums[i],i);			
		}
		
		return false;
	}
}
