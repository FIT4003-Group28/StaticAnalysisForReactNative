import argparse
import json
import platform
import subprocess
import sys
from os import chdir, getcwd, listdir, path, remove
from xml.dom import NotFoundErr

# -------------------------------------------------------------
def process_input_args() -> argparse.Namespace:
    """
    Processes input arguments from the command line

    :return: an object containing input arguments
    """
    parser = argparse.ArgumentParser()

    # Required input of the NodeJS project directory
    parser.add_argument("proj_dir", action="store", 
        help="A directory containing a NodeJS project")

    # Optional input for the entry file name, otherwise will try to determine
    parser.add_argument("--entry-file", "-e", action="store", default=None, 
        help="The name of the entry file relative to project dir")

    # Optional input for the output filename, defaults to entry filename with .hbc suffix
    parser.add_argument("--output", "-o", action="store", default=None, 
        help="The name of the final output file "
             "(defaults to name of entry file with .hbc suffix")

    # Allow an option to keep the generated files in intermediate steps
    parser.add_argument("--keep-files", "-k", action="store_true", default=False, 
        help="Keep the generated 'index.android.bundle' and 'index.android.bundle.hbc' "
             "files after the script completes. By default it does not")

    return parser.parse_args()


# -------------------------------------------------------------
def determine_entry_point(proj_dir: str) -> str:
    """
    Determines the entry point of a NodeJS project directory

    :param proj_dir: a path of a NodeJS directory
    :return: the filename of the entry point inside the project directory
    """
    pkg_json_path = path.join(proj_dir, "package.json")

    # Find the entry point of the NodeJS project
    with open(pkg_json_path, "r") as pkg_json_f:
        pkg_json = json.load(pkg_json_f)

        if "main" in pkg_json:
            # If entry point specified, use that
            return pkg_json["main"]
        else:
            # Otherwise check if other default entry points exist
            alt_entry_points = ["index.js", "index.json", "index.node"]
            for f in alt_entry_points:
                if path.isfile(path.join(proj_dir, f)):
                    return f
        
    raise FileNotFoundError(
        "ERROR: Could not determine entry point of file. If you believe this is a mistake, "
        "specify the entry point using '-e' argument with the entry point name (e.g. index.js)"
    )


# -------------------------------------------------------------
def check_react_native_version() -> None:
    """
    Checks the React Native version of a NodeJS project directory an alert if too old

    :param proj_dir: a path of a NodeJS directory
    """
    # Find the react-native version in the NodeJS project
    with open("package.json", "r") as pkg_json_f:
        pkg_json = json.load(pkg_json_f)

        # Get react-native version from pakage.json
        rn_version = pkg_json.get("dependencies", {}).get("react-native", None)
        if rn_version is None:
            raise NotFoundErr(
                "WARNING: NPM package 'react-native' is not installed in this project "
                "and Hermes likely will not be installed"
            )

        # Check the version is atleast 0.60.4
        print("Current react-native version " + rn_version.lstrip("^~"))
        rn_v_split = rn_version.lstrip("^~").split(".")
        if (int(rn_v_split[0]) == 0 and int(rn_v_split[1]) < 61
            and ".".join(rn_v_split) not in ("0.60.4", "0.60.5", "0.60.6")):
            raise ValueError(
                "WARNING: Hermes engine is only supported by React Native versions 0.60.4 and up\n"
                "Please upgrade version of 'react-native' for this tool to work properly, will "
                "use the highest version of Hermes sourced locally but it may cause issues"
            )


# -------------------------------------------------------------
def determine_subprocess_result(process: subprocess.Popen, raise_errors=False, mute=False) -> None:
    """
    Checks the result from the subprocess and prints out any errors

    :param process: the subprocess to analyse
    :param raise_errors: whether to print or raise errors
    :param mute: optional mute the 'DONE' output
    """
    output, err_output = process.communicate()
    if process.returncode != 0:
        print("FAILED")
        if raise_errors:
            raise RuntimeError("Command failed to run")

        print("STDOUT DUMP ----------------------------------------------")
        print(output.decode(), end="")
        print("STDERR DUMP ----------------------------------------------")
        print(err_output.decode(), end="")
        print("----------------------------------------------------------")
        raise OSError(
            f"ERROR: Failed to execute command '{process.args}' "
            f"(Failed with exit code {process.returncode})"
        )
    else:
        if not mute:
            print("DONE")


