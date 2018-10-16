package info.thecodinglive.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "HelloServlet2", urlPatterns = {"/hellopost"})
public class HelloServlet2 extends HttpServlet {


    /**
     *  2.3.1.2 POST 요청 처리
     *
     *  doPost는 post 요청에 대해서만 처리할 수 있는 메서드이다. URL이 일치해도 에러 405(ERROR 405)가 발생한다.
     *  서블릿 뿐만 아니라 모든 HTTP 요청에 대해 서버가 허용하지 않는 경우 HTTP에러코드 405'method not allow'를 응답 받게 된다.
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost 호출");
    }
}
