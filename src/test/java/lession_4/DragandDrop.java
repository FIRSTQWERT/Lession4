package lession_4;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragandDrop {
    @Test
    void DragandDroptest(){

        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").dragAndDropTo("#column-b"); // Работает
        $("#column-a").shouldHave(text("B"));
    }
}
