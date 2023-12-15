package Api.Testing;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/Api")
public class MyApi {

	
	@GET
    public String get() {
        return "Hello, World!";
    }

}
