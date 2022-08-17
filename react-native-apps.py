import requests
from cred import ACCESS_TOKEN

TOPIC = "react-native"
SORT = "stars"
ORDER = "desc"
PER_PAGE = 100
MAX_ITERATIONS = 1000

AUTH_HEADER = {'Authorization': 'token %s' % ACCESS_TOKEN, 'Accept': 'application/vnd.github.v3.raw'}

output = []
lowest_star_count = 999999

for i in range(0, int(MAX_ITERATIONS / PER_PAGE)):
    url = "https://api.github.com/search/repositories?q=topic:" + TOPIC + "&sort=" + SORT + "&order=desc" + ORDER + "&page=" + str(i) + "&per_page=" + str(PER_PAGE)
    response = requests.get(url, headers=AUTH_HEADER)
    response_dict = response.json()
    repos = response_dict['items']

    for j in range(0, PER_PAGE): 
        output.append(repos[j]['clone_url'] + ", stars: " + str(repos[j]['stargazers_count']) + "\n")
        
        if lowest_star_count > repos[j]['stargazers_count']:
            lowest_star_count = repos[j]['stargazers_count']

STARS = "stars:<" + str(lowest_star_count)

for i in range(int(MAX_ITERATIONS / PER_PAGE), int(MAX_ITERATIONS*2 / PER_PAGE)):
    url = "https://api.github.com/search/repositories?q=topic:" + TOPIC + " " + STARS + "&sort=" + SORT + "&order=desc" + ORDER + "&page=" + str(i - (MAX_ITERATIONS/PER_PAGE)) + "&per_page=" + str(PER_PAGE)
    response = requests.get(url, headers=AUTH_HEADER)
    response_dict = response.json()
    repos = response_dict['items']

    for j in range(0, PER_PAGE): 
        output.append(repos[j]['clone_url'] + ", stars: " + str(repos[j]['stargazers_count']) + "\n")

with open('repos.txt', 'w', encoding='utf-8') as f:
    f.writelines(output) 