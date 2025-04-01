import io.ee.serweja.annotations.BrittoServlet;
import io.ee.serweja.http.BrittoHttpRequest;
import io.ee.serweja.http.BrittoHttpResponse;
import io.ee.serweja.http.BrittoHttpServlet;

@BrittoServlet(path = "/post")
public class ServletPost extends BrittoHttpServlet{
    public void doPost(BrittoHttpRequest request, BrittoHttpResponse response){
        System.out.println("Recebido...");
        System.out.println(request.getBody());
        response.setHeader("Content-Type","text/html");
        response.setContent("FUNFOU".getBytes());
    }
}
