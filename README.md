cas-oauth2-client-app
=====================

OAuth client Java web application to test CAS OAuth server support

## Configuration

In the `web.xml` file, change the following settings:

```xml
<context-param>
    <param-name>clientId</param-name>
    <param-value>cas1_key</param-value>
</context-param>

<context-param>
    <param-name>clientSecret</param-name>
    <param-value>cas1_secret</param-value>
</context-param>

<context-param>
    <param-name>casServerUrlPrefix</param-name>
    <param-value>https://mmoayyed.unicon.net:8443/cas</param-value>
</context-param>

<context-param>
    <param-name>callbackUrl</param-name>
    <param-value>https://mmoayyed.unicon.net:8443/OAuth2TestApp/oauth2callback</param-value>
</context-param>
```
 
## Deploy

From the command line:
 
```bash
mvn clean package
```
 
Then copy `target\OAuth2TestApp.war` to `$CATALINA_HOME\webapps`
 
 
## Test

In your browser, navigate to: `https://mmoayyed.unicon.net:8443/OAuth2TestApp`


