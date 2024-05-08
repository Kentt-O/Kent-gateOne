import random

correct_answer_count = 0
wrong_answer_count = 0

for _ in range(10):
	digit_one = random.randint(1,20)
	digit_two = random.randint(1,10)

	if digit_one <= 5:
		random_arithmetic = digit_one + digit_two
		print(digit_one, " + ", digit_two)
		user_response = int(input("Enter the answer: "))
		if random_arithmetic == user_response:
			print("Correct !!")
			correct_answer_count +=1
		else:
			print("Wrong answer")
			wrong_answer_count += 1

	elif digit_one >5 and digit_one <= 10 :
		random_arithmetic = digit_one - digit_two
		print(digit_one, " - ", digit_two)
		user_response = int(input("Enter the answer: "))
		if random_arithmetic == user_response:
			print("Correct !!")
			correct_answer_count +=1
		else:
			print("Wrong answer")
			wrong_answer_count += 1

	elif digit_one >10 and digit_one <= 15 :
		random_arithmetic = digit_one * digit_two
		print(digit_one, " X ", digit_two)
		user_response = int(input("Enter the answer: "))
		if random_arithmetic == user_response:
			print("Correct !!")
			correct_answer_count +=1
		else:
			print("Wrong answer")
			wrong_answer_count += 1

	else:
		random_arithmetic = digit_one / digit_two
		print(digit_one, " / ", digit_two)
		user_response = int(input("Enter the answer: "))
		if random_arithmetic == user_response:
			print("Correct !!")
			correct_answer_count +=1
		else:
			print("Wrong answer")
			wrong_answer_count += 1

print("Correct answers = ", correct_answer_count)
print("Incorrect answers = ", wrong_answer_count)
