$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To validate login functionality in Facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate login functionality with invalid username and password",
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
  "name": "The user has to fill \"\u003cusername\u003e\"  and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user has to  clcik the login button",
  "keyword": "And "
});
formatter.step({
  "name": "The user should be in invalid page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "mano",
        "5678"
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
formatter.step({
  "name": "The user should be in Facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.the_user_should_be_in_Facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login functionality with invalid username and password",
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
  "name": "The user has to fill \"mano\"  and \"5678\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_fill_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to  clcik the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_clcik_the_login_button()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.LoginSteps.the_user_has_to_clcik_the_login_button(LoginSteps.java:31)\r\n\tat ✽.The user has to  clcik the login button(file:src/test/resources/Features/login.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "The user should be in invalid page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_should_be_in_invalid_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
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
formatter.step({
  "name": "The user should be in Facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.the_user_should_be_in_Facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate registration functionality1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "The user has to fill firstname and lastname details",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_fill_firstname_and_lastname_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user to click the sign up button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_to_click_the_sign_up_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user successfully register",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_successfully_register()"
});
formatter.result({
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
formatter.step({
  "name": "The user should be in Facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.the_user_should_be_in_Facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate registration functionality2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "The user has to fill firstname and lastname details",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_fill_firstname_and_lastname_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user to click the sign up button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_to_click_the_sign_up_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user successfully register",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_successfully_register()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});