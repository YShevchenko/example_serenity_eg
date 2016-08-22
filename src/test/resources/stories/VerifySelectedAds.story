Scenario: Verify ads selected on Search Results page are displayed on Selected Ads page
Given user is on homepage
And user switches language
When user navigates to <Электротехника> section
And user performs search with next details:
| searchQuery | minPrice | maxPrice | subDivision | region | searchPeriod       | sortBy |
| Компьютер   |          |          |             | Рига   | За последний месяц |        |
And user sorts results by price
And user selects deal type <Продажа> on search results page
And user performs extended search with next details:
| searchQuery | minPrice | maxPrice | subDivision | region | searchPeriod       | sortBy |
| Компьютер   | 0        | 300      |             | Рига   | За последний месяц |        |
And user selects 3 random ads
And user navigates to Selected Ads page
Then same ads are displayed as were selected on Search Results page