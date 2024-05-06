score = 0
count = 0
even_inputs = 0
even_input_count = 0

while count < 10 :
	scores = int(input("Enter Score: "))
	if scores  >= 0 && scores <= 100:
		score += scores
		count = count +1
	else :
		print("Please enter a valid score")
		count = count - 1
print(f"Valid scrores = {score}");