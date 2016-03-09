package array;

import java.util.ArrayList;
import java.util.List;

public class _118_Pascals_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows = 5;
		List<List<Integer>> result = generate(numRows);
		System.out.print(result);
	}
	public static List<List<Integer>> generate(int numRows) {
		List<Integer> pre = null;
		List<Integer> cur = null;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for(int i=0;i<numRows;i++){
			cur = new ArrayList<Integer>(i);
			cur.add(1);
			if(pre != null){
				cur = xishu(pre,cur);
			}
			pre = cur;
			result.add(cur);
		}
		return result;
	}
	public static List<Integer> xishu(List<Integer> pre,List<Integer> cur){
		for(int i=1;i<pre.size();i++){
			cur.add(pre.get(i-1)+pre.get(i));
		}
		cur.add(1);
		return cur;
	}
}
