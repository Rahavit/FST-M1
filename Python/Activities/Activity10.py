# User input for the tuple
tuple_values = input("Enter the numbers separated by a space: ").split()
numbers_tuple = tuple(map(int, tuple_values))
print(numbers_tuple)

print("Numbers divisible by 5:")
for num in numbers_tuple:
    if num % 5 == 0:
        print(num)
