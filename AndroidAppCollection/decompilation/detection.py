import os
import shutil

path = './'
target_dir = "../React_Bundle_File"


def collect_bundle_file(source_dir):
    for file in os.listdir(source_dir):
        if not file.endswith('.apk'):
            # print(file)
            file_dir = f"{source_dir}/{file}"

            if os.path.isdir(file_dir):
                for x in os.walk(file_dir):
                    for y in x:
                        if "index.android.bundle" in y:
                            bundle_path = f"{x[0]}" + "/index.android.bundle"
                            app_bundle_path = f"{target_dir}/{file}"
                            os.makedirs(app_bundle_path, exist_ok=True)
                            shutil.copy(bundle_path, app_bundle_path)


collect_bundle_file(path)

