import os
from subprocess import run

# folder path
dir_path = os.getcwd()

# list to store files
files_in_directory = []

# Iterate directory
for path in os.listdir(dir_path):
    # check if current path is a file
    if os.path.isfile(os.path.join(dir_path, path)):
        files_in_directory.append(path)

print(files_in_directory)

for file in files_in_directory:
    if file.endswith('.apk'):
        inputString = 'jadx ' + file
        run(inputString, shell=True)


#  de-compilation of apk files
#  please install jadx first
