from functools import total_ordering
from multiprocessing.reduction import duplicate
import requests, json, datetime, time
from cred import ACCESS_TOKEN
from progress.bar import Bar
from datetime import timedelta


# Define constants
TOPIC = "react-native"
LANGUAGE = ' language:"javascript" language:"typescript"'
SORT = 'updated'
ORDER = 'desc'
DAYS_PER_ITERATION = 7
LOWEST_FILTER_DATE = datetime.datetime(2015, 1, 1)
PER_PAGE = 100
URL_PREFIX = "https://api.github.com/search/repositories?q=" + "topic:" + TOPIC + LANGUAGE
URL_SUFFIX = "&per_page=" + str(PER_PAGE) + "&sort=" + SORT + "&order=" + ORDER
AUTH_HEADER = {'Authorization': 'token %s' % ACCESS_TOKEN, 'Accept': 'application/vnd.github.v3.raw'}


# Begin repo list
output = []
output_dict = {}
current_filter_date = datetime.datetime.now()


# Get total number of expected results
def get_total_num_results():
    # Return new URL    
    url = create_url(" pushed:>" + LOWEST_FILTER_DATE.strftime("%Y-%m-%dT%H:%M:%S"))

    try:
        response = requests.get(url, headers=AUTH_HEADER)
        response_dict = response.json()
        return response_dict['total_count']
    except:
        time.sleep(5)


# Get the date range for URL
def get_date_range(decrement_value):
    global current_filter_date

    lower_date_range = (current_filter_date - timedelta(days=decrement_value)).strftime("%Y-%m-%dT%H:%M:%S")
    return lower_date_range + ".." + current_filter_date.strftime("%Y-%m-%dT%H:%M:%S")


# Decrement the date
def decrement_date(decrement_value):
    global current_filter_date
    current_filter_date = current_filter_date - timedelta(days=decrement_value) - timedelta(seconds=1)
    # print(get_date_range(DAYS_PER_ITERATION))


# Create URL
def create_url(params):
    return URL_PREFIX + str(params) + URL_SUFFIX


# Function to get request URL
def get_repos(page_num, decrement_value):
    filter = " pushed:" + get_date_range(decrement_value) 

    # Return new URL
    url = create_url(filter + "&page=" + str(page_num))

    while True:
        try:
            response = requests.get(url, headers=AUTH_HEADER)
            response_dict = response.json()

            if response_dict['total_count'] > 1000:
                # print("\n" + str(response_dict['total_count']) + " for date range " + get_date_range())
                return False
            
            return response_dict['items']
        except:
            time.sleep(5)


# Get repos and append them to file per page loaded
with Bar('Processing', max=get_total_num_results()) as bar:
    with open('repos.json', 'w', encoding='utf-8') as f:
        current_page = 1
        decrement_value = DAYS_PER_ITERATION
        duplicate_hits = 0
        total_loops = 0

        while current_filter_date > LOWEST_FILTER_DATE:
            repos = get_repos(current_page, decrement_value)
            
            # Check that number of results is less than 1000
            if repos == False:
                if decrement_value == DAYS_PER_ITERATION:
                    decrement_value = 1
                elif decrement_value <= 1:
                    decrement_value /= 2
                continue

            output = []

            # Record resulting clone URLs
            for repo in repos:
                if repo['id'] in output_dict.keys():
                    duplicate_hits += 1
                    print("\n" + repo['full_name'])
                    continue

                dictionary = {
                    'id': repo['id'],
                    'name': repo['full_name'],
                    'clone_url': repo['clone_url'],
                    'stars': repo['stargazers_count'],
                    'forks': repo['forks_count'],
                    'updated_at': repo['updated_at'],
                    'default_branch': repo['default_branch']
                }

                # Create a json object and add to array
                output_dict[repo['id']] = None
                output.append(dictionary)

                bar.next()  

            for i in range(0, len(output)):
                f.write(json.dumps(output[i]) + "\n")  
            
            current_page += 1

            if current_page > 10 or len(repos) < PER_PAGE:
                decrement_date(decrement_value)
                decrement_value = DAYS_PER_ITERATION
                current_page = 1

                total_loops += 1
            
        bar.finish()
    f.close()

print("Duplicates hit: " + str(duplicate_hits) + " times")
print("Total loops: " + str(total_loops) + " times")

# Read in repos from file
f = open("repos.json", "r")
unsorted_repos = f.read().splitlines()
f.close()

# Convert list to list of JSON objects instead of strings
for i in range(0, len(unsorted_repos)):
    unsorted_repos[i] = (json.loads(unsorted_repos[i]))

print("\nSorting repos...")
# Sort array
sorted_output = sorted(unsorted_repos, key=lambda x: (x['stars'], x['updated_at']), reverse=True)
del unsorted_repos

# Output sorted repos back to text file
with open('repos.json', 'w', encoding='utf-8') as f:
    for i in range(0, len(sorted_output)):
        f.write(json.dumps(sorted_output[i]) + "\n")
f.close()
print("Getting repos complete!\n")
