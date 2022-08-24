from git import Repo
import os

# If not already, run get-clone-urls.py
# Read in repo URLs from file
f = open("repos.txt", "r")
repos = f.read().splitlines() 
f.close()

# Create directory
PARENT_DIR = "B:/"
DIRECTORY = "open-source-collection"

# Pull repos
#for i in range(0, len(output)):
for i in range(0, 6):
    new_directory = repos[i].split('/')[-1].split('.')[0]
    new_directory_path = PARENT_DIR + DIRECTORY + "/" + new_directory
    
    # Check if directory exists, and if so skip cloning
    if os.path.exists(new_directory_path):
        print("Skipping repo: " + new_directory + " because dir already exists")
        continue

    # Clone repo
    os.mkdir(new_directory_path)
    print("Starting clone of repo: " + new_directory)
    Repo.clone_from(repos[i], new_directory_path)
    print("Finished clone of repo: " + new_directory)