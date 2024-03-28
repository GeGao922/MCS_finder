package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* this downloader class will try to download from the given url */
public class Downloader {
  private static URL url;

  public Downloader(String url) {
    try {
      Downloader.url = new URL(url);
    } catch (MalformedURLException e) {
      System.out.println("please provide an valid url");
      throw new RuntimeException(e);
    }
  }

  /* try to get the content in the input stream, return in a string. */
  private static String getResult(InputStream in) {
    BufferedReader buffer = new BufferedReader(new InputStreamReader(in));
    StringBuilder result = new StringBuilder();
    String line;
    try {
      while ((line = buffer.readLine()) != null) {
        result.append(line);
      }
    } catch (IOException e) {
      System.out.println("error when reading from url");
      throw new RuntimeException(e);
    } finally {
      try {
        in.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    return result.toString();
  }

  /* download from an url, get the download result as input stream. */
  public String downLoad() {
    try {
      URLConnection connection = url.openConnection();
      InputStream in = connection.getInputStream();
      return getResult(in);
    } catch (IOException e) {
      System.out.println("cannot connect to this url");
      throw new RuntimeException(e);
    }
  }
}
