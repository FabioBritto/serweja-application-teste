import io.ee.serweja.annotations.BrittoServlet;
import io.ee.serweja.http.BrittoHttpRequest;
import io.ee.serweja.http.BrittoHttpResponse;
import io.ee.serweja.http.BrittoHttpServlet;

@BrittoServlet(path="/adicionar")
public class DatabaseServletPost extends BrittoHttpServlet{
    public void doPost(BrittoHttpRequest request, BrittoHttpResponse response){
        System.out.println(request.getBody());
        Database.add(request.getBody());
        response.setHeader("Content-Type", "text/plain");
        response.setContent("Adicionado".getBytes());
    }
}
