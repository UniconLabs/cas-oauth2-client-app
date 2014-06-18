/**
 * 
 */
package net.unicon.cas.oauth;

import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;
import org.pac4j.oauth.client.CasOAuthWrapperClient;

/**
 * @author Misagh Moayyed (<a href="mailto:mmoayyed@unicon.net">mmoayyed@unicon.net</a>)
 * @since 
 */
public abstract class AbstractOAuthServlet extends HttpServlet {

    private static final long serialVersionUID = -5703676053950254598L;

    protected Logger logger = Logger.getLogger(this.getClass());
    
    protected static CasOAuthWrapperClient client;
    
    static {
        client = new CasOAuthWrapperClient("cas1_key", "cas1_secret",
                "https://mmoayyed.unicon.net:8443/cas/oauth2.0");
        client.setCallbackUrl("https://mmoayyed.unicon.net:8443/OAuth2TestApp/oauth2callback");
    }
}
