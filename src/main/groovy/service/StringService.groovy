package service

interface StringService {
    void printUppercaseChar(List<String> inputLines)

    void printTotalChar(List<String> inputLines)

    List<String> changeCharSequenceAndSave(List<String> inputLines, String changeString)

    List<String> cleanStringAndSave(List<String> inputLines)

    List<String> appendNewStringAndSave(List<String> inputLines, String appendString)

}
