package controllers.guess.numberguesser;

import controllers.LanguageController;
import controllers.guess.numberguesser.GuessHandler.GuessResultPair;
import static play.data.Form.*;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Html;
import views.html.numberguess.numberguessview;

public class NumberGuess extends Controller {

	public static Result get() {
		int guess = GuessHandler.getNumber();
		session().put("guess", Integer.toString(guess));

		Html content = numberguessview.render(guess,
				LanguageController.getLanguage());
		return ok(content);
	}

	public static Result post() {

		String guess = form(GuessSubmit.class).bindFromRequest().get().guessValue;
		int expected = Integer.parseInt(session().get("guess"));

		GuessResultPair result = GuessHandler.checkAnswer(guess, expected); 
		switch (result.result) {
		case CORRECT:
			System.out.println("CORRECT");
			flash("Correct", "");
			flash("String", guess);
			flash("Int", Integer.toString(result.value));
			break;
		case FALSENUMBER:
			System.out.println("FALSE");
			flash("False", "");
			flash("String", guess);
			flash("Int", Integer.toString(result.value));
			flash("eInt", Integer.toString(expected));
			break;
		case INVALIDNUMBER:
			System.out.println("INVALID");
			flash("Invalid", "");
			flash("String", guess);
			flash("eInt", Integer.toString(expected));
			break;
		case ERROR:
			System.out.println("ERROR");
		}
		return redirect(routes.NumberGuess.get());
	}

	public static class GuessSubmit {

		public String guessValue;
	}
}