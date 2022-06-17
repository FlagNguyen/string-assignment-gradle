import file.FileHandle
import file.impl.FileHandleImpl
import service.StringService
import service.impl.StringServiceImpl

    static void main(String[] args) throws IOException {
        final FileHandle fileHandle = new FileHandleImpl()
        final StringService stringService = new StringServiceImpl()

        List<String> inputLines = fileHandle.readFile("/home/flag_nguyen/Documents/Eway_Training/string-assignment-gradle/src/main/groovy/inPut1.txt").get()
        inputLines = stringService.cleanStringAndSave(inputLines)
        for (String line : inputLines) {
            println("$line")
        }

        println("Ex1: ")
        stringService.printUppercaseChar(inputLines)

        println("\nEx2: ")
        stringService.printTotalChar(inputLines)

        println("\nEx3")
        inputLines = stringService.changeCharSequenceAndSave(inputLines, "Toi yeu ha noi pho")
        println "$inputLines"
        fileHandle.saveIntoFile(inputLines)

        println("\nEx4")
        fileHandle.saveIntoFile(stringService.cleanStringAndSave(inputLines))

        println("\nEx5")
        inputLines = stringService.appendNewStringAndSave(inputLines,"o con ga cua toi")
        fileHandle.saveIntoFile(inputLines)
        println "$inputLines"
    
}
