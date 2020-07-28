package pages;

import com.codeborne.selenide.Condition;
import dto.User;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class GooglePage {

    public List<String> searchForUser(User user) {
        open("https://www.google.com/");

        String query = String.format("%s %s",
                user.getName().getFirst(),
                user.getName().getLast());
        $(By.name("q"))
                .val(query)
                .pressEnter();
        $("#res").shouldBe(Condition.visible);

        return $$("#res .g .rc .r a h3").texts();
    }
}
