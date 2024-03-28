package demo;

public class Main {
  public static void main(String[] args) {
    //initialize a file downloader to download file from the given url.
    String url = "https://www.gutenberg.org/cache/epub/29364/pg29364.txt";
    Downloader downloader = new Downloader(url);
    String output = downloader.downLoad();
    // pass the downloaded result to processor to find most common start letter.
    WordProcessor wordProcessor = new WordProcessor(output);
    System.out.println("the most common start letter is: "
            + wordProcessor.findMostCommonStart());
  }
}
