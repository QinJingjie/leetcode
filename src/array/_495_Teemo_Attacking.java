package array;

public class _495_Teemo_Attacking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] timeSeries = {1,2};
		int duration = 2;
		System.out.println(findPoisonedDuration(timeSeries,duration));
	}
	public static int findPoisonedDuration(int[] timeSeries, int duration) {
		int attackTime = 0;	
		if(timeSeries.length == 0)
			return 0;
		else{
			int startTime = timeSeries[0];
			for(int i=1;i<timeSeries.length;i++){
				if(startTime+duration<timeSeries[i]){
					startTime = timeSeries[i];
					attackTime += duration;
				}
				else{
					attackTime += timeSeries[i]-timeSeries[i-1];
					startTime = timeSeries[i];
				}
			}
			attackTime += duration;
			return attackTime;
		}
	}

}
