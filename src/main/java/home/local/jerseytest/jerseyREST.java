package home.local.jerseytest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_FORM_URLENCODED + ";charset=utf-8")
public class jerseyREST {
	// private static final Logger LOG = Logger.getLogger(jerseyREST.class);

	public jerseyREST() {
		// LOG.debug("Jersey REST resource");
	}

	@GET
	@Path("helloworld")
	public Response getHello() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		GenericEntity<List<String>> entity = new GenericEntity<List<String>>(list) {
		};
		return Response.ok(entity).build();
	}

	@GET
	@Path("helloworld2")
	public Response getHello2() {
		Map<String, BigInteger> resultMap = new HashMap<>();
		resultMap.put("hello", BigInteger.valueOf(10));
		GenericEntity<Map<String, BigInteger>> entity = new GenericEntity<Map<String, BigInteger>>(resultMap) {
		};

		return Response.ok(entity).build();
	}
}
