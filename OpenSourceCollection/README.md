# StaticAnalysisForReactNative

To run this, need to add a Github Authentication Token in a file called 'cred.py'

This file should have a line that says ACCESS_TOKEN = "ghp_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX".

Get this access token by:
1. Selecting profile icon top corner
2. Select 'Settings'
3. Scroll down and select 'Developer Settings' from left nav bar
4. Select 'Personal access tokens' from the left nav bar
5. Generate a new token and paste it into your cred.py

https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token

To use this tool, use in order:
1. Run get-react-native-repos.py to generate repos.json
2. Run validate-react-native-repos.py to validate the found repos to generate repos_valid.json
3. Run clone-react-native-repos.py to clone all of the valid repositories