list1 = [1, 2, 3, 50, 23]
list2 = [10, 20, 23, 33, 43]
list3 = []

for num in list1:
    if (num % 2 != 0):
        list3.append(num)

for num in list2:
    if (num % 2 == 0):
        list3.append(num)

# Print result
print("List3 is:")
print(list3)