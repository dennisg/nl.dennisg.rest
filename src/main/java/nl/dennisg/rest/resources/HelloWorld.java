package nl.dennisg.rest.resources;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("hello")
public class HelloWorld {
	
	private final Gson m_gson = new Gson();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response index(@QueryParam("name") @DefaultValue("world") String name) {
		return Response.ok(String.format("hello %s", name)).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response indexJson(@QueryParam("name") @DefaultValue("world") String name) {
		return Response.ok(m_gson.toJson(new Payload(name))).build();
	}
	
	private class Payload {
		public Payload(String h) {
			hello = h;
		}
		private String hello;
	}

}
