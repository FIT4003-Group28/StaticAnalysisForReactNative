from git import Repo
import json, os
from progress.bar import Bar
from threading import Thread
from queue import Queue

# Define constants
PARENT_DIR = "B:/"
DIRECTORY = "open-source-collection"

class RepoThread(Thread):
    def __init__(self, id, input_queue):
        Thread.__init__(self)

        self.id = id
        self.input_queue = input_queue

    def clone_repository(self, repository):
        new_directory = repository['name']
        new_directory = new_directory.split("/") 
        new_directory = new_directory[1] + " (" + new_directory[0] + ")"
        new_directory_path = PARENT_DIR + DIRECTORY + "/" + new_directory
        
        # Check if directory exists, and if so skip cloning
        if os.path.exists(new_directory_path):
            #print("Skipping repo: " + new_directory + " because dir already exists")
            return

        # Clone repo
        os.mkdir(new_directory_path)
        #print("Starting clone of repo: " + new_directory)
        Repo.clone_from(repository['clone_url'], new_directory_path)
        #print("Finished clone of repo: " + new_directory)
        

    def run(self):
        #print(f"Thread {self.id} has started up")
        while True:
            repo = input_queue.get()
            if repo is None:
                break

            self.clone_repository(repo)
            bar.next()



# If not already, run get-react-native-repos.py and validate-react-native-repos.py subsequently
# Read in valid repo URLs from file
f = open("repos_valid.json", "r")
repos = f.read().splitlines()
f.close()

# Limit repos for now
repos = repos[0:7]

# Convert json string to python dictionary
with Bar('Downloading', max=len(repos)) as bar:
    input_queue = Queue()

    thread_count = 5
    threads = []
    output_count = 0

    for repo in repos:
        input_queue.put(json.loads(repo))

    for i in range(thread_count):
        t = RepoThread(i+1, input_queue)
        t.start()
        threads.append(t)
        input_queue.put(None)

        # bar.next()

    for thread in threads:
        thread.join()

    bar.finish()



