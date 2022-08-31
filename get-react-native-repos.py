import requests, json, datetime, operator
from cred import ACCESS_TOKEN
from progress.bar import Bar

# Define constants
TOPIC = "react-native"
SORT = "stars"
ORDER = "desc"
PER_PAGE = 100
MAX_ITERATIONS = 1000 # <-- important since GitHub has a maximum of 1000 results per query
MAX_RESULTS = 34000
URL_PREFIX = "https://api.github.com/search/repositories?q="
AUTH_HEADER = {'Authorization': 'token %s' % ACCESS_TOKEN, 'Accept': 'application/vnd.github.v3.raw'}

# Check constants
if MAX_ITERATIONS < PER_PAGE:
    raise Exception("PER_PAGE value must be less than MAX_ITERATIONS")

NUM_OF_PAGES_PER_REQUEST = int(MAX_ITERATIONS / PER_PAGE) 

# Begin repo list
output = []
output_dict = {}
low_range = 1
high_range = 1 + NUM_OF_PAGES_PER_REQUEST
date_now = datetime.datetime.now().strftime("%Y-%m-%dT%H:%M:%S")
stars = 999999
filter = " stars:<" + str(stars) + " pushed:<" + date_now


# Function to get request URL
def get_url(page_num):
    global filter, date_now
    # After 1000 results, get next stars/dates
    if page_num == 1 and len(output) > 0:
        filter = " stars:<=" + str((output[-1])['stars']) + " pushed:<" + date_now

    # Return new URL    
    return URL_PREFIX + "topic:" + TOPIC + filter + "&sort=" + SORT + "&order=" + ORDER + "&page=" + str(page_num) + "&per_page=" + str(PER_PAGE)

with Bar('Processing', max=MAX_RESULTS) as bar:
    inf_loop_detection = 0
    while len(output) < MAX_RESULTS:
        if inf_loop_detection == len(output) and inf_loop_detection > 0:
            print("\ninfinite loop detected")
            break
        inf_loop_detection = len(output)

        for i in range(low_range, high_range):
            try:
                # Send GET request
                url = get_url(i-(low_range-1))
                
                response = requests.get(url, headers=AUTH_HEADER)
                response_dict = response.json()
                repos = response_dict['items']
            except:
                break

            # Record resulting clone URLs
            for j in range(0, len(repos)):
                if repos[j]['full_name'] in output_dict.keys():
                    continue

                dictionary = {
                    'name': repos[j]['full_name'],
                    'clone_url': repos[j]['clone_url'],
                    'stars': repos[j]['stargazers_count'],
                    'forks': repos[j]['forks_count'],
                    'updated_at': repos[j]['updated_at'],
                    'default_branch': repos[j]['default_branch']
                }

                # Create a json object and add to array
                output_dict[repos[j]['full_name']] = len(output)
                output.append(dictionary)

                bar.next()
            
        # Sort array
        output = sorted(output, key=lambda x: (x['stars'], x['updated_at']), reverse=True)

        # Iterate variables
        low_range += NUM_OF_PAGES_PER_REQUEST
        high_range += NUM_OF_PAGES_PER_REQUEST

    bar.finish()

# Output repo URLs to a text file
with open('repos.json', 'w', encoding='utf-8') as f:
    for i in range(0, len(output)):
        f.write(json.dumps(output[i]) + "\n")