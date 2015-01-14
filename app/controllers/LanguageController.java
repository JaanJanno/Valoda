package controllers;

import play.i18n.Lang;
import play.mvc.Controller;
import play.mvc.Result;

public class LanguageController extends Controller {

	private static final String defaultLanguage = "et";

	public static Lang getLanguage() {
		String lang = null;
		try {
			lang = session().get("lang");
		} catch (Exception e) {

		}
		if (lang == null || lang.equals("null"))
			return Lang.forCode(defaultLanguage);
		return Lang.forCode(lang);
	}

	public static Result get(String lang) {
		session().put("lang", lang);
		return redirect("/");
	}
}
