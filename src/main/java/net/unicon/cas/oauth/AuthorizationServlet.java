/**
 * 
 */
package net.unicon.cas.oauth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pac4j.core.context.J2EContext;
import org.pac4j.core.context.WebContext;

/**
 * @author Misagh Moayyed (<a href="mailto:mmoayyed@unicon.net">mmoayyed@unicon.net</a>)
 */
public class AuthorizationServlet extends AbstractOAuthServlet {

    private static final long serialVersionUID = -183843216976018337L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            WebContext ctx = new J2EContext(req, resp);
            client.redirect(ctx, false, false);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
