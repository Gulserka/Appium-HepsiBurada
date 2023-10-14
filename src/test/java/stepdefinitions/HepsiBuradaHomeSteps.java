package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HepsiBuradaHomePages;
import utils.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class HepsiBuradaHomeSteps {

    HepsiBuradaHomePages homePages = new HepsiBuradaHomePages();
    @Given("Go to the homepage and check")
    public void GoToTheHomepageAndCheck() {
        assertTrue(homePages.hepsiBuradaImage.isDisplayed());
    }

    @When("Click Allow")
    public void clickAllow() {
        homePages.allowButton.click();
    }

    @When("Click Kategorilerim")
    public void kategorilerimeTikla() {
        homePages.kategorilerim.click();
    }

    @When("Click on sepete ekle")
    public void urunuSepeteEkle() {
        homePages.sepeteEkle.click();
    }

    @When("Urun renk sec")
    public void urunRenkSec() {
        homePages.beyazRenk.click();
    }

    @When("Click the add to cart button")
    public void sepeteEkleButonunaTikla() {
        homePages.sepeteEkleSon.click();
        ReusableMethods.waitFor(2);
    }

    @When("Click on Sepetim")
    public void sepetimButonunaTikla() {
        homePages.sepetim.click();
    }

    @When("Alisverisi tamamla butonuna tikla")
    public void alisverisiTamamlaButonunaTikla() {
        homePages.alisverisiTamamla.click();
    }

    @When("Guvenli alisveris sitesine yonlen")
    public void guvenliAlisverisSitesineYonlen() {
    }

    @When("Click Android Telefonlar")
    public void androidTelefonlaraTikla() {
        homePages.androidTelefonlar.click();
    }

    @When("Set price range")
    public void FiyatAraligiBelirle() {
        homePages.fiyatAraligi.click();
        homePages.enAzFiyat.sendKeys("5000");
        homePages.enCokFiyat.sendKeys("8000");
        homePages.fiyatAraligiUygulaButon.click();
    }

    @When("Remove the product from the cart")
    public void urunuSepettenCikar() {
        homePages.sepettenCikar.click();
    }

    @Then("Verify the product has been removed from your cart message")
    public void ürünSepetinizdenKaldirildiYazisiniGor() {
        assertTrue(homePages.sepettenKaldirildiAlert.isDisplayed());
    }
}
