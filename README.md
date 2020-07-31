# Venngage QA Technical Challenge
## Answers to questions

### If you were asked to implement all the tests of sign up page, list out the tests:
1. You would implement
- Click on the sign up button without any data entered and verify the validation message(s)
- Skip entering first name and verify the validation message
- Skip entering last name and verify the validation message
- Skip entering email and verify the validation message
- Skip entering password and verify the validation message
- Enter previosly registered e-mail
- Enter invalid format for an e-mail (numbers, special characters, email@something,...)
2. You would not implement and the reasons
- Getting to the sign up page by hovering&clicking the button on each displayed template on Templates page, because I would assume if the flow works for one template, it will work for all clickable templates.
- Sign up flows with Facebook and Google, because that is the third-party API integration and user is being authenticated outside of Venngage.


### If the Google Recaptcha exists, what will you do to unblock the sign up automation tests and further tests after successful registration
I am trying to follow the official Selenium contributors community advices in my work. The official attitude towards automating CAPTCHA is not to try to automate it, but to remove it from the environment where automated tests are run.

### If you had to run the Sign Up test flow 100 times, each using a different email, what would you do to run the test efficiently?
1. I would create a Java method for generating random e-mail addresses that would feed the test
2. I would run the test inside a for loop with a counter set to loop 100 times (int i = 0, i < 100, i++)

### What else would you verify to make sure that the account has signed up successfully?
I would check if a venngage_sid cookie is saved to confirm that a session was successfully created.
