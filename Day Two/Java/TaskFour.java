public class TaskFour {

	public static int [ ] evenIndexIn(int [ ] numbers){
		int evenIndex = 0
		for (int index = 0; index < numbers.length; index++){
			if (numbers[index] % 2 == 0){
				evenIndex = numbers[index];
			}
		}
		return evenIndex;
	}

}