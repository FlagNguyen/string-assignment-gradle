package file.impl

import file.FileHandle

import java.util.logging.Level
import java.util.logging.Logger
import org.apache.commons.io.*

class FileHandleImpl implements FileHandle {

    private final Logger logger = Logger.getLogger(FileHandleImpl.class.getName())

    @Override
    Optional<List<String>> readFile(String fileUrl) {
        return Optional.of(FileUtils.readLines(new File(fileUrl), "UTF-8"))
    }

    @Override
    void saveIntoFile(List<String> processedLines) {
        FileUtils.writeLines(new File("outPut1.txt"), processedLines)
        println("Save Successfully")
    }
}
