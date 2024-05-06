score = 0
count = 0
even_inputs = 0
even_input_count = 0

while count < 10 :
	scores = int(input("Enter Score: "))
	score += scores
	count = count +1
	if scores % 2 == 0 :
		even_inputs += scores
		even_input_count +=1
print(f"Average score of even inputs is = {even_inputs/even_input_count}");