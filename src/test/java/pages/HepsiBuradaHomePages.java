package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class HepsiBuradaHomePages {

    public HepsiBuradaHomePages() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);}


    @AndroidFindBy(xpath = "//android.widget.Button[1]")
    public WebElement allowButton;

    @AndroidFindBy(xpath = "//android.widget.Button[2]")
    public WebElement dontAllowButton;

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement searchButton;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Bardaklar\"]")
    public WebElement searchButton2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lütfen konum seçin']")
    public WebElement hepsiBuradaImage;


    @AndroidFindBy(uiAutomator= "new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/navigation_bar_item_icon_view\").instance(1)")
    public WebElement kategorilerim;

    @AndroidFindBy(uiAutomator= "new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/navigation_bar_item_icon_view\").instance(2)")
    public WebElement sepetim;

    @AndroidFindBy(uiAutomator= "new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/imageViewItem\").instance(5)")
    public WebElement androidTelefonlar;

    @AndroidFindBy(uiAutomator= "new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/button\").instance(0)")
    public WebElement sepeteEkle;

    @AndroidFindBy(xpath= "//android.widget.Button[@text=\"Sepete ekle\"]")
    public WebElement sepeteEkleSon;

    @AndroidFindBy(xpath= "//android.widget.Button[@text=\"Alışverişi tamamla\"]")
    public WebElement alisverisiTamamla;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Beyaz']")
    public WebElement beyazRenk;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Fiyat Aralığı']")
    public WebElement fiyatAraligi;


    @AndroidFindBy(xpath= "//android.widget.EditText[@text='En az fiyat']")
    public WebElement enAzFiyat;

    @AndroidFindBy(xpath= "//android.widget.EditText[@text='En çok fiyat']")
    public WebElement enCokFiyat;
    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Uygula']")
    public WebElement fiyatAraligiUygulaButon;

    @AndroidFindBy(xpath= "//android.view.View[@content-desc=\"Sepetten Çıkar\"]/android.widget.Image")
    public WebElement sepettenCikar;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Ürün sepetinizden kaldırıldı']")
    public WebElement sepettenKaldirildiAlert;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Sepetin şu an boş']")
    public WebElement sepetSuanBosAlert;








}
