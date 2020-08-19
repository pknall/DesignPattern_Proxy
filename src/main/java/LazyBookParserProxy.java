
public class LazyBookParserProxy implements BookParserInterface {

    BookParser bp;
    String book;

    public LazyBookParserProxy(String book) {
        System.out.println("Creating Book Parser Proxy.");
        this.book = book;
    }

    public Integer numberOfPages() {
        System.out.println("Entering BookParserProxy.numberOfPages()");
        if (bp == null) bp = new BookParser(book);  // Lazy

        System.out.println("Leaving BookParserProxy.numberOfPages()");
        return bp.numberOfPages();
    }

    public Integer numberOfChapters() {
        if (bp == null) bp = new BookParser(book);  // Lazy

        return bp.numberOfChapters();
    }

    public Integer numberOfAdverbs() {
        if (bp == null) bp = new BookParser(book);  // Lazy

        return bp.numberOfAdverbs();
    }
}
