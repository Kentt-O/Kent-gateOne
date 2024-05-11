"use strict"
function cardValidator(cardDigits){
	cardDigits = cardDigits.replace('-', '')
	if (cardDigits.length !== 16) {
        	return "Invalid card number";
   	} else if (cardDigits[0] !== '4' && cardDigits[0] !== '5' && cardDigits[0] !== '6') {
        	return "Invalid card number";
    	} else {
        	return "Valid";
    	}
}
console.log(cardValidator("4234-5678-9012-3456"))