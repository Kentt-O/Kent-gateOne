function int [ ] evenIndexIn(int [ ] numbers){
	int evenIndex = 0
	for (let index = 0; index < numbers.length; index++){
		if (numbers[index] % 2 == 0){
			evenIndex = numbers[index];
		}
	}
	return evenIndex;
}

