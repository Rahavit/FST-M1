import pandas as pd

# Create a dictionary with the data
data = {
    'FirstName': ['Satvik', 'Avinash', 'Lahri'],
    'LastName': ['Shah', 'Kati', 'Rath'],
    'Email': ['satshah@example.com', 'avinashk@example.com', 'lahri.rath@example.com'],
    'PhoneNumber': ['4537829158', '5892184058', '4528727830']
}

# Create a DataFrame from the dictionary
df = pd.DataFrame(data)

# Write the DataFrame to an Excel file
df.to_excel('myExceldata.xlsx', index=False)
