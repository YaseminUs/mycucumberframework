$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Project.feature");
formatter.feature({
  "line": 1,
  "name": "Adding below data to your excel file in Sheet3",
  "description": "",
  "id": "adding-below-data-to-your-excel-file-in-sheet3",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3536537729,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "A",
  "description": "",
  "id": "adding-below-data-to-your-excel-file-in-sheet3;a",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@project"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Go to Database and get First name and Last name of employees who works in Europe and validate with their UI information (First name, Last Name).",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Go to Excel and update column ‘Actual # of Employees’ with number of Europe employees that you get from UI.",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Compare ‘Actual # of Employees’’ with ‘expected # of Employees’ and if they matched then update ‘Test Execution Status’ cell as PASSEDif not match then update with FAILED.",
  "keyword": "Then "
});
formatter.match({
  "location": "HRApplicationSteps.go_to_Database_and_get_First_name_and_Last_name_of_employees_who_works_in_Europe_and_validate_withtheirUI_information_First_name_Last_Name()"
});
formatter.result({
  "duration": 441095347,
  "error_message": "org.openqa.selenium.InvalidArgumentException: invalid argument\n  (Session info: chrome\u003d78.0.3904.108)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027yasemins-MacBook-Air.local\u0027, ip: \u0027fe80:0:0:0:90:ccde:b436:f54%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u002711.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.108, chrome: {chromedriverVersion: 78.0.3904.105 (60e2d8774a81..., userDataDir: /var/folders/7t/y0zkqr097vd...}, goog:chromeOptions: {debuggerAddress: localhost:53189}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: bc9fccb5cc0f6da9fbcdbb078a88ae08\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\n\tat stepDefs.HRApplicationSteps.go_to_Database_and_get_First_name_and_Last_name_of_employees_who_works_in_Europe_and_validate_withtheirUI_information_First_name_Last_Name(HRApplicationSteps.java:17)\n\tat ✽.Given Go to Database and get First name and Last name of employees who works in Europe and validate with their UI information (First name, Last Name).(Project.feature:4)\n",
  "status": "failed"
});
formatter.match({
  "location": "HRApplicationSteps.go_to_Excel_and_update_column_Actual_of_Employees_with_number_of_Europe_employees_that_you_get_from_UI()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HRApplicationSteps.compare_Actual_of_Employees_with_expected_of_Employees_and_if_they_matched_then_update_Test_Execution_Status_cell_as_PASSEDif_not_match_then_update_with_FAILED()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 886948041,
  "status": "passed"
});
});