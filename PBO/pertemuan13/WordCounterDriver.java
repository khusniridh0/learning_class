public class WordCounterDriver { 
    public static void main (String [] args){
        String book = "https://www.gutenberg.org/cache/epub/71119/pg71119-images.html";

        WordCounter wc = new WordCounter(book);

        System.out.println(wc.getCount("the"));
        System.out.println(wc.getCount("I"));
        System.out.println(wc.getCount("a"));
    }
    
}
