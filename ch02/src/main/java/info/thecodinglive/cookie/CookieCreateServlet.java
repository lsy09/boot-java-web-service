package info.thecodinglive.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 2.4.2.1 쿠키의 구성
 *
 * 쿠키(Cookie)는 사용자가 사이트를 방문 했을때, 사용자의 컴퓨터에 저장되는 정보를 말한다.
 * - 이름 : 각각의 쿠키의 값을 식별하기 위한 키
 * - 값 : 특정 이름으로 쿠키에 지정된 값
 * - 유효시간 : 쿠키의 유지 시간
 * - 도메인 : 쿠키를 전송할 도메인
 * - 경로 : 쿠키를 전송할 요청 경로
 *
 * 쿠키는 HTTP 헤더 정보에 포함되어 전달 된다. HTTP 프로토콜은 비연결지향으로 상태 정보를 저장 하지 않는다.
 * 자연스럽게 상태 정보를 저장할 공간이 필요, 이때 사용할 수 있는 메커니즘 중 하나가 쿠키이다.
 * 쿠키는 사용자의 PC에 저장되므로 로그인 하지 않은 사용자에 대해서 다르게 적용할 필요가 있을 경우에 유용 하다.
 */
@WebServlet(urlPatterns = "/newcookie")
public class CookieCreateServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws ServletException,
            IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title> 쿠키 예제</title></head><body>");
        out.println("<br/>");

        Cookie jcookie = new Cookie("jpub", "books");
        jcookie.setMaxAge(3600); //만료시간(1시간)
        resp.addCookie(jcookie);
        out.println("<a href='/readcookie'>readcookie</a></body></html>");
    }
}
