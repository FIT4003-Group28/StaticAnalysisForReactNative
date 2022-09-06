import argparse
import json
import platform
import subprocess
from os import chdir, getcwd, listdir, path, remove
import sys

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
             "files after the script completes")

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
def determine_subprocess_result(process: subprocess.Popen, mute=False) -> None:
    """
    Checks the result from the subprocess and prints out any errors

    :param process: the subprocess to analyse
    :param mute: optional mute the 'DONE' output
    """
    if process.returncode != 0:
        print("FAILED")
        output, err_output = process.communicate()
        print("STDOUT DUMP ----------------------------------------------")
        print(output.decode(), end="")
        print("STDERR DUMP ----------------------------------------------")
        print(err_output.decode(), end="")
        print("----------------------------------------------------------")
        raise OSError(f"ERROR: Failed to execute command '{process.args}' (Failed with exit code {process.returncode})")
    else:
        if not mute:
            print("DONE")


# -------------------------------------------------------------
def find_installed_hermes() -> str:
    """
    Finds the installed version of Hermes within a NodeJS directory

    :return: a path to the Hermes executable file
    """
    # Determine user's OS
    os_platform = platform.system()
    os_folder = None
    if os_platform == "Windows":
        os_folder = "win64-bin"
    elif os_platform == "Linux":
        os_folder = "linux64-bin"
    elif os_platform == "Darwin":
        os_folder = "osx-bin"
    else:
        raise OSError(f"ERROR: Unsupported OS version. Got '{os_platform}' but expected 'Windows', 'Linux' or 'Darwin' (MacOS)")

    # Locate directory of Hermes binary file
    hermes_paths = [
        path.join(getcwd(), "node_modules", "hermes-engine", os_folder),
        path.join(getcwd(), "node_modules", "react-native", "sdks", "hermesc", os_folder)
    ]
    found_path = next(filter(lambda p: path.isdir(p), hermes_paths), None)

    if found_path is None:
        raise FileNotFoundError("ERROR: Could not find hermes executable in project")

    # Return path to executable
    for file in listdir(found_path):
        if file.startswith("hermesc"):
            return path.join(found_path, file)
        elif file.startswith("hermes"):
            return path.join(found_path, file)


# -------------------------------------------------------------
def execute_command(msg: str, cmd: str) -> None:
    """
    Spawns a subprocess to execute and OS command and check the result

    :param msg: a message to print out before the process runs
    :param cmd: the command to execute in the OS
    """
    sys.stdout.write(msg + " ")
    sys.stdout.flush()
    p = subprocess.Popen(cmd, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    p.wait()
    determine_subprocess_result(p)


# -------------------------------------------------------------
def main() -> int:
    """Does the work"""
    # Process input arguments
    original_dir = getcwd()
    args = process_input_args()

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

        # Building JavaScript bundle from project
        execute_command(
            msg=f"Building code bundle from '{entry_file}' to 'index.android.bundle'...",
            cmd=f"npx react-native bundle --dev false --platform android --entry-file {entry_file} --bundle-output index.android.bundle --minify false"
        )

        # Detect Hermes installed version in project
        hermes_file = find_installed_hermes()
        p_hrms = subprocess.Popen(f"{hermes_file} -version", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        p_hrms.wait()
        determine_subprocess_result(p_hrms, mute=True)

        hbc_version = None
        for line in p_hrms.stdout:
            if "HBC bytecode version: " in line.decode():
                hbc_version = line.decode().split(" ")[-1].rstrip("\n")
                print("Detected installed Hermes version " + hbc_version)
                break
        
        if hbc_version is None:
            raise ValueError("ERROR: Could not determine the installed Hermes version in project")

        # Compile JS bundle into Hermes binary
        execute_command(
            msg="Assembling bundle into hermes binary to 'index.android.bundle.hbc'...",
            cmd=f"{hermes_file} -O -emit-binary -out=index.android.bundle.hbc index.android.bundle"
        )
        if not args.keep_files:
            remove("index.android.bundle")

        # Determine output filename
        outfile_name = args.output or entry_file.split(".")[0] + ".hbc"

        # Disassemble Hermes binary in readable Hermes bytecode
        execute_command(
            msg=f"Disassembling hermes binary into hermes readable bytecode to '{outfile_name}'...",
            cmd=f"{hermes_file} -dump-bytecode index.android.bundle.hbc -out {outfile_name}"
        )
        if not args.keep_files:
            remove("index.android.bundle.hbc")

        print(f"\nHBC Generation successful. File can be found in: '{path.join(args.proj_dir, outfile_name)}'")

    finally:
        chdir(original_dir)


# -------------------------------------------------------------
if __name__ == "__main__":
    main()  # Uncomment for debugging
    # try:
    #     exit(main())
    # except InterruptedError:
    #     print("Keyboard Interupt")
    #     exit(1)
    # except Exception as e:
    #     print(e)
    #     exit(1)

