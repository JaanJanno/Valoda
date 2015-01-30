package controllers.guess.dateguesser;

import controllers.LanguageController;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Html;
import views.html.dateguess.dateguessview;

public class DateGuess extends Controller {

	public static Result get() {
		Html content = dateguessview.render(LanguageController.getLanguage());
		return ok(content);
	}
}