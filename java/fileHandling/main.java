import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class main {
    public static void main(String[] args) {
        try {
            // Creating a File
            File file = new File("example.txt"); //will be created in working dir
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Creating a Directory
            File directory = new File("exampleDir"); //will be created in working dir
            if (directory.mkdir()) {
                System.out.println("Directory created: " + directory.getName());
            } else {
                System.out.println("Directory already exists.");
            }

            // Creating a Symbolic Link
            Path targetFile = Paths.get("example.txt");
            Path symLink = Paths.get("symlink_example.txt");
            try {
                Files.createSymbolicLink(symLink, targetFile);
                System.out.println("Symbolic link created.");
            } catch (FileAlreadyExistsException e) {
                System.out.println("Symbolic link already exists.");
            }

            // Creating a Hard Link
            Path hardLink = Paths.get("hardlink_example.txt");
            try {
                Files.createLink(hardLink, targetFile);
                System.out.println("Hard link created.");
            } catch (FileAlreadyExistsException e) {
                System.out.println("Hard link already exists.");
            }

            // Path Interface Methods
            Path filePath = Paths.get("example.txt");
            System.out.println("File Name: " + filePath.getFileName());
            System.out.println("Absolute Path: " + filePath.toAbsolutePath());
            System.out.println("Parent Directory: " + filePath.getParent());

        } catch (IOException | UnsupportedOperationException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
