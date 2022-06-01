import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Homework5 {
    @Test

    public void Asserts(){
        Selenide.open("https://ee.ge/registration");
        $("#firstName").setValue("ცაგო");
        Assert.assertFalse("ველი შევსებულია",$("firstName").is(Condition.empty));
        $("#lastName").setValue("თელია");
        Assert.assertFalse("ველი შევსებულია",$("#lastName").is(Condition.empty));
        $("#email").setValue("t.telia@gmail.com");
        Assert.assertFalse("ველი შევსებულია",$("#email").is(Condition.empty));
        $("#password").setValue("tsago7");
        Assert.assertFalse("ველი შევსებულია",$("#password").is(Condition.empty));
        $("#confirmPassword").setValue("tsago7");
        Assert.assertFalse("ველი შევსებულია",$("#confirmPassword").is(Condition.empty));
        sleep(5000);
    }
    @Test
    public void AssertsFail(){
        Selenide.open("https://ee.ge/registration");
        $("#firstName").click();
        $("#lastName").click();
        Assert.assertEquals("სახელი სავალდებულოა", $(".text-danger,1").getText());
        $("#email").click();
        Assert.assertEquals("პაროლი სავალდებულოა", $(".text-danger,1").getText());

    }

}
