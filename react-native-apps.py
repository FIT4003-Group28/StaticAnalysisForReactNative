import requests, os
from cred import ACCESS_TOKEN
from git import Repo

# Define constants
TOPIC = "react-native"
SORT = "stars"
ORDER = "desc"
PER_PAGE = 100
MAX_ITERATIONS = 1000 # <-- important since GitHub has a maximum of 1000 results per query, so there are 2 queries
AUTH_HEADER = {'Authorization': 'token %s' % ACCESS_TOKEN, 'Accept': 'application/vnd.github.v3.raw'}

# Begin repo list
output = []
lowest_star_count = 999999

# Check constants
if MAX_ITERATIONS < PER_PAGE:
    raise Exception("PER_PAGE value must be less than MAX_ITERATIONS")

NUM_OF_PAGES = int(MAX_ITERATIONS / PER_PAGE)    

# Get first half of results
for i in range(1, NUM_OF_PAGES + 1):
    url = "https://api.github.com/search/repositories?q=topic:" + TOPIC + "&sort=" + SORT + "&order=desc" + ORDER + "&page=" + str(i) + "&per_page=" + str(PER_PAGE)
    response = requests.get(url, headers=AUTH_HEADER)
    response_dict = response.json()
    repos = response_dict['items']

    # Record resulting clone URLs
    for j in range(0, PER_PAGE): 
        output.append(repos[j]['clone_url'])
        
        # Find the lowest star count from first half
        if lowest_star_count > repos[j]['stargazers_count']:
            lowest_star_count = repos[j]['stargazers_count']

# Append lowest stars from previous query to second query to get next 1000 results
STARS = "stars:<" + str(lowest_star_count)

# Get second half of results
for i in range(NUM_OF_PAGES + 1, (NUM_OF_PAGES * 2) + 1):
    url = "https://api.github.com/search/repositories?q=topic:" + TOPIC + " " + STARS + "&sort=" + SORT + "&order=desc" + ORDER + "&page=" + str(i - NUM_OF_PAGES) + "&per_page=" + str(PER_PAGE)
    response = requests.get(url, headers=AUTH_HEADER)
    response_dict = response.json()
    repos = response_dict['items']

    # Record resulting clone URLs
    for j in range(0, PER_PAGE): 
        output.append(repos[j]['clone_url'])

# Output repo URLs to a text file
with open('repos.txt', 'w', encoding='utf-8') as f:
    for i in range(0, len(output)):
        f.write(output[i] + "\n")

# Create directory
PARENT_DIR = "B:/"
DIRECTORY = "open-source-collection"

# Pull repos
#for i in range(0, len(output)):
for i in range(0, 5):
    new_directory = output[i].split('/')[-1].split('.')[0]
    new_directory_path = PARENT_DIR + DIRECTORY + "/" + new_directory
    
    # Check if directory exists, and if so skip cloning
    if os.path.exists(new_directory_path):
        print("Skipping repo: " + new_directory + " because dir already exists")
        continue

    # Clone repo
    os.mkdir(new_directory_path)
    print("Starting clone of repo: " + new_directory)
    Repo.clone_from(output[i], new_directory_path)
    print("Finished clone of repo: " + new_directory)