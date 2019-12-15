 @TEC-103
 Feature: Etsy Search Functionality

     @TECTC-1011
     Scenario Outline: Validate Etsy search message
       Given Navigate Etsy Homepage
       When  User searches for "<item>"
       Then Validate search message have word "<item>"
       Examples:
       |item|
       |carpet|
       |123   |

     @TECTC-1012
     Scenario Outline: Validate each department of Etsy has valid title
       Given Navigate Etsy Homepage
       When User clicks on "<department>"
       Then User validate title "<title>"
       Examples:
         | department            | title                         |
         | Jewelry & Accessories | Jewelry & Accessories \| Etsy |
         | Clothing & Shoes      | Clothing & Shoes \| Etsy      |
         | Home & Living         | Home & Living \| Etsy         |
         | Wedding & Party       | Wedding & Party \| Etsy       |
         | Toys & Entertainment  | Toys & Entertainment \| Etsy  |

   @TECTC-1013
   Scenario: Validate all items are having free shipping label
     Given Navigate Etsy Homepage
     When User searches for "Wireless Phone Charger"
     And User clicks on Free Shipping checkbox
     Then  Verify all result have "FREE shipping" label

   @TECTC-1014
   Scenario: Validating over price functionality
     Given Navigate Etsy Homepage
     When User searches for "<carpet>"
     And User click on Over Price checbox
     Then User verifies all items prices ar over that price



