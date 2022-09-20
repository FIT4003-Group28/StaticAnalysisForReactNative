import argparse
from os import chdir, getcwd, mkdir, path
from shutil import rmtree
from hbcgen import determine_entry_point, execute_command, find_installed_hermes

TEMP_DIR_NAME = "hermes_tmp"


# -------------------------------------------------------------
def process_input_args() -> argparse.Namespace:
    """
    Processes input arguments from the command line

    :return: an object containing input arguments
    """
    parser = argparse.ArgumentParser()

    # Required input of the NodeJS project directory
    parser.add_argument("npm_package", action="store", 
        help="An NPM package to convert into Hermes Bytecode")

    # Optional input for the entry file name, otherwise will try to determine
    parser.add_argument("--entry-file", "-e", action="store", default=None, 
        help="Allows for a custom entry point to be used, relative to the npm package directory")

    # Allow an option to keep the temp dir after script finishes
    parser.add_argument("--keep-tmp", "-k", action="store_true", default=False, 
        help="Keep the created temp directory when script exits.")

    return parser.parse_args()


# -------------------------------------------------------------
def main() -> int:
    """Does the work"""
    # Process input arguments
    args = process_input_args()
    pkg_name = args.npm_package
    original_dir = getcwd()

    # Determine if NPM package exists
    execute_command(
        msg=f"Checking that NPM package '{pkg_name}' exists...",
        cmd=f"npm view {pkg_name}"
    )

    # Check if temp dir exists, delete it
    if path.isdir(TEMP_DIR_NAME):
        rmtree(TEMP_DIR_NAME)

    # Enter a new Hermes temp directory
    mkdir(TEMP_DIR_NAME)
    chdir(TEMP_DIR_NAME)

    try:
        # Install hermes into temp directory
        execute_command(
            msg=f"Installing '{pkg_name}' into temp directory...",
            cmd=f"npm init -y && npm install rollup hermes-engine {pkg_name}"
        )

        # Determine entry point
        pkg_path = path.join(getcwd(), "node_modules", pkg_name)
        entry_file = args.entry_file or determine_entry_point(pkg_path)
        entry_path = path.join(pkg_path, entry_file)

        rollup_exe = path.join(".", "node_modules", "rollup", "dist", "bin", "rollup")

        # Building JavaScript bundle from package
        execute_command(
            msg=f"Building code bundle from '{entry_file}' to '{pkg_name}.bundle'...",
            cmd=f"{rollup_exe} {entry_path} --file {pkg_name}.bundle --format cjs"
        )

        # Find Hermes installed version in project
        hermes_file = find_installed_hermes(allow_in_rn=False)

        # Compile JS bundle into Hermes binary
        execute_command(
            msg=f"Assembling bundle into Hermes binary to '{pkg_name}_bin.hbc'...",
            cmd=f"{hermes_file} -O -emit-binary -out={pkg_name}_bin.hbc {pkg_name}.bundle"
        )

        outfile_path = path.join(original_dir, f"{pkg_name}.hbc")

        # Disassemble Hermes binary in readable Hermes bytecode
        execute_command(
            msg=f"Disassembling Hermes binary into Hermes bytecode to '{pkg_name}.hbc'...",
            cmd=f"{hermes_file} -dump-bytecode {pkg_name}_bin.hbc -out {outfile_path}"
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