# -------------------------------------------------------------
def get_os_folder() -> str:
    """
    Gets the folder name specific to the current platform

    :return: a folder name specific to OS platform
    """
    os_platform = platform.system()
    if os_platform == "Windows":
        return "win64-bin"
    elif os_platform == "Linux":
        return "linux64-bin"
    elif os_platform == "Darwin":
        return "osx-bin"
    
    # If no OS's match error
    raise OSError(
            f"ERROR: Unsupported OS. Got '{os_platform}' but expected "
            "'Windows', 'Linux' or 'Darwin' (MacOS)"
        )


# -------------------------------------------------------------
def find_local_hermes(script_path: str, version: str = None) -> str:
    """
    Finds the local version of Hermes within this scripts directory

    :param script_path: an absolute path to the location this script runs
    :param version: a Hermes bytecode version to search by, by default will get highest version
    :return: a path to the Hermes executable file
    """
    # Determine user's OS
    os_folder = get_os_folder()

    # Locate directory of Hermes executable
    hermes_dir = path.join(script_path, "hermes", os_folder)

    if not path.isdir(hermes_dir):
        raise NotFoundErr(f"ERROR: Could not find the local built Hermes directory ({hermes_dir})")

    # If version not specified, find the highest local Hermes build version
    if not version:
        cur_file = None
        for file in listdir(hermes_dir):
            if not file.startswith("hermesc") and not file.startswith("hermes"):
                continue

            if not cur_file or file > cur_file:
                cur_file = file

        if not cur_file:
            raise FileNotFoundError(f"ERROR: No Hermes executables found in {hermes_dir}")

        return path.join(hermes_dir, cur_file)

    # Return path to executable with matching version
    for file in listdir(hermes_dir):
        if file.startswith("hermesc" + version):
            return path.join(hermes_dir, file)
        elif file.startswith("hermes" + version):
            return path.join(hermes_dir, file)

    raise FileNotFoundError(
        f"ERROR: No Hermes executables found in Hermes build directory ({hermes_dir}) with "
        f"matching version '{version}'. If the right version does not exist in the Hermes build "
        "directory then try building the correct version yourself from "
        "https://github.com/facebook/hermes and add to the Hermes build directory with the "
        "filename format 'hermescXX' or 'hermescXX.exe' where XX is the version number"
    )


# -------------------------------------------------------------
def find_installed_hermes(allow_in_rn: bool = True) -> str:
    """
    Finds the installed version of Hermes within a NodeJS directory

    :param allow_in_rn: allows for searching in react-native package for Hermes executable
    :return: a path to the Hermes executable file
    """
    # Determine user's OS
    os_folder = get_os_folder()

    # Locate directory of Hermes binary file
    hermes_paths = []
    hermes_paths.append(path.join(getcwd(), "node_modules", "hermes-engine", os_folder))
    if allow_in_rn:
        hermes_paths.append(
            path.join(getcwd(), "node_modules", "react-native", "sdks", "hermesc", os_folder))
    found_path = next(filter(lambda p: path.isdir(p), hermes_paths), None)

    if not found_path:
        print(
            "WARNING: Could not find an installed version of Hermes in the project, "
            "will use highest local version of Hermes"
        )
        return None

    # Return path to executable
    for file in listdir(found_path):
        if file.startswith("hermesc"):
            return path.join(found_path, file)
        elif file.startswith("hermes"):
            return path.join(found_path, file)


