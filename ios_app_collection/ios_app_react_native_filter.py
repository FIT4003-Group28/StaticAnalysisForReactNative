import os
import shutil
import zipfile


def main():
    ios_apps_ipa_dir = "./ios_apps_ipa"
    react_native_apps_dir = "./react_native_apps"

    copy_files(ios_apps_ipa_dir, react_native_apps_dir)
    ipa_to_zip(react_native_apps_dir)
    unzip(react_native_apps_dir)
    filter_react_native_apps(react_native_apps_dir)

def copy_files(source_dir, target_dir):
    files = os.listdir(source_dir)  
    for file in files:
        shutil.copy(os.path.join(source_dir, file), target_dir)

def ipa_to_zip(dir):
    for file in os.listdir(dir):
        try:
            if (file.endswith(".ipa")):
                os.rename(f"{dir}/{file}", f"{dir}/{file[:-4]}.zip")
        except Exception as e:
            print(e)

def unzip(dir):
    for file in os.listdir(dir):
        try:
            if (file.endswith(".zip")):
                app_dir = f"{dir}/{file[:-4]}"        
                if not os.path.isdir(app_dir):
                    os.mkdir(app_dir)
                    with zipfile.ZipFile(f"{dir}/{file}", 'r') as zip_ref:
                        zip_ref.extractall(app_dir)
                    os.remove(f"{dir}/{file}")
        except Exception as e:
            print(e)

def filter_react_native_apps(dir):
    for file in os.listdir(dir):
        file_dir = f"{dir}/{file}"
        if os.path.isdir(file_dir):
            for x in os.walk(file_dir):
                if ".app/_CodeSignature" in x[0] and "CodeResources" in x[2]:
                    filepath = f"{x[0]}/{x[2][0]}"
                    with open(filepath) as f:
                        if not 'hermes.framework' in f.read():
                            dir_name = x[0].split("/Payload")[0]
                            if os.path.isdir(file_dir):
                                shutil.rmtree(dir_name)




if __name__ == "__main__":
    main()
