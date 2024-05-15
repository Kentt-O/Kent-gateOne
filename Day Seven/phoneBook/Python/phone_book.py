first_name_storage = [ ]
last_name_storage = [ ]
phonenumber_storage = [ ]

user_response = 9
while user_response != 0:
    prompt = """
    : : : : : : : : : : : : : : : : : :         
    :: Welcome to your new phonebook ::
    : : : : : : : : : : : : : : : : : :   
    Select an option 
    1 -> Add Contact
    2 -> Remove Contact
    3 -> Find contact by phone number
    4 -> Find contact by first name
    5 -> Find contact by last name
    6 -> Edit contact
    0 -> Close Phonebook
    """
print(prompt)
user_response = int(input("Enter your choice: "))

match user_response:
	case 1:
            print(add_contact())
        case 2:
            print(remove_contact())
        case 3:
            print(find_contact_by_phone_number())
        case 4:
            print(find_contact_by_first_name())
        case 5:
            print(find_contact_by_last_name())
        case 6:
            print(edit_contact())
        case 0:
            print("Afeez hope you enjoyed using your new phonebook, Goodbye")
        default:
            print("Invalid Selection, Select option between 1 to 6")



def add_contact():
	first_name = input("Enter first name: ")
        last_name = input("Enter last name: ")
        phone_number = input("Enter phone number: ")

        first_name_storage.append(first_name)
        last_name_storage.append(last_name)
        phonenumber_storage.append(phone_number)
        print(f"Contact {first_name} {last_name} saved successfully!")

def remove_contact():
        name_to_remove = input("Enter the first name of the contact to remove: ")

        if name_to_remove in first_name_storage:
            index = first_name_storage.index(name_to_remove)
            first_name_storage.pop(index)
            last_name_storage.pop(index)
            phonenumber_storage.pop(index)
            print(f"Contact {name_to_remove} removed successfully!")
        else:
            print("Contact not found!")


