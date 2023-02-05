
public class GitFileSystem {

    /* Supplied code omitted */

    /**
     * Reads the contents of the file with the given name.
     * @param filename the filename
     * @return the contents of the file, or null if the file isn't present
     */
    public String readFileContents(String filename) {
        return null;

    }

    /**
     * Writes the given contents to a file.
     * @param filename the filename
     * @param contents the contents
     */
    public void writeFileContents(String filename, String contents) {
    }

    /**
     * Returns the files in the working directory.  That is, all files
     * whose filenames don't start with .git.  The files must be in sorted
     * order by filename.
     * @return the files in the working directory
     */
    public List<GitFileSystemEntry> getWorkingDirFiles() {
        return null;
    }

}
