import org.junit.*;

import play.test.*;
import play.libs.F.*;
import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

public class LanguageTest {

	@Test
	public void defaultTest() {
		running(testServer(3333, fakeApplication(inMemoryDatabase())),
				HTMLUNIT, new Callback<TestBrowser>() {
					public void invoke(TestBrowser browser) {
						browser.goTo("http://localhost:3333");
						assertThat(browser.pageSource()).contains("Ülesanded");
					}
				});
	}

	@Test
	public void englishTest() {
		running(testServer(3333, fakeApplication(inMemoryDatabase())),
				HTMLUNIT, new Callback<TestBrowser>() {
					public void invoke(TestBrowser browser) {
						browser.goTo("http://localhost:3333/lang/en");
						browser.goTo("http://localhost:3333");
						assertThat(browser.pageSource()).doesNotContain(
								"Ülesanded");
						assertThat(browser.pageSource()).contains("Exercises");
					}
				});
	}
}
