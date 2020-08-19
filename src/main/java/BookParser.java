public class BookParser implements BookParserInterface {

    public BookParser(String book) {
        // This is an expensive constructor
        System.out.println("Constructing BookParser.");
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException ex) {

        }
    }

    public Integer numberOfPages() {
        System.out.println("Entering BookParser.numberOfPages()");
        return 0;
    }

    public Integer numberOfChapters() {
        return 0;
    }

    public Integer numberOfAdverbs() {
        return 0;
    }
}
