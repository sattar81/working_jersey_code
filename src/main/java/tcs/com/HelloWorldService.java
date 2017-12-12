package tcs.com;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/getEmp/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Welcome to openshift World:" + msg;
 
		return Response.status(200).entity(output).build();
 
	}
 
}