public class FourWords {
  private String word1;
  private String word2;
  private String word3;
  private String word4;

  public void add(String word) {
    if (word4 != null) System.out.println("Can't add a new word " + word + "!");

    if (word1 == null) {
      word1 = word;
    } else if (word2 == null) {
      word2 = word;
    } else if (word3 == null) {
      word3 = word;
    } else if (word4 == null) {
      word4 = word;
    }
  }

  public void printWords() {
    if (word1 == null) System.out.println("No words set up yet!");

    System.out.println("List of words:");
    if (word1 != null) System.out.printf("\t%s\n", word1);
    if (word2 != null) System.out.printf("\t%s\n", word2);
    if (word3 != null) System.out.printf("\t%s\n", word3);
    if (word4 != null) System.out.printf("\t%s\n", word4);
    System.out.println();

    printLexicographicMinMax("The lexicographic %s is %s\n");
    printTotalLength("Total length %d\n");
    printAverageLength("Average length %.6f\n\n");
  }

  public String getMin() {
    if (word1 == null) return null;

    String minWord = word1;
    if (word2 != null && word2.compareTo(minWord) < 0) minWord = word2;
    if (word3 != null && word3.compareTo(minWord) < 0) minWord = word3;
    if (word4 != null && word4.compareTo(minWord) < 0) minWord = word4;
    return minWord;
  }

  public String getMax() {
    if (word1 == null) return null;

    String maxWord = word1;
    if (word2 != null && word2.compareTo(maxWord) > 0) maxWord = word2;
    if (word3 != null && word3.compareTo(maxWord) > 0) maxWord = word3;
    if (word4 != null && word4.compareTo(maxWord) > 0) maxWord = word4;
    return maxWord;
  }

  private void printLexicographicMinMax(String format) {
    System.out.printf(format, "minimum", getMin());
    System.out.printf(format, "maximum", getMax());
  }

  private int getTotalLength() {
    return  (word1 != null ? word1.length() : 0) +
            (word2 != null ? word2.length() : 0) +
            (word3 != null ? word3.length() : 0) +
            (word4 != null ? word4.length() : 0);
  }

  private void printTotalLength(String format) {
    System.out.printf(format, getTotalLength());
  }
  
  private void printAverageLength(String format) {
    int wordCount = (word1 != null ? 1 : 0) +
                    (word2 != null ? 1 : 0) +
                    (word3 != null ? 1 : 0) +
                    (word4 != null ? 1 : 0);
    double averageLength = (wordCount >= 1) ? (double) getTotalLength() / wordCount : 0.0;
    
    System.out.printf(format, averageLength);
  }
}