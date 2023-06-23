# Create a dictionary of fruits and their prices
fruits = {
    "apple": 220,
    "banana": 50,
    "orange": 180,
    "kiwi": 240,
    "mango": 150
}

# Function to check if a fruit is available
def check_fruit_availability(fruit):
    if fruit in fruits:
        print(f"The fruit '{fruit}' is available. Price: Rs{fruits[fruit]}")
    else:
        print(f"The fruit '{fruit}' is not available.")

#Check the fruit is availabel or not
check_fruit_availability("apple")    # Available
check_fruit_availability("grape")    # Not available
check_fruit_availability("kiwi")     # Available