# -------------------------------------------------------------
def execute_command(msg: str, cmd: str, raise_errors=False) -> None:
    """
    Spawns a subprocess to execute and OS command and check the result

    :param msg: a message to print out before the process runs
    :param cmd: the command to execute in the OS
    :param raise_errors: raise errors instead of printing them
    """
    sys.stdout.write(msg + " ")
    sys.stdout.flush()
    p = subprocess.Popen(cmd, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    determine_subprocess_result(p, raise_errors)


# -------------------------------------------------------------
def main() -> int:
    """Does the work"""
    # Process input arguments
    args = process_input_args()

    # Variables used in the script
    original_dir = getcwd()
    script_dir = path.dirname(path.abspath(__file__))

    # Check if path given was a real directory
    if not path.isdir(args.proj_dir):
        raise ValueError("ERROR: Project directory given does not exist")

    folder_name = args.proj_dir.rstrip("/").split("/")[-1]
    print(f"Converting project '{folder_name}' into readable Hermes bytecode")

    # Check if a package.json exists in project directory
    if not path.isfile(path.join(args.proj_dir, "package.json")):
        raise ValueError("ERROR: Project directory provided is not a NodeJS directory")

    # Determine entry point
    entry_file = args.entry_file or determine_entry_point(args.proj_dir)

    try:
        chdir(args.proj_dir)

        # Install NPM packages
        execute_command(
            msg="Downloading project NPM packages...",
            cmd="npm install --force"
        )

        check_react_native_version()

        # Detect Hermes installed version in project
        hermes_file = find_installed_hermes() or find_local_hermes(script_dir)
        p_hrms = subprocess.Popen(
            f"{hermes_file} -version",
            shell=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE
        )
        p_hrms.wait()

        hbc_version = None
        for line in p_hrms.stdout:
            if "HBC bytecode version: " in line.decode():
                hbc_version = line.decode().split(" ")[-1].rstrip("\n")
                print("Using Hermes bytecode version " + hbc_version)
                break

        if hbc_version is None:
            raise ValueError("ERROR: Could not determine the installed Hermes version in project")

        # Find local modified version of hermes for disassembling Hermes
        modified_hermes_file = find_local_hermes(script_dir, hbc_version)

        # Building JavaScript bundle from project
        execute_command(
            msg=f"Building code bundle from '{entry_file}' to 'index.bundle'...",
            cmd=f"npx react-native bundle --dev false --platform android --entry-file "
                f"{entry_file} --bundle-output index.bundle.js --minify false"
        )

        try:
            # Compile JS bundle into Hermes binary
            execute_command(
                msg=f"Assembling bundle into Hermes binary to 'index.bundle.hbc'...",
                cmd=f"{hermes_file} -O -emit-binary -out=index.bundle.hbc index.bundle.js",
                raise_errors=True
            )
        except RuntimeError:
            print("Trying to assemble bundle in compatibility mode")

            # Installing babel
            execute_command(
                msg=f"Installing 'babel'...",
                cmd=f"npm install --save-dev @babel/cli @babel/core @babel/preset-env"
            )

            babel_exe = path.join(".", "node_modules", "@babel", "cli", "bin", "babel.js")

            # Converting ES6 Javascript into ES5
            execute_command(
                msg=f"Converting 'index.bundle.js' to ES5 into 'index.babel.bundle.js'...",
                cmd=f"{babel_exe} --presets @babel/env --no-babelrc index.bundle.js -o index.babel.bundle.js"
            )

            # Compile JS bundle into Hermes binary
            execute_command(
                msg=f"Assembling bundle into Hermes binary to 'index.bundle.hbc'...",
                cmd=f"{hermes_file} -O -emit-binary -out=index.bundle.hbc index.babel.bundle.js",
            )
            if not args.keep_files:
                remove("index.babel.bundle.js")

        # Determine output filename
        outfile_name = args.output or entry_file.split(".")[0] + ".txt"

        # Disassemble Hermes binary in readable Hermes bytecode
        execute_command(
            msg=f"Disassembling Hermes binary into Hermes bytecode to '{outfile_name}'...",
            cmd=f"{modified_hermes_file} -dump-bytecode index.bundle.hbc -out {outfile_name}"
        )
        if not args.keep_files:
            remove("index.bundle.js")
            remove("index.bundle.hbc")

        print(
            f"\nHBC Generation successful! File can be found in: '"
            f"{path.join(args.proj_dir, outfile_name)}'"
        )

    finally:
        chdir(original_dir)


# -------------------------------------------------------------
if __name__ == "__main__":
    # main()  # Uncomment for debugging
    try:
        exit(main())
    except KeyboardInterrupt:
        print("KeyboardInterupt")
        exit(1)
    except Exception as e:
        print(e)
        exit(1)
