public class FourWords {

	private String word1 = "";
	private String word2 = "";
	private String word3 = "";
	private String word4 = "";
	private int count = 0;

	public void add(String word) {
		if (count == 0) {
			word1 = word;
		} else if (count == 1) {
			word2 = word;
		} else if (count == 2) {
			word3 = word;
		} else if (count == 3) {
			word4 = word;
		} else {
			System.out.printf("Can\'t add a new word %s!\n", word);
		}
		if (count < 4) {
			count++;
		}
	}

	public String getMin() {
		if (count == 0) {
			return null;
		}
		if (count == 1) {
			return word1;
		}
		if (count == 2) {
			if (word1.compareTo(word2) < 0) {
				return word1;
			} else {
				return word2;
			}
		}
		if (count == 3) {
			if (word1.compareTo(word2) < 0 && word1.compareTo(word3) < 0) {
				return word1;
			}
			if (word2.compareTo(word3) < 0) {
				return word2;
			} else {
				return word3;
			}
		}
		if (count == 4) {
			if (word1.compareTo(word2) < 0 && word1.compareTo(word3) < 0 && word1.compareTo(word4) < 0) {
				return word1;
			} else if (word2.compareTo(word3) < 0 && word2.compareTo(word4) < 0) {
				return word2;
			} else if (word3.compareTo(word4) < 0) {
				return word3;
			} else {
				return word4;
			}
		}
		return word4;
	}

	public String getMax() {
		if (count == 0) {
			return null;
		}
		if (word1.compareTo(word2) > 0 && word1.compareTo(word3) > 0 && word1.compareTo(word4) > 0) {
			return word1;
		} else if (word2.compareTo(word3) > 0 && word2.compareTo(word4) > 0) {
			return word2;
		} else if (word3.compareTo(word4) > 0) {
			return word3;
		} else {
			return word4;
		}
	}

	public void printWords() {
		double AllWords = count;
		int AllLength = 0;

		if (count == 0) {
			System.out.printf("No words set up yet! \n");
			AllWords = 1;
		}
		System.out.printf("List of words: \n");
		if (!word1.isEmpty()) {
			System.out.printf("%s\n", word1);
		}
		if (!word2.isEmpty()) {
			System.out.printf("%s\n", word2);
		}
		if (!word3.isEmpty()) {
			System.out.printf("%s\n", word3);
		}
		if (!word4.isEmpty()) {
			System.out.printf("%s\n", word4);
		} else {
			System.out.printf("\n");
		}

		System.out.printf("The lexicographic minimum is %s \n", getMin());
		System.out.printf("The lexicographic maximum is %s \n", getMax());

		AllLength = word1.length() + word2.length() + word3.length() + word4.length();
		System.out.printf("Total length %d \n", AllLength);
		System.out.printf("Average length %f \n\n", AllLength / AllWords);
	}
}
