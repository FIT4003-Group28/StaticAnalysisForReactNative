import csv
import os
import shutil


def main():
    email = "ENTER_EMAIL"
    password = "ENTER_PASSWORD"

    try:
        list_of_bundle_ids = []

        # Read csv file and store the bundle ids in a list
        with open('ios_bundle_ids.csv') as f:
            reader = csv.reader(f)
            list_of_bundle_ids = flatten(list(reader))

        # Authenticate user
        os.system(f"ipatool auth login --email {email} --password {password}")
        
        # IOS app download
        for i in list_of_bundle_ids:
            try:
                os.system(f"ipatool download --bundle-identifier {i} --purchase")
            except:
                os.system(f"ipatool auth login --email {email} --password {password}")
                os.system(f"ipatool download --bundle-identifier {i} --purchase")

    except Exception as e:
        raise Exception(e)
    finally:
        # Source (https://stackoverflow.com/questions/41826868/moving-all-files-from-one-directory-to-another-using-python)
        # Once downloaded, get all the ipa files in the current directory
        source_dir = '.'
        target_dir = './ios_apps'
        files_in_curr_dir = os.listdir(source_dir)  
        ipa_files = list(filter(lambda x: x.endswith(".ipa"), files_in_curr_dir))

        # Move the ipa files from source directory to destination
        for ipa_file in ipa_files:
            shutil.move(os.path.join(source_dir, ipa_file), target_dir)

# To flatten a list (https://stackoverflow.com/questions/952914/how-do-i-make-a-flat-list-out-of-a-list-of-lists)
def flatten(l):
    return [item for sublist in l for item in sublist]

if __name__ == "__main__":
    main()
