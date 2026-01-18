Feature:to perform multiple scenario 
Background: to automate login form 
Given : will are on login form 
When : will enter valid username in username field
And :will enter valid password in password field 
Then : will click on login button

Scenario:to perform mouse hover on every menu options 
When : we will  mouse hover on admin option 
And : we will mouse hover on PIM option
When : we will mouse hover on Leave option
And : we will mouse hover on Time option
When :we will mouse hover on recruitment option
And : we wil mouse hover on my info option
When : we will mouse hover on performance option
And : we will mouse hover on directory option
When : we will mouse hover on maintencence option
And : we will mouse hover on claim option
Then : we will mouse hover on Buzz option


Scenario:to add  multiple employee in PIM option
When : we will navigate to PIM option and click on add button
And : we will enter <firstname > in firsename field 
When : we will enter <middlename> in middlename field 
And : we will enter < lastname > in lastname field 
Then :user will click on signup button

Examples: 
|firstname|middlename|lastname|
|navya|abd|koli|
|saloni|dhanaji|patil|




