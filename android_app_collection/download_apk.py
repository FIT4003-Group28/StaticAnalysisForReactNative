import os
import subprocess
from subprocess import run
import pandas as pd
import csv


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


popular_package_name = get_popular_android_app_pkg_name('gplay_package_name.csv')


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


array_of_sha256 = get_sha256_from_pkg_name(popular_package_name, "filter_unique_latest.csv")

apiKeyString = 'enter api key'

i = 0

for sha_256 in array_of_sha256:
    inputString = 'curl -O --remote-header-name -G -d apikey=' + apiKeyString + ' -d sha256=' + sha_256 + ' \https://androzoo.uni.lu/api/download'

    run(inputString, shell=True)

