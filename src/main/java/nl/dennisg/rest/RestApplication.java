package nl.dennisg.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import nl.dennisg.rest.resources.HelloWorld;

public class RestApplication extends Application {

	@SuppressWarnings("serial")
	private static final Set<Class<?>> CLASSES = new HashSet<Class<?>>() {{
		add(HelloWorld.class);
	}};
	
	@Override
	public Set<Class<?>> getClasses() {
		return CLASSES;
	}
}
