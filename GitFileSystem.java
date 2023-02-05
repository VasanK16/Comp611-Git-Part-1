import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class GitFileSystem {

    private TreeSet<GitFileSystemEntry> fileSystem;
 
     /**
      * Creates an empty file system.
      */
     public GitFileSystem() {
         this.fileSystem = new TreeSet<>();
     }
 
     /**
      * Reads the contents of the file with the given name.
      * @param filename the filename
      * @return the contents of the file, or null if the file isn't present
      */
     public String readFileContents(String filename) {
         GitFileSystemEntry entry = new GitFileSystemEntry(filename, null);
         if (fileSystem.contains(entry)) {
             entry = fileSystem.floor(entry);
             return entry.getContents();
         }
         return null;
     }
 
     /**
      * Writes the given contents to a file.
      * @param filename the filename
      * @param contents the contents
      */
     public void writeFileContents(String filename, String contents) {
         GitFileSystemEntry entry = new GitFileSystemEntry(filename, null);
         if (fileSystem.contains(entry)) {
             entry = fileSystem.floor(entry);
             entry.setContents(contents);
         } else {
             fileSystem.add(new GitFileSystemEntry(filename, contents));
         }
     }
 
     /**
      * Returns the files in the working directory.  That is, all files
      * whose filenames don't start with .git.  The files must be in sorted
      * order by filename.
      * @return the files in the working directory
      */
     public List<GitFileSystemEntry> getWorkingDirFiles() {
         List<GitFileSystemEntry> list = new ArrayList<>();
         for (GitFileSystemEntry entry : fileSystem) {
             if (!entry.getFilename().startsWith(".git/")) {
                 list.add(entry);
             }
         }
         return list;
     }
 
 }