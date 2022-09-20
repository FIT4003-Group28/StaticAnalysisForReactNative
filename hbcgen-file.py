import argparse
import subprocess
from os import chdir, getcwd, mkdir, path
from shutil import rmtree
from hbcgen import execute_command, find_local_hermes

TEMP_DIR_NAME = "hermes_tmp"


# -------------------------------------------------------------
def process_input_args() -> argparse.Namespace:
    """
    Processes input arguments from the command line

    :return: an object containing input arguments
    """
    parser = argparse.ArgumentParser()

    # Required input of the NodeJS project directory
    parser.add_argument("js_file", action="store", 
        help="A JavaScript file to convert into Hermes Bytecode")

    # Allow an option to keep the temp dir after script finishes
    parser.add_argument("--keep-tmp", "-k", action="store_true", default=False, 
        help="Keep the created temp directory when script exits.")

    return parser.parse_args()


# -------------------------------------------------------------
def main() -> int:
    """Does the work"""
    # Process input arguments
    args = process_input_args()

    # Variables used in the script
    original_dir = getcwd()
    script_dir = path.dirname(path.abspath(__file__))

    # Check if file exists
    if not path.isfile(args.js_file):
        raise ValueError("ERROR: JS file specified does not exist")

    filename = path.basename(args.js_file).split(".")[0]
    file_path = path.join(original_dir, args.js_file)

    # Check if temp dir exists, delete it
    if path.isdir(TEMP_DIR_NAME):
        rmtree(TEMP_DIR_NAME)

    # Enter a new Hermes temp directory
    mkdir(TEMP_DIR_NAME)
    chdir(TEMP_DIR_NAME)

    try:
        # Detect Hermes installed version in project
        hermes_file = find_local_hermes(script_dir)
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

        # Compile JS bundle into Hermes binary
        execute_command(
            msg=f"Assembling JS file into Hermes binary to '{filename}_bin.hbc'...",
            cmd=f"{hermes_file} -O -emit-binary -out={filename}_bin.hbc {file_path}"
        )

        outfile_path = path.join(original_dir, f"{filename}.txt")

        # Disassemble Hermes binary in readable Hermes bytecode
        execute_command(
            msg=f"Disassembling Hermes binary into Hermes bytecode to '{filename}.hbc'...",
            cmd=f"{hermes_file} -dump-bytecode {filename}_bin.hbc -out {outfile_path}"
        )

        print(f"\nHBC Generation successful! File can be found in: '{outfile_path}'")

    finally:
        chdir(original_dir)
        if not args.keep_tmp:
            rmtree(TEMP_DIR_NAME)


# -------------------------------------------------------------
if __name__ == "__main__":
    # main()  # Uncomment for debugging
    try:
        exit(main())
    except InterruptedError:
        print("Keyboard Interupt")
        exit(1)
    except Exception as e:
        print(e)
        exit(1)
