import io.ee.serweja.annotations.BrittoServlet;
import io.ee.serweja.http.BrittoHttpRequest;
import io.ee.serweja.http.BrittoHttpResponse;
import io.ee.serweja.http.BrittoHttpServlet;

@BrittoServlet(path = "/sorteio")
public class ServletSorteio extends BrittoHttpServlet{
    public void doGet(BrittoHttpRequest request, BrittoHttpResponse response){
        response.setHeader("Content-Type", "text/plain");
        int numeroSorteado = (int) (Math.random()*1000);
        response.setContent(("Numero sorteado: " + numeroSorteado).getBytes());
    }
}
