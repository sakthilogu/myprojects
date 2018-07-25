Feature:Wallet hub light user creation and review posting
Scenario:Light user creation
Given wallet hub url opened
Then enter username and password and click join


Scenario:Navigating to provided Wallet hub review url
Given Navigate to the url provided
When click on the fifth star or write a review link
And redirected to the write a review page now click on the policy dropdown to choose value as health
And click on the review text pane to write review about wallet hub
And click submit to post the review
Then verify the confirmation message
Then navigate to the provided url to check the review feed get posted
Then close browser

