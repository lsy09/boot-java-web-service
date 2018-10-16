package info.thecodinglive.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = {"/helloget"})
public class HelloServlet extends HttpServlet {


    /**
     * 2.3.1.1 GET 요청 처리
     *
     * doGet메서드를 이용해서 GET 메서드 방식의 요청을 응답 받을수 있다.
     * doGet은 HttpServletRequest, HttpServletResponse를 파라미터로 전달받도록 되어 있는데,
     * HttpServletRequest는 요청에 대한 정보를 가지고 있고,
     * HttpServletResponse는 브라우저에서 정보를 표현하기 위해 사용 한다.
     * InputStream과 OutputStream 같은 관계
     *
     * HTTP 메서드 요청 방삭이 GET인 경우 브라우저를 통해서 직접 URL을 입력해서 확인한다.
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet 메소드 호출");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();

        resp.setContentType("text/html");
        writer.println("<html>");
        writer.println("<head><title>jpub java webservice</title></head>");
        writer.println("<body> get 요청 예제입니다. </body>");
        writer.println("</html>");
    }
}
