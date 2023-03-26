package Homepage;

import WebElementsHomePage.WebElements;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static WebElementsHomePage.WebElements.*;

public class Homepage extends WebAPI {
    @FindBy (how = How.XPATH, using = ENMousehoverXpath) public WebElement ENMouseHover;
    @FindBy(how = How.XPATH, using = ESMouseHoverXpath ) public WebElement ESMouseHover;
    @FindBy(how = How.XPATH, using = ENRadioButtonXpath ) public WebElement ENRadioButton;
    @FindBy(how = How.XPATH, using = ESRadioButtonXpath ) public WebElement ESRadioButton;

    @FindBy(xpath = ENMousehoverXpath) public WebElement elemnt;

    public void mouseHoverLanguageMenu(){
        // Hovering over language menu option where it says EN(means language is English)
        mouseHover(ENMouseHover);

        // After mover Radio button option pops up, we aare chosing Spanish language Radio Button
        ESRadioButton.click();

        // After that we are hovering over the language menu again where it says ES(Spnanish)
        mouseHover(ESMouseHover);

        //Changing language by clicking English Radio Button
        ENRadioButton.click();
    }

}
