package demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnalyserTest {
  @Test
  public void findMostCommonStartInSmallSample() {
    String sample = "a a a b b";
    WordProcessor wordProcessor = new WordProcessor(sample);
    assertEquals('a', wordProcessor.findMostCommonStart());
  }

  @Test
  public void findMostCommonStartInSample() {
    String sample = "T is the most common start letter.";
    WordProcessor wordProcessor = new WordProcessor(sample);
    assertEquals('t', wordProcessor.findMostCommonStart());
  }

  @Test
  public void findMostCommonStartInEmptySample() {
    String sample = "";
    WordProcessor wordProcessor = new WordProcessor(sample);
    assertEquals(' ', wordProcessor.findMostCommonStart());
  }
}
