try:
    # Code that throws a NameError
    print(my_variable)
except NameError as e:
    # Handling the NameError
    print("NameError occurred:", e)
    print("Continuing with the program...")

# Rest of the program continues...
print("Program execution continued after handling the error.")
