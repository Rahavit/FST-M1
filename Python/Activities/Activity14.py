def generate_fibonacci(n):
    fibonacci_seq = [0, 1]  # Initialize the sequence with the first two Fibonacci numbers

    if n <= 0:
        return []  # Return an empty list if the requested count is less than or equal to 0
    elif n <= 2:
        return fibonacci_seq[:n]  # Return the initial sequence if the requested count is 1 or 2

    for i in range(2, n):
        next_num = fibonacci_seq[i - 1] + fibonacci_seq[i - 2]  # Calculate the next Fibonacci number
        fibonacci_seq.append(next_num)  # Add the next number to the sequence

    return fibonacci_seq

# Get user input
count = int(input("How many Fibonacci numbers would you like to generate? "))

# Generate and print the Fibonacci sequence
fibonacci_sequence = generate_fibonacci(count)
print("Fibonacci sequence:", fibonacci_sequence)
