import json, requests
from progress.bar import Bar
from threading import Thread
from queue import Queue
from cred import ACCESS_TOKEN

class RepoThread(Thread):
    def __init__(self, id, input_queue, output_queue):
        Thread.__init__(self)

        self.id = id
        self.input_queue = input_queue
        self.output_queue = output_queue


    def validate_is_react_native(self, repository):
        files_to_search = ["yarn.lock", "package-lock.json"]
        content = ""
            
        for file in files_to_search:
            url = f"{URL_PREFIX}/{repository['name']}/{repository['default_branch']}/{file}"
            response = requests.get(url, headers=AUTH_HEADER)
            if response.status_code == 200:
                content = response.text
                break
        
        if content == "":
            return False

        if "\"react-native@" in content:
            return True
        if '"react-native":' in content:
            return True
        return False

    def run(self):
        #print(f"Thread {self.id} has started up")
        while True:
            repo = input_queue.get()
            if repo is None:
                output_queue.put(None)
                break

            is_valid = self.validate_is_react_native(repo)
            # print("Thread %2d: Validated [%s] '%s'" % (self.id, str(is_valid), repo['name']))
            if is_valid:
                self.output_queue.put(repo)
            else:
                self.output_queue.put({})

# Define constants
# URL_PREFIX = "https://api.github.com/repos/"
URL_PREFIX = "https://raw.githubusercontent.com"
AUTH_HEADER = {'Authorization': 'token %s' % ACCESS_TOKEN, 'Accept': 'application/vnd.github.v3.raw'}

# If not already, run get-clone-urls.py
# Read in repo URLs from file
f = open("repos.json", "r")
repos = f.read().splitlines()
f.close()

validated_repos = []

valid_count = 0
# Convert json string to python dictionary
with Bar('Validating', max=len(repos)) as bar:
    input_queue = Queue()
    output_queue = Queue()

    thread_count = 50
    threads = []

    for repo in repos:
        input_queue.put(json.loads(repo))
    
    for i in range(thread_count):
        t = RepoThread(i+1, input_queue, output_queue)
        t.start()
        threads.append(t)
        input_queue.put(None)

    # Output repo URLs to a text file
    with open('repos_valid.json', 'w', encoding='utf-8') as f:
        none_count = 0
        while True:
            repo = output_queue.get()
            if repo is None:
                none_count += 1
            if none_count >= thread_count:
                break

            if repo is not None and repo != {}:
                f.write(json.dumps(repo) + "\n")
                validated_repos.append(repo)

            bar.next()

    for thread in threads:
        thread.join()

    bar.finish()

print(f"Valid: {len(validated_repos)} / {len(repos)}")