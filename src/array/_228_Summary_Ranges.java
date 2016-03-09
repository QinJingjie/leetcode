package array;

import java.util.ArrayList;
import java.util.List;

public class _228_Summary_Ranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,4,5,7};
		List<String> list = summaryRanges(nums);
		System.out.println(list);
	}
	public static List<String> summaryRanges(int[] nums) {
		int start = 0,end = 0;
		List<String> list = new ArrayList<>();
		for(int i=0;i<nums.length;i++){
			while(i<nums.length-1 && (nums[i+1] == nums[i]+1)){
				i++;
			}
			end = i;
			if(start == end){
				list.add(String.valueOf(nums[start]));
			}
			else{
				list.add(String.valueOf(nums[start])+"->"+String.valueOf(nums[end]));
			}
			start = i+1;
		}
		return list;
	}
}
