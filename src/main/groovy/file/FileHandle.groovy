package file

interface FileHandle {
    Optional<String> readFile(String fileUrl) throws IOException;
    void saveIntoFile(List<String> processedLines) throws FileNotFoundException;
}
