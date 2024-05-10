def card_validator(card_digits):
	card_digits = card_digits.replace('-', '')
	if len(card_digits) != 16:
		return "Invalid card number"
	elif card_digits[0] != '4' and card_digits[0] != '5' and card_digits[0] != '6' :
		return "Invalid card number"
	else:
		return "Valid"



print(card_validator("5234-5678-9012-3456"))


