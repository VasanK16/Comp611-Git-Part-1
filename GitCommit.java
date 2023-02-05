/**
 * Represents a Git commit.
 * @author timothy.kington
 *
 */
public class GitCommit extends GitObject {

    /**
     * Creates a GitCommit.
     * @param treeHash the tree hash
     * @param parentHash the parent hash (may be null)
     * @param author the author
     * @param comment the comment
     */
    public GitCommit(String treeHash, String parentHash, String author, String comment) {
    }

    /**
     * Returns the tree hash.
     * @return the tree hash
     */
    public String getTreeHash() {
        return null;
    }

    /**
     * Returns the parent hash.
     * @return the parent hash
     */
    public String getParentHash() {
        return null;
    }

    /**
     * Returns the author.
     * @return the author
     */
    public String getAuthor() {
        return null;
    }

    /**
     * Returns the comment.
     * @return the comment
     */
    public String getComment() {
        return null;
    }
}
