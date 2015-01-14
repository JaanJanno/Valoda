package controllers.learn.datelearner;

import controllers.LanguageController;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Html;
import views.html.datelearn.datelearnview;

public class DateLearn extends Controller {

	public static Result get() {
		Html content = datelearnview.render(
				LanguageController.getLanguage());
		return ok(content);
	}}