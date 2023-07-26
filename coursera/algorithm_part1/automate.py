import os


current_path = os.getcwd()

entries = os.listdir(current_path)

for n in entries:
    if n.split('.')[-1] == 'java':
        print(n)