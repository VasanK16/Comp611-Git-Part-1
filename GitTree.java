import java.util.List;

/**
 * Represents a Git tree.
 * @author timothy.kington
 *
 */
public class GitTree extends GitObject {

    /**
     * Adds an entry to the tree.
     * @param filename the filename
     * @param mode the mode
     * @param hash the hash
     */
    public void addFile(String filename, int mode, String hash) {
    }

    /**
     * Returns a list of the GitTreeEntries in this tree.
     * @return the files
     */
    public List<GitTreeEntry> getFiles() {
        return null;
    }

    /**
     * Returns the GitTreeEntry for the given filename.
     * @param filename the filename
     * @return the entry
     */
    public GitTreeEntry getFile(String filename) {
        return null;
    }
}
