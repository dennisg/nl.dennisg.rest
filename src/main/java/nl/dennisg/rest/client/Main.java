package nl.dennisg.rest.client;

import javax.ws.rs.core.MediaType;

import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;


public class Main {

	public static void main(String[] args) {
		RestClient client = new RestClient();

		Resource resource = client.resource("http://localhost:8080/WinkRest/rest/hello");

		String response = resource.accept(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println(response);
		
		response = resource.accept(MediaType.APPLICATION_JSON).queryParam("name", "dgg").get(String.class);
		System.out.println(response);
		
		//reset the resource, since we change the accept
		resource = client.resource("http://localhost:8080/WinkRest/rest/hello");
		response = resource.accept(MediaType.TEXT_PLAIN).get(String.class);
		System.out.println(response);
	}
}
