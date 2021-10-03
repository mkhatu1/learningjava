public class DigitsOnlyFileReader extends AbstractFileReader {

    public DigitsOnlyFileReader(String filePath) {
        super(filePath);

    }

    @Override
    protected String parseLine(String line) {
        return line.replace("[^0-9]", ""); 
        // replace all non numeric characters into empty strings.
// line.replace(target, replacement)
    }
    
}
