package cucumber_exemple;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/vowels-count.feature"},
        glue = {"cucumber_exemple"})
public class TestRunner {
}
