import pandas as pd

# Read the Excel file into a DataFrame
df = pd.read_excel('myExceldata.xlsx')

# Print the number of rows and columns
num_rows, num_cols = df.shape
print(f"Number of rows: {num_rows}")
print(f"Number of columns: {num_cols}")

# Print the data in the 'Email' column only
email_column = df['Email']
print("Emails:")
print(email_column)

# Sort the data based on 'FirstName' in ascending order and print the data
sorted_data = df.sort_values('FirstName')
print("Sorted data by FirstName:")
print(sorted_data)
