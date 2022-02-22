package co.com.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.*;

public class RegisterDevicePage {
    public static final Target COMPUTER = the("Select SO").located(By.xpath("//span[@class='btn btn-default form-control ui-select-toggle']/span[@class='ui-select-match-text pull-left ui-select-allow-clear']"));
    public static final Target SELECT_COMPUTER = the("Enter SO").located(By.xpath("//div[@id='web-device']/div/div/div/input[@placeholder='Select OS']"));
    public static final Target VERSION = the("Select Version").located(By.xpath("//div[@class='ui-select-match']/span[@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target SELECT_VERSION = the("Enter Version").located(By.xpath("//div[@id='web-device']/div/div/div/input[@placeholder='Select a Version']"));
    public static final Target LANGUAGE = the("Select Language").located(By.xpath("//div[@class='ui-select-box']/div/div[@class='ui-select-match']/span[@class='btn btn-default form-control ui-select-toggle' and @aria-label='Select OS language']"));
    public static final Target SELECT_LANGUAGE = the("Enter Language").located(By.xpath("//div[@id='web-device']/div/div/div/input[@placeholder='Select OS language']"));
    public static final Target MOBILE = the("Select Mobile").located(By.xpath("//div[@id='mobile-device']/div/div/div/div/span[@class='btn btn-default form-control ui-select-toggle' and @aria-label='Select Brand']"));
    public static final Target SELECT_MOBILE = the("Enter Mobile").located(By.xpath("//*[@type='search' and @placeholder='Select Brand']"));
    public static final Target MODEL = the("Select Model").located(By.xpath("//div[@id='mobile-device']/div/div/div/div/span[@class='btn btn-default form-control ui-select-toggle' and @aria-label='Select a Model']"));
    public static final Target SELECT_MODEL = the("Enter Model").located(By.xpath("//*[@type='search' and @placeholder='Select a Model']"));
    public static final Target SYSTEM = the("Select System").located(By.xpath("//div[@id='mobile-device']/div/div/div/div/span[@class='btn btn-default form-control ui-select-toggle' and @aria-label='Select OS']"));
    public static final Target SELECT_SYSTEM = the("Enter System").located(By.xpath("//div[@id='mobile-device']/div/div/div/input[@placeholder='Select OS']"));
    public static final Target LAST_STEP = the("Enter Last Step").located(By.xpath("//div[@class='pull-right next-step']/a[@class='btn btn-blue pull-right']"));
}
