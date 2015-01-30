package controllers.learn.numberlearner;

import controllers.LanguageController;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Html;
import views.html.numberlearn.numberlearnview;

public class NumberLearn extends Controller {

	public static Result get() {
		Html content = numberlearnview.render(LanguageController.getLanguage());
		return ok(content);
	}
}