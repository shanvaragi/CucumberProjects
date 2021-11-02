$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/FacebookLogin.feature");
formatter.feature({
  "name": "To validate login functionality of facebook",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the url",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_type_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maxmize the window",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_maxmize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate with invalid username and invalid password Using  2 map Dimensioanl DataTable",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "The user should type the invalid username and invalid passwords",
  "rows": [
    {
      "cells": [
        "first",
        "last",
        "user",
        "pass",
        "data",
        "storage"
      ]
    },
    {
      "cells": [
        "saibaba",
        "saibaba@123",
        "varahiamman",
        "varagiamman@123",
        "shanbaba",
        "shanraja@123"
      ]
    },
    {
      "cells": [
        "jothi",
        "jothi@123",
        "karthi",
        "kathikumar@123",
        "jai",
        "jai@123"
      ]
    },
    {
      "cells": [
        "saha",
        "sahadevan@123",
        "karthi",
        "karthikeyan@123",
        "shan",
        "shanraja@123"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.theUserShouldTypeTheInvalidUsernameAndInvalidPasswords(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should get the title of the incorrect credential page",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_get_the_title_of_the_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should naviage to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_naviage_to_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "The user should type the invalid username\"\u003cuser\u003e\" and invalid password\"\u003cpass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "The user should click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "The user should get the title of the incorrect credential page",
  "keyword": "And "
});
formatter.step({
  "name": "The user should naviage to incorrect credential page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ]
    },
    {
      "cells": [
        "shan",
        "raja@123"
      ]
    },
    {
      "cells": [
        "varagi",
        "varagi@123"
      ]
    },
    {
      "cells": [
        "sai",
        "sai@123"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the url",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_type_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maxmize the window",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_maxmize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "The user should type the invalid username\"shan\" and invalid password\"raja@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_type_the_invalid_username_and_invalid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should get the title of the incorrect credential page",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_get_the_title_of_the_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should naviage to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_naviage_to_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the url",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_type_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maxmize the window",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_maxmize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "The user should type the invalid username\"varagi\" and invalid password\"varagi@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_type_the_invalid_username_and_invalid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should get the title of the incorrect credential page",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_get_the_title_of_the_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should naviage to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_naviage_to_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the url",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_type_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maxmize the window",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_maxmize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "The user should type the invalid username\"sai\" and invalid password\"sai@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_type_the_invalid_username_and_invalid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should get the title of the incorrect credential page",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_get_the_title_of_the_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should naviage to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginStepDefinition.the_user_should_naviage_to_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/ForgotPassword.feature");
formatter.feature({
  "name": "To validate forgot password feature in the facebookpage",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Verify the forgot password functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should launch the chrome browsers",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgotPasswordStepDefinition.theUserShouldLaunchTheChromeBrowsers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the Url",
  "keyword": "When "
});
formatter.match({
  "location": "ForgotPasswordStepDefinition.theUserShouldTypeTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maxmize the Window",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordStepDefinition.theUserShouldMaxmizeTheWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the forgot password link",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordStepDefinition.theUserShouldClickTheForgotPasswordLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should nagvigate to find your account page",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordStepDefinition.theUserShouldNagvigateToFindYourAccountPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the registered mobile number or email id",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordStepDefinition.theUserShouldTypeTheRegisteredMobileNumberOrEmailId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordStepDefinition.theUserShouldClickTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should nagvigate to reset your password page",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgotPasswordStepDefinition.theUserShouldNagvigateToResetYourPasswordPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});