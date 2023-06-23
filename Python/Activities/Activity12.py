def calculate_sum_recursive(n):
    if n == 0:
        return 0
    else:
        return n + calculate_sum_recursive(n - 1)

# Call the recursive function with initial value as 10
result = calculate_sum_recursive(10)
print("Sum:", result)
