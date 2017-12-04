#All code was tested in Microsoft Visual Studio

#Write a python program that extracts the email addresses of a file.

print("\nExercise 13:\n")
import re
#Define path of file 'emails_ex13.txt'
file = open('emails_ex13.txt', 'r')
file = file.read()

emails = re.findall(r'([^ ]+[@][^ ]+[.][a-z]+)', file)
print(emails)