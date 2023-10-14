@smoke
@hepsiburada
Feature: Go to homepage and check

  Scenario:Add product to cart

    Given Click Allow
    When Go to the homepage and check
    When Click Kategorilerim
    When Click Android Telefonlar
    When Set price range
    When Click on sepete ekle
    When Click the add to cart button
    When Click on Sepetim
    When Remove the product from the cart
    Then Verify the product has been removed from your cart message


