package home.local.jerseytest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class jerseyRESTApp extends Application {
	// private static final Logger LOG = Logger.getLogger(jerseyRESTApp.class);

	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<Class<?>>();
		// register root resource
		classes.add(jerseyREST.class);
		return classes;
	}

	public jerseyRESTApp() {
		// LOG.info("jerseyRESTApp");
	}
}
