import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@Slf4j
@Data
@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet")
public class FirstServlet implements Servlet {


    public void init(ServletConfig servletConfig) throws ServletException {
        log.info(this.getClass().getSimpleName() + " initialized.");

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest Req, ServletResponse Res) throws ServletException, IOException {
        log.info("New request");
        for(int i = 0; i < 10; i++) {
            Product product = new Product("Butter " + i, i);
            Res.getWriter().printf("<h1>" + product.toString() + "</h1>");
        }
    }

    public String getServletInfo() {
        return "FirstServlet";
    }

    public void destroy() {
        log.info("Servlet {} destroyed", this.getServletInfo());
    }
}
