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
        //$(".js-wiki-more-pages-link").click();
        //$(".wiki-rightbar").shouldHave(text("SoftAssertions"));
        //$(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $(byText("SoftAssertions")).click(); //У меня не работает
        $(".markdown-body").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})"));
    }
}
