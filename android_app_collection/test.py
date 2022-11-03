import os
import subprocess
from subprocess import run
import pandas as pd
import csv
import concurrent.futures
import os.path

# file name = name of the file to be opened
# the file should have one column with the pkg_name of the popular apps

def get_popular_android_app_pkg_name(file_name):

    file_csv = open(file_name)
    data_csv = csv.reader(file_csv)
    list_csv = list(data_csv)

    concat_pkg_name = []

    for pkg_name in list_csv:
        concat_pkg_name += pkg_name

    return concat_pkg_name


popular_package_name = get_popular_android_app_pkg_name('/home/android-app/AndroZoo/StaticAnalysisForReactNative/android_app_collection/package_name_data/gplay_package_name.csv')


def get_sha256_from_pkg_name(array_of_pkg_name, file_list_of_sha256):

    some_data = pd.read_csv(file_list_of_sha256, index_col="pkg_name")
    array_of_sha256_local = []

    for pkg_name in array_of_pkg_name:
        pkg_name = "   " + pkg_name + " "
        try:
            pkg_detection = some_data.loc[pkg_name, ["sha256"]]
            array_of_sha256_local.append(pkg_detection.sha256)
        except:
            pass
    
    return array_of_sha256_local


array_of_sha256 = get_sha256_from_pkg_name(popular_package_name, "/home/android-app/AndroZoo/StaticAnalysisForReactNative/android_app_collection/filter_unique_latest.csv")


apiKeyString = '0bfb176ee4d69e6ff4d845e1f4e2c007806642c207cf642d64b2c226da0f0256'
# sha256String_1 = '00EAEBC92AD352A1DB3449CA7C6B1B54BDC0A916FFA0915DA749C2A61CCE76D7'

i = 0

# for sha_256 in array_of_sha256:
#     i = i+1
#     inputString = 'curl -O  --remote-header-name -G -d apikey=' + apiKeyString + ' -d sha256=' + sha_256 + ' \https://androzoo.uni.lu/api/download'

#     run(inputString, shell=True)
#     if i == 9:
#         break;
filePath = '/home/android-app/AndroZoo/dataset/'
def download_apk(sha_256):
    try:
        print("SHA256: " + sha_256)
        inputString = 'curl -O  --remote-header-name -G -d apikey=' + apiKeyString + ' -d sha256=' + sha_256 + ' \https://androzoo.uni.lu/api/download'
        run(inputString, shell=True)        
    except:
        print('error with item')

executor = concurrent.futures.ProcessPoolExecutor(1)
futures = [executor.submit(download_apk, sha_256) for sha_256 in array_of_sha256]
concurrent.futures.wait(futures)


###
# awk -F ',' 'NR>1 && $11 ~ /google/ {print $1, $6, $9}' latest.csv | awk -F ' ' '{print $1, ",", $2, ",", $3}' |
# awk -F '[,/]' '$5>=18 {print $1, ",", $2}' > filter_data.csv
# cat filter_data_2.csv | wc -l
### 661683

# someString = 'curl -O --remote-header-name -G -d
# apikey=0bfb176ee4d69e6ff4d845e1f4e2c007806642c207cf642d64b2c226da0f0256 -d
# sha256=000575C5DCBD0372E99DEA0EC8098CA953DC43EE97DD7C46362A4E74A658D1CD \https://androzoo.uni.lu/api/download'

# awk 'NR>1{a[$2]++} END{for(b in a) print b}' unique.csv
# cut -d , -f2 unique.csv | sort | uniq
# awk -F ',' '{print $1, ",", $2}' Book5.csv | sort -u -t',' -k2,2
# sort -u -t',' -k2,2
# awk -F ',' '{print $1, ",", $2}' filter_data.csv | sort -u -t',' -k2,2 > filter_data_2.csv
# 522967

# 
# cat gplay_package_name_install.csv |  awk -F ' ' '$2>10000 {print $1}' | wc -l  7990


# cat gplay_package_name_*.csv > merged.csv
# awk -F ' ' '!seen[$1]++' merged.csv | wc -l  > get unique rows 19450
# cat unique_merged.csv |  awk -F ' ' '$2>50000 {print $1}' | wc -l  [12745] 7488 match
# cat unique_merged.csv |  awk -F ' ' '$2>100000 {print $1}' | wc -l  [9136] 6067 match
# cat unique_merged.csv |  awk -F ' ' '$2>1000000 {print $1}' | wc -l  [4335] 3314 match
# cat unique_merged.csv |  awk -F ' ' '$2>100000 {print $1}' > gplay_package_name.csv

#  cat test_sort.csv | awk -F ' ' '{print $1, $2}' | sort -k2 -n
# cat unique_merged.csv | awk -F ' ' '{print $1, $2}' | sort -k2 -nr | awk -F ' ' '$2>50000 {print $1}'  > gplay_package_name.csv