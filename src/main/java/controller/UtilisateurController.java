package controller;

import jakarta.ws.rs.Path;

@Path("/users")
public class UtilisateurController {

	public String sayHello() {
		
		return "hello";
	}
}
