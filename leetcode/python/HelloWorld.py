print("Hello, World")
name = input("Please enter your name: ")
print(f"Hello, {name}. Pleasure to meet you!")
age = input(f"How old are you, {name}?\n")
print(f"Wonderful! Your name is {name} and you are {age} years old")
print("Would you like to know how old you are in days?")
ageInDays = int(age) * 365
print(f"You are {ageInDays} days old")
