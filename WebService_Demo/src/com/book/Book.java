package com.book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book")
public class Book {
@GET
@Produces(MediaType.TEXT_XML)
	public String sayHelloXml()
	{
		
		String response="<?xml version='1.0'?>"+"<hello>Hello xml</hello>";
		return response;
	}
}
