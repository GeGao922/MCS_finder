package demo;

import java.util.HashMap;
import java.util.Map;

/* this class will try to process input paragraph. */
public class WordProcessor {
  private static String paragraph;

  public WordProcessor(String para) {
    paragraph = para;
  }

  /* method for finding the most common start letter. */
  public char findMostCommonStart() {
    Map<Character, Integer> count = new HashMap<>();
    // convert all upper case letter to lowercase, split words on space
    String[] words = paragraph.replaceAll("[^a-zA-Z]", "").toLowerCase().split("\\s+");
    // find start letter in each word, update count in map.
    for (String s : words) {
      if (s.isEmpty()) continue;
      char start = s.charAt(0);
      int c = count.getOrDefault(s, -1);
      if (c == -1) {
        count.put(start, 1);
      } else {
        count.replace(start, c + 1);
      }
    }
    // find the most common start letter, return ' ' if input is empty string.
    char result = ' ';
    int maxCount = 0;
    for (char c = 'a'; c <= 'z'; c++) {
      int cnt = count.getOrDefault(c, -1);
      if (cnt > maxCount) {
        result = c;
        maxCount = cnt;
      }
    }
    return result;
  }
}
