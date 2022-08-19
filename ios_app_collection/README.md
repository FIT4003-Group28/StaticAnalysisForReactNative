# Software Requirements (As Tested):
python: 3.8.6\
node: 16.14.2

# How To Run
Firstly, enter the email and password for the iTunes account that will be used to download the apps in ios_app_download.py. Ensure you have access to a device using this account as a 2FA code may be needed.

For bundle ids collection, iOS app download and filtering of React Native apps, a superscript can be run as such:\
sh ios_app_collection_superscript.sh

Note: The above handles the installation of required packages.

To run manually, first execute npm install (Not required if node_modules already exists).

Each module can then be run separately:
1) node ios_app_collection.js (To collect ios bundle ids into a csv file)
2) python3 ios_app_download.py (Download ipa files based on csv file)
3) python3 ios_app_react_native_filter.py (To filter out React Native apps)

Note: The above modules don't depend on each other, however each modules depends on the output of the module above it. Make sure the following are satisfied before running each module to get desired results.

1) node ios_app_collection.js (node_module exists)
2) python3 ios_app_download.py (csv file is populated with required bundle ids)
3) python3 ios_app_react_native_filter.py (ipa files exist in the directory ios_apps_ipa)
