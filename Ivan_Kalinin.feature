Feature: Epam web test

Scenario: check "INSIGHTS"
Given I have open "https://www.epam.com/"
And click on "MENU" button
When I click on "INSIGHTS" button
Then I see insights page


Scenario: check "PRIVACY POLICY"
Given I have open "https://www.epam.com/"
And scroll to "PRIVACY POLICY" button
When I click on "PRIVACY POLICY" button
Then I see privacy policy page


Scenario: Partners check 
Given I have open "https://www.epam.com/"
And scroll to "Learn more about our partners" button
When I click on "Learn more about our partners" button
Then I see Epam's partners list


Scenario: check how Epam works
Given I have open "https://www.epam.com/"
Given I click on "MENU" button
When I click on "HOW WE DO IT"
Then I see how Epam works page


Scenario: check "Join our Team"
Given I have open "https://www.epam.com/"
Given I click on "MENU" button
When I click on "CAREERS" button
And click on "Join our Team"
Then I see job in Epam page


Scenario: check letter picture
Given I have open "https://www.epam.com/"
When I click on letter picture
Then I see page how to contact with Epam


Scenario: check Epam's brands
Given I have open "https://www.epam.com/"
When I scroll to "OUR BRANDS"
Then I see Epam's brands list


Rule: User open Search
Scenario: Frequent searchs check
Given choose "Search" from frequent
When I press enter
Then I see all blogs about "Result"

Examples:
|First                             |Result
|BLOCKCHAIN                        |BLOCKCHAIN
|Cloud                             |Cloud 
|DevOps                            |DevOps  
|Open Source                       |Open Source
|RPA                               |RPA
|Automation                        |Automation 
|Governance, Risk & Compliance     |Governance, Risk & Compliance 
|Contact                           |Contact      
