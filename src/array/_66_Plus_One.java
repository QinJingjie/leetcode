package array;

public class _66_Plus_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {9,9,9,8};
		int[] array = plusOne(digits);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
	}
	public static int[] plusOne(int[] digits) {
		int jinwei = 0;
		for(int i=digits.length-1;i>=0;i--){
			int value = digits[i]+1;
			digits[i] = value%10;
			jinwei = value/10;
			if(jinwei == 0){
				break;
			}
		}
		//如果最后一位进位了
		if(jinwei == 1){
			int[] array = new int[digits.length+1];
			for(int i=0;i<digits.length;i++){
				array[i+1] = digits[i];
			}
			array[0] = 1;
			return array;
		}
		else
			return digits;
		
	}

}
