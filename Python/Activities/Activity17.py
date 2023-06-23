import pandas as pd

# Create a dictionary with the data
data = {
    'Usernames': ['admin', 'Charles', 'Deku'],
    'Passwords': ['password', 'Charl13', 'AllMight']
}

# Create a DataFrame from the dictionary
df = pd.DataFrame(data)

# Write the DataFrame to a CSV file
df.to_csv('mydata.csv', index=False)
