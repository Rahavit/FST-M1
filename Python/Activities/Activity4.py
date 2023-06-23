# Get the users names
user1 = input("Enter Player1 name: ")
user2 = input("Enter Player2 name: ")

while True:
# Get the users choices
    user1_answer = input(user1 + ", do you want to choose rock, paper or scissor? ").lower()
    user2_answer = input(user2 + ", do you want to choose rock, paper or scissor? ").lower()

# Run the algorithm to see who wins
    if user1_answer == user2_answer:
        print("It's a tie!")
    elif user1_answer == 'rock':
        if user2_answer == 'scissor':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif user1_answer == 'scissor':
        if user2_answer == 'paper':
            print("Scissor win!")
        else:
            print("Rock wins!")
    elif user1_answer == 'paper':
        if user2_answer == 'rock':
            print("Paper wins!")
        else:
            print("Scissor win!")
    else:
        print("Please enter valid input:")

    nextRound = input("Do you want to play next round: enter Yes/No: ")
    if(nextRound == 'Yes'):
        pass
    elif(nextRound == 'No'):
        raise SystemExit()
    else:
        print("Entered option is not valid: ")
        raise SystemExit()