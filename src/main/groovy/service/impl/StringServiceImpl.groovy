package service.impl


import service.StringService

class StringServiceImpl implements StringService {

    /**
     * @param inputLines
     * print all upper case character in input lines
     */
    @Override
    void printUppercaseChar(List<String> inputLines) {
        for (String line : inputLines) {
            String trimedLine = line.trim()
            char[] charsOfLine = trimedLine.toCharArray()
            for (char character : charsOfLine) {
                if (Character.isUpperCase(character)) {
                    print("$character ")
                }
            }
        }
        println()
    }

    /**
     *
     * @param inputLines
     * print total character and total lower character of input lines
     */
    @Override
    void printTotalChar(List<String> inputLines) {
        int lowerCharacterNumber = 0
        int characterNumber = 0
        for (String line : inputLines) {
            char[] chars = line.toCharArray()
            characterNumber += chars.length
            for (char character : chars) {
                if (Character.isLowerCase(character)) {
                    lowerCharacterNumber++
                }
            }
        }
        println("Total character $characterNumber")
        println "Total lower character: $lowerCharacterNumber"
    }

    /**
     *
     * @param inputLines
     * @param changeString - string which will be found in input lines and replace by new string
     */
    @Override
    List<String> changeCharSequenceAndSave(List<String> inputLines, String changeString) {
        for (int index = 0; index < inputLines.size(); index++) {
            if (inputLines.get(index).equals(changeString)) {
                inputLines.set(index, changeString.toUpperCase())
            }
        }
        return inputLines
    }

    /**
     *
     * @param inputLines
     * @return lines list which cleaned (deleted all plenty space)
     */
    @Override
    List<String> cleanStringAndSave(List<String> inputLines) {
        List<String> output = new ArrayList<>()
        for (String line : inputLines) {
            output.add(line.trim().replaceAll("\\s+", " ")) //Delete all plenty space
        }
        return output
    }

    /**
     *
     * @param inputLines
     * @param appendString - string which be append in specify position
     */
    @Override
    List<String> appendNewStringAndSave(List<String> inputLines, String appendString) {
        for (int index = 0; index < inputLines.size(); index++) {
            if (inputLines.get(index).contains("\$")) {
                int positionSpecifyChar = inputLines.get(index).indexOf("\$")
                String newString = inputLines.get(index).substring(0, positionSpecifyChar) + appendString +
                        inputLines.get(index).substring(positionSpecifyChar + 1)
                inputLines.set(index, newString)
            }
        }
        return inputLines
    }

}
