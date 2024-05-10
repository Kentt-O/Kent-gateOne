public class CardValidator {

	public static void main(String... args){
		
		System.out.println(cardValidator("4234-5678-9012-3456"));

	}
	public static String cardValidator(String cardDigits){

		cardDigits = cardDigits.replace("-", "");
		if (cardDigits.length() != 16) {
			return "Invalid card number";
		}
		else if (cardDigits.charAt(0) != '4' && cardDigits.charAt(0) != '5' && cardDigits.charAt(0) != '6'){
			return "Invalid card number";
		}else {
			return "Valid";
		}
	}

}