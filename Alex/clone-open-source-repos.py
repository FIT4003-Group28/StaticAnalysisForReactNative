import json
import sys
import traceback
from git import Repo
import os
from subprocess import call

# If not already, run get-clone-urls.py
# Read in repo URLs from file
f = open("repos.txt", "r")
repos = f.read().splitlines() 
f.close()

# Create directory
PARENT_DIR = "/home/alex"
DIRECTORY = "/react-native-source"

def progress(op_code, cur_count, max_count, message):
    if op_code not in (32, 34):
        return

    if cur_count == max_count:
        print(f" {'Downloaded' if op_code == 32 else 'Installed '}       100%{' ' * 40}", end="\033[K\r")
        return print()

    msg = f"{'  Downloading...' if op_code == 32 else '  Installing... '}  "
    msg += f"{'%3d%%' % round(cur_count / max_count * 100)}"
    # msg += f"{'-' * round(cur_count / max_count * 33)} {round(cur_count / max_count * 100)}%"
    msg += f"   {message.split('|')[1] if len(message.split('|')) > 1 else ''}"
    print(msg, end="\033[K\r")


# Pull repos
#for i in range(0, len(output)):
for i in range(0, 10):
    new_directory = repos[i].split('/')[-1].split('.')[0]
    new_directory_path = PARENT_DIR + DIRECTORY + "/" + new_directory
    
    # Check if directory exists, and if so skip cloning
    if os.path.exists(new_directory_path):
        print("\nSkipping repo: " + new_directory + " because dir already exists")
    
    else:
        # Clone repo
        os.mkdir(new_directory_path)
        print("Starting clone of repo: " + new_directory)
        Repo.clone_from(repos[i], new_directory_path, progress=progress)
        print("Finished clone of repo: " + new_directory)

    try:
        print(new_directory_path + "/package.json")
        with open(new_directory_path + "/package.json", 'r') as f:
            json_obj = json.load(f)
            entry_point = json_obj.get("main", None) or "index.js"

    except Exception as e:
        print(e)
        # traceback.print_exc()
        # print(f"Couldnt find package.json in '{new_directory_path}'")

    else:
        rc = os.system(f"./hbcgen {new_directory_path} {f'{new_directory_path}/{entry_point}'} {entry_point.rstrip('.js') + '.hbc'}")

