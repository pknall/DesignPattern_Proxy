public class Application {

    public static void main(String[] args){
        String book = "This is a book";

        LazyBookParserProxy bpp = new LazyBookParserProxy(book);
        bpp.numberOfPages();
    }
}
