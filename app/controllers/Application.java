package controllers;

import play.*;
import play.mvc.*;
import play.twirl.api.Html;
import views.html.*;

@SuppressWarnings("unused")
public class Application extends Controller {

	public static Result index() {
		Html indexContent = index.render();
		return ok(indexContent);
	}
}
