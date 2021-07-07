package lession_4;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class github {

    @Test
    void shouldFindWikiOnGitHub() {

        open("https://github.com/selenide/selenide");

        $(".UnderlineNav-body").$(byText("Wiki")).click();
        $(".js-wiki-more-pages-link").click();
        $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("SoftAssertsExtension.class"));
        }
}
