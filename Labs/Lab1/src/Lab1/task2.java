package Lab1;

public class task2 {
	public static void main(String[] args){
		int [] nums = {2,7,11,15};
		int target = 9;
		
		int[] answer = twoSum(nums, target);
		System.out.println("The two numbers in the array \n"
				+ "that equal " + target + " are " + answer[0] + " " + answer[1]);
	}
	
	public static int[] twoSum (int[] nums, int target){
		int[] indexes = new int [2];
		for(int i =0; i<nums.length-2;i++){
			

			for(int j=i+1;j<nums.length-1;j++){
				int check = nums[i];
				check +=  nums[j];
				if(check == target){
					indexes[0] = nums[i];
					indexes[1] = nums[j];
					return indexes;
				}
				else{
					check = check-nums[j];
				}
			}
		}
		
		return indexes;
		
	}
}
