import org.junit.*;

import controllers.LanguageController;
import play.twirl.api.Content;
import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

public class ApplicationTest {

	@Test
	public void renderTemplate() {
		Content html = views.html.index
				.render(LanguageController.getLanguage());
		assertThat(contentType(html)).isEqualTo("text/html");
		assertThat(contentAsString(html)).contains("Valoda");
	}

}
