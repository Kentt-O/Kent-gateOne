from datetime import datetime


start_date = input("Enter the start date of your last menstrual cycle (YYYY-MM-DD): ")
start_date_two = input("Enter the start date of your current menstrual cycle (YYYY-MM-DD): ")

days = calculate_menstrual_cycle(start_date, start_date_two)
if days < 21 or days > 35:
    print(f"Days since last menstrual cycle : {days} you have an abnormal cycle, please see a doctor")
else:
    print(f"Days since last menstrual cycle: {days}")

ovulation_range = calculate_ovulation(start_date_two)
print(f"Ovulation : {ovulation_range}")


def calculate_menstrual_cycle(start_date, start_date_two):
	menstrual_cycle_start_date = datetime.strptime(start_date, '%Y-%m-%d')
    	current_date = datetime.strptime(start_date_two, '%Y-%m-%d')
   	return (current_date - menstrual_cycle_start_date).days

def calculate_ovulation(start_date_two):
   	date = datetime.strptime(start_date_two, '%Y-%m-%d')
