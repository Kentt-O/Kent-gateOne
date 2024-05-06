score = 0
count = 0
even_indexes = 0

while count < 10 :
	scores = int(input("Enter Score: "))
	score += scores
	count = count +1
	if count % 2 == 0 :
		even_indexes += scores
print("Total score of even indexes are = ", even_indexes);