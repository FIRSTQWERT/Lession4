package lession_4;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class github {

    @Test
    void shouldFindWikiOnGitHub() {

        open("https://github.com/selenide/selenide");

        $(".UnderlineNav-body").$(byText("Wiki")).click();
        $(".markdown-body").shouldHave(text("Soft assertions"));
        $(".markdown-body").$(byText("Soft assertions")).click();
        $(".markdown-body").shouldHave(text("SoftAssertsExtension.class"));
    }
}
