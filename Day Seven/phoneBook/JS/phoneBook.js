let firstNameStorage = [];
let lastNameStorage = [];
let phoneNumberStorage = [];

let userResponse = 9;
while (userResponse != 0) {
	let phoneBookPrompt = `
    		:: Welcome to your new phonebook ::
    		Select an option 
    		1 -> Add Contact
    		2 -> Remove Contact
    		3 -> Find contact by phone number
    		4 -> Find contact by first name
    		5 -> Find contact by last name
    		6 -> Edit contact
    		0 -> Close Phonebook
    		`;
	
	console.log(phoneBookPrompt);
    	userResponse = parseInt(prompt("Enter your choice: "));

    	switch(userResponse) {
        	case 1:{
            		console.log(addContact());
            		break;
		}
        	case 2:{
            		console.log(removeContact());
            		break;
		}
        	case 3:{
            		console.log(findContactByPhoneNumber());
            		break;
		}
        	case 4:{
            		console.log(findContactByFirstName());
            		break;
		}
        	case 5:{
            		console.log(findContactByLastName());
            		break;
		}
        	case 6:{
            		console.log(editContact());
            		break;
		}
        	case 0:{
            		console.log("Afeez hope you enjoyed using your new phonebook, Goodbye");
            		break;
		}
        	default:{
            		console.log("Invalid Selection, Select option between 1 to 6");
		}
    	}
}

function addContact() {
    let firstName = prompt("Enter first name: ");
    let lastName = prompt("Enter last name: ");
    let phoneNumber = prompt("Enter phone number: ");

    firstNameStorage.push(firstName);
    lastNameStorage.push(lastName);
    phoneNumberStorage.push(phoneNumber);
    console.log(`Contact ${firstName} ${lastName} saved successfully!`);
}


