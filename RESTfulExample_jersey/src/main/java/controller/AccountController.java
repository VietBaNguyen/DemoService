package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import model.Account;
import dao.AccountHome;

@Path("/account")
public class AccountController {
	AccountHome home = null;
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Account> getAllAccount() {
		home = new AccountHome();
		List<Account> accounts = home.getAllAccount();

		return accounts;
	}
	@GET
	@Path("/model")
	@Produces(MediaType.APPLICATION_JSON)
	// @Consumes(MediaType.APPLICATION_JSON)
	public Account account() {
		Account account = new Account();
		account.setId(1);
		account.setPassword("12345");
		account.setUsername("vietba");
		return account;
	}

	@GET
	@Path("/findbyid/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	// @Consumes(MediaType.APPLICATION_JSON)
	public Account findbyID(@PathParam("param") int id) {
		home = new AccountHome();
		Account account = home.findById(id);
		return account;
	}
	
	@POST
//	@Path("/add/{param}")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void addAccount(@FormParam("id") int id, @FormParam("username") String username,
			@FormParam("password") String password, @Context HttpServletResponse servletResponse) throws IOException {
		home = new AccountHome();
		Account account = new Account(id, username, password);
		home.persist(account);
		servletResponse.sendRedirect("./account/");
	}
}
