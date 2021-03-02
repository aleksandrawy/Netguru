### Requirements:
* Java 8
* Maven >= 3.6.0
* Chrome/Firefox/Edge browser - lastest version

### How to run:
1) Go to **src\main\resources** directory and edit **run.properties** file if needed:
   * _browser_ - browser name, can be chrome/firefox/edge, if none then chrome is set as default
   * _app-url_ - app url
   * _test-user_ - email of test user
   * _test-password_ - password of test user
   * _page-load-timeout_ - page load timeout (implicit wait of webdriver)
2) Go to main project repository directory (where _pom.xml_ file is located) and run `mvn clean test site` command.
3) Run `allure serve` to see results report.