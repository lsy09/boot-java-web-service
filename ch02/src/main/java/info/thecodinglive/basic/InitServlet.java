package info.thecodinglive.basic;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 2.2.1.1 서블릿 초기화와 init 메서드
 *
 * HttpServlet은 추상 클래스인데 일반적으로 서블릿을 만들 때는 HttpServlet을 상속 받아 만든다.
 * init 메서드는 초기화에 대응되는 메서드이므로 한번만 호출되고,
 * URL 매핑은 WebServlet 어노테이션(annotation)으로 작성한다.
 */

@WebServlet(
        name = "initServlet", urlPatterns = {"/init"},
        initParams = {@WebInitParam(name = "siteName", value = "jpub")}
)
public class InitServlet extends HttpServlet{
    private String myParam = "";

    public void init(ServletConfig servletConfig) throws ServletException{
        System.out.println("init call");
        this.myParam = servletConfig.getInitParameter("siteName");
        System.out.println("입력받은 사이트 명은" + myParam + "입니다.");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("hello");
    }
}

