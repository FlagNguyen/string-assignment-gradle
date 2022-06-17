package file.impl

import constant.Constant
import file.FileHandle
import org.apache.commons.io.FileUtils

import java.util.logging.Logger

class FileHandleImpl implements FileHandle {

    private final Logger logger = Logger.getLogger(FileHandleImpl.class.getName())

    @Override
    List<String> readFile(String inputFilePath) {
        return Optional.of(FileUtils.readLines(new File(inputFilePath), "UTF-8"))
    }

    @Override
    void saveIntoFile(List<String> processedLines) {
        FileUtils.writeLines(new File(Constant.OUTPUT_FILE_PATH), processedLines, false)
        println("Save Successfully")
    }
}
