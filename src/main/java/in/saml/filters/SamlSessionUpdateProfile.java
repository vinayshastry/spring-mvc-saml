package in.saml.filters;

import org.apache.commons.collections.EnumerationUtils;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SamlSessionUpdateProfile extends GenericFilterBean {
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpSession session = ((HttpServletRequestWrapper) servletRequest).getSession();

        if(EnumerationUtils.toList(session.getAttributeNames()).contains("SPRING_SECURITY_CONTEXT")) {
            String principal = (String) ((SecurityContext) session.getAttribute("SPRING_SECURITY_CONTEXT")).getAuthentication().getPrincipal();
            System.out.println(principal);
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
