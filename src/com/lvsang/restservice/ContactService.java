package com.lvsang.restservice;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Path("/contact")
public class ContactService {
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllContact() {
		String jsonResult = "";
		List<Contact> lst = new ArrayList<Contact>();
		Contact aContact = new Contact();
		aContact.setId(100);
		aContact.setName("Johny");
		aContact.setAddress("HCM 780");
		
		lst.add(aContact);
		
		aContact = new Contact();
		aContact.setId(100);
		aContact.setName("Vu");
		aContact.setAddress("Binh Duong 123");
		lst.add(aContact);
		
		Gson gson = new GsonBuilder().create();
		
		jsonResult = gson.toJson(lst);
		
		return Response.status(200).entity(jsonResult).build();
	}
	
	@GET
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getContact(@PathParam("name") String name) {
	//public Response getContact() {
		String jsonResult = "";
		
		System.out.println("Request param: " + name);
		
		Contact aContact = new Contact();
		aContact.setId(100);
		aContact.setName("John");
		aContact.setAddress("Somewhere 250");
		
		Gson gson = new GsonBuilder().create();
		
		jsonResult = gson.toJson(aContact);
		
		return Response.status(200).entity(jsonResult).build();
	}
}
