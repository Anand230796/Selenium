$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launch the browser and amazon application",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.user_launch_the_browser_and_amazon_application()"
});
formatter.result({
  "duration": 129077100,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify login page",
  "description": "",
  "id": "login-functionality;verify-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user enter the \"vengat\" and \"12345\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user verify the home page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "vengat",
      "offset": 16
    },
    {
      "val": "12345",
      "offset": 29
    }
  ],
  "location": "Step.user_enter_the_and(String,String)"
});
formatter.result({
  "duration": 2356300,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_clicks_login_button()"
});
formatter.result({
  "duration": 305300,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_verify_the_home_page()"
});
formatter.result({
  "duration": 55300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launch the browser and amazon application",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.user_launch_the_browser_and_amazon_application()"
});
formatter.result({
  "duration": 86800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Forgot password",
  "description": "",
  "id": "login-functionality;forgot-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user enter the username",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user clicks forgot password button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user reset the password",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_enter_the_username()"
});
formatter.result({
  "duration": 98500,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_clicks_forgot_password_button()"
});
formatter.result({
  "duration": 68400,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_reset_the_password()"
});
formatter.result({
  "duration": 72400,
  "status": "passed"
});
});