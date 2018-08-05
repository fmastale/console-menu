# console-menu
Application that simulates process of registering/ logging user into the system.

If user chooses to register he can fill register form. 
He should provide proper user data:
- login - unique (that means user with given login can't be registered yet), should be at least 3 characters long
- password - at least 8 chars long, should contain one uppercase letter, one digit and one special character
           - an option for user is to generate default password
- email - in proper format (e.g. johnsmith@mail.com)
- phone number - 9 digits without spaces and special characters between (e.g. 123456789)

If user chooses to login, he should provide valid login and password.
After that he can change his phone number and/ or email.

All data user provides is validated by the system.
