numbers = list(input("Enter the list of numbers to sum: ").split(", "))
sum = 0

for number in numbers:
    sum += int(number)

print(sum)