package application;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import rest_impl.ClientServiceImpl;



@ApplicationPath("/rest")
public class RestApplication extends Application{
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(ClientServiceImpl.class);
		return classes;
	}
}