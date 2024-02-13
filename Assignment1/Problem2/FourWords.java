// Author: Krittamet Damthongkam (กฤตเมธ ดำทองคำ)
// Student ID: 6609490062

package Problem2;

public class FourWords {
  private String word1;
  private String word2;
  private String word3;
  private String word4;

  private int count;

  public void add(String word) {
    if (count >= 4)
      System.out.println("Can't add a new word " + word + "!");

    if (word1 == null) {
      word1 = word;
    } else if (word2 == null) {
      word2 = word;
    } else if (word3 == null) {
      word3 = word;
    } else if (word4 == null) {
      word4 = word;
    }
    count++;
  }

  public void printWords() {
    if (count == 0) System.out.println("No words set up yet!");

    System.out.println("List of words:");
    if (word1 != null) System.out.printf("\t%s%n", word1);
    if (word2 != null) System.out.printf("\t%s%n", word2);
    if (word3 != null) System.out.printf("\t%s%n", word3);
    if (word4 != null) System.out.printf("\t%s%n", word4);
    System.out.println();

    String lexicographicFormat = "The lexicographic %s is %s\n";
    String totalLengthFormat = "Total length %d%n";
    String averageFormat = "Average length %.6f%n%n";

    int totalLength = (word1 != null ? word1.length() : 0) +
                      (word2 != null ? word2.length() : 0) +
                      (word3 != null ? word3.length() : 0) +
                      (word4 != null ? word4.length() : 0);

    double averageLength =  (count >= 1) ?
                            (double) totalLength / count :
                            0.0;

    System.out.printf(lexicographicFormat, "minimum", getMin());
    System.out.printf(lexicographicFormat, "maximum", getMax());
    System.out.printf(totalLengthFormat, totalLength);
    System.out.printf(averageFormat, averageLength);
  }

  public String getMin() {
    if (count == 0) return null;

    String minWord = word1;
    if (word2 != null && word2.compareTo(minWord) < 0) minWord = word2;
    if (word3 != null && word3.compareTo(minWord) < 0) minWord = word3;
    if (word4 != null && word4.compareTo(minWord) < 0) minWord = word4;
    return minWord;
  }

  public String getMax() {
    if (count == 0) return null;

    String maxWord = word1;
    if (word2 != null && word2.compareTo(maxWord) > 0) maxWord = word2;
    if (word3 != null && word3.compareTo(maxWord) > 0) maxWord = word3;
    if (word4 != null && word4.compareTo(maxWord) > 0) maxWord = word4;
    return maxWord;
  }
}