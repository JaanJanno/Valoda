package controllers;

import play.mvc.*;
import play.twirl.api.Html;
import views.html.*;

public class Application extends Controller {

	public static Result index() {
		Html indexContent = index.render(
LanguageController.getLanguage());
		return ok(indexContent);
	}
}