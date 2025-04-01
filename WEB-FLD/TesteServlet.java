import io.ee.serweja.annotations.BrittoServlet;
import io.ee.serweja.http.*;
//import com.google.gson.*;

@BrittoServlet(path="/hello")
public class TesteServlet extends BrittoHttpServlet{

     public void doGet(BrittoHttpRequest request, BrittoHttpResponse response){

        Produto p = new Produto(1234, "Computador", 1500.0);
        //Gson gson = new Gson();


        response.setHeader("Content-Type","application/json");
        //response.setContent(gson.toJson(p).getBytes());
        response.setContent(p.toJson().getBytes());
    }
}