package stepDefinitions;

import context.ScenarioContext;
import dto.User;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;
import utils.RandomUserGenerator;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomUserSearchStepDefinitions {

    @Given("a random User was generated")
    public void a_random_User_was_generated() {
        User user = new RandomUserGenerator().getRandomUser();

        Scenario scenario = ScenarioContext.get("scenario");
        scenario.write(String.format("Generated User:\n%s", user.toString()));

        ScenarioContext.put("User", user);
    }

    @When("search for the User in the Google is made")
    public void search_for_the_User_in_the_Google_is_made() {
        List<String> searchResults = new GooglePage()
                .searchForUser(ScenarioContext.get("User"));

        ScenarioContext.put("Search results", searchResults);
    }

    @Then("the User has a profile on the Facebook")
    public void the_User_has_a_profile_on_the_Facebook() {
        User user = ScenarioContext.get("User");
        List<String> searchResults = ScenarioContext.get("Search results");

        String expectedResult = String.format("%s %s Profiles | Facebook",
                user.getName().getFirst(),
                user.getName().getLast());

        assertThat(searchResults).contains(expectedResult);
    }
}
