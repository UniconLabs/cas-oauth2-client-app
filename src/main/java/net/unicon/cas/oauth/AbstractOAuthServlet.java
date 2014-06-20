/**
 * 
 */
package net.unicon.cas.oauth;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;
import org.pac4j.oauth.client.CasOAuthWrapperClient;

/**
 * @author Misagh Moayyed (<a href="mailto:mmoayyed@unicon.net">mmoayyed@unicon.net</a>)
 * @since 
 */
public abstract class AbstractOAuthServlet extends HttpServlet {

    private static final long serialVersionUID = -5703676053950254598L;
    protected static CasOAuthWrapperClient client;

    protected Logger logger = Logger.getLogger(this.getClass());

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        String clientId = config.getServletContext().getInitParameter("clientId");
        String clientSecret = config.getServletContext().getInitParameter("clientSecret");
        String casServerUrlPrefix = config.getServletContext().getInitParameter("casServerUrlPrefix");
        String callbackUrl = config.getServletContext().getInitParameter("callbackUrl");

        client = new CasOAuthWrapperClient(clientId, clientSecret, casServerUrlPrefix);
        client.setCallbackUrl(callbackUrl);
    }

}
