package interfaces;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/shopping")
public interface ClientService {

	
	
	@POST
	@Path("/order/add/{description}")
	void saveNewOrder(@FormParam("description") String description);
	
	
	
	@GET
	@Path("/order/all")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listOrders();

	
}
