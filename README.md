# StaticAnalysisForReactNative

## Running GitHub Open Source Collection Script
To run this, need to add a Github Authentication Token in a file called 'cred.py'

This file should have a line that says ACCESS_TOKEN = "ghp_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX".

Get this access token by:
1. Selecting profile icon top corner
2. Select 'Settings'
3. Scroll down and select 'Developer Settings' from left nav bar
4. Select 'Personal access tokens' from the left nav bar
5. Generate a new token and paste it into your cred.py

https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token

## Running hbcgen File
Syntax: `./hbcgen <proj_dir> <entry_filename> <output_name>`
Where:
- proj_dir: the relative path to a react native project root directory
- entry_filename: the entry js file to compile from (usually `index.js`)
- output_name: the output filename for the hermes bytecode (e.g. `index.hbc`)
