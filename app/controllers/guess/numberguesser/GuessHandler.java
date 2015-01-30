package controllers.guess.numberguesser;

import controllers.antlr4.Parsers;

public class GuessHandler {

	public static GuessResultPair checkAnswer(String answer, int expected) {
		try {
			if (!Parsers.parseNumberAsTree(answer).getText()
					.equalsIgnoreCase(answer))
				return new GuessResultPair(GuessResult.INVALIDNUMBER);
			
			int number = Parsers.parseNumberAsInt(answer.toLowerCase());
			if (number == expected) {
				return new GuessResultPair(GuessResult.CORRECT, number);
			}
			else {
				return new GuessResultPair(GuessResult.FALSENUMBER, number);
			}
				
		} catch (Exception e) {
			return new GuessResultPair(GuessResult.ERROR);
		}
	}

	public static int getNumber() {
		int interval = (int) (Math.random() * 3) + 1;
		if (Math.random() < 0.3)
			interval += 1;
		if (Math.random() < 0.1)
			interval += 2;
		int question = (int) (Math.random() * Math.pow(10, interval));
		return question;
	}
	
	public enum GuessResult {
		CORRECT, FALSENUMBER, INVALIDNUMBER, ERROR
	}
	
	public static class GuessResultPair {
		GuessResult result;
		int value;
		
		public GuessResultPair(GuessResult result) {
			super();
			this.result = result;
		}
		
		public GuessResultPair(GuessResult result, int value) {
			super();
			this.result = result;
			this.value = value;
		}
	}
}
