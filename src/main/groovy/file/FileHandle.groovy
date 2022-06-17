package file

interface FileHandle {
    List<String> readFile(String inputFilePath) throws IOException;
    void saveIntoFile(List<String> processedLines) throws FileNotFoundException;
}
