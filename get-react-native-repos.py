import requests, json, datetime, time
from cred import ACCESS_TOKEN
from progress.bar import Bar
from datetime import timedelta

# Define constants
TOPIC = "react-native"
PER_PAGE = 100
MAX_RESULTS = 34500
URL_PREFIX = "https://api.github.com/search/repositories?q="
AUTH_HEADER = {'Authorization': 'token %s' % ACCESS_TOKEN, 'Accept': 'application/vnd.github.v3.raw'}


# Begin repo list
output = []
output_dict = {}
current_filter_date = datetime.datetime.now()
LOWEST_FILTER_DATE = datetime.datetime(2015, 1, 1)

# Get the date range for URL
def get_date_range():
    global current_filter_date
    lower_date_range = (current_filter_date - timedelta(days=7)).strftime("%Y-%m-%dT%H:%M:%S")
    return lower_date_range + ".." + current_filter_date.strftime("%Y-%m-%dT%H:%M:%S")

# Decrement the date
def decrement_date():
    global current_filter_date
    current_filter_date = current_filter_date - timedelta(days=7)

# Function to get request URL
def get_repos(page_num):
    filter = " pushed:" + get_date_range()

    # Return new URL    
    url = URL_PREFIX + "topic:" + TOPIC + filter + "&page=" + str(page_num) + "&per_page=" + str(PER_PAGE)

    while True:
        try:
            response = requests.get(url, headers=AUTH_HEADER)
            response_dict = response.json()
            return response_dict['items']
        except:
            time.sleep(5)

# Get repos and append them to file per page loaded
with Bar('Processing', max=MAX_RESULTS) as bar:
    with open('repos.json', 'w', encoding='utf-8') as f:
        current_page = 1

        while current_filter_date > LOWEST_FILTER_DATE:
            repos = get_repos(current_page)
            output = []

            # Record resulting clone URLs
            for repo in repos:
                if repo['full_name'] in output_dict.keys():
                    continue

                dictionary = {
                    'name': repo['full_name'],
                    'clone_url': repo['clone_url'],
                    'stars': repo['stargazers_count'],
                    'forks': repo['forks_count'],
                    'updated_at': repo['updated_at'],
                    'default_branch': repo['default_branch']
                }

                # Create a json object and add to array
                output_dict[repo['full_name']] = len(output)
                output.append(dictionary)

                bar.next()  

            for i in range(0, len(output)):
                f.write(json.dumps(output[i]) + "\n")  
            
            current_page += 1

            if current_page > 10 or len(repos) < PER_PAGE:
                decrement_date()
                current_page = 1

        bar.finish()
    f.close()


# Read in repos from file
f = open("repos.json", "r")
unsorted_repos = f.read().splitlines()
f.close()

# Convert list to list of JSON objects instead of strings
for i in range(0, len(unsorted_repos)):
    unsorted_repos[i] = (json.loads(unsorted_repos[i]))

print("\nSorting repos")
# Sort array
sorted_output = sorted(unsorted_repos, key=lambda x: (x['stars'], x['updated_at']), reverse=True)
del unsorted_repos

# Output sorted repos back to text file
with open('repos.json', 'w', encoding='utf-8') as f:
    for i in range(0, len(sorted_output)):
        f.write(json.dumps(sorted_output[i]) + "\n")
f.close()
