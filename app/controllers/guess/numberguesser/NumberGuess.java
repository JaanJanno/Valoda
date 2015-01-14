package controllers.guess.numberguesser;

import controllers.LanguageController;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Html;
import views.html.numberguess.numberguessview;

public class NumberGuess extends Controller {

	public static Result get() {
		Html content = numberguessview.render(
				LanguageController.getLanguage());
		return ok(content);
	}}