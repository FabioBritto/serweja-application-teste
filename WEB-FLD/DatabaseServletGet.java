import io.ee.serweja.annotations.BrittoServlet;
import io.ee.serweja.http.BrittoHttpRequest;
import io.ee.serweja.http.BrittoHttpResponse;
import io.ee.serweja.http.BrittoHttpServlet;

@BrittoServlet(path="/consultar")
public class DatabaseServletGet extends BrittoHttpServlet{
    public void doGet(BrittoHttpRequest request, BrittoHttpResponse response){
        System.out.println(request.getBody());
        response.setHeader("Content-Type", "text/plain");
        response.setContent(Database.recuperar().toString().getBytes());
    }
}
