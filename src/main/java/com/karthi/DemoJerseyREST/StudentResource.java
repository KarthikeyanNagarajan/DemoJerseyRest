package com.karthi.DemoJerseyREST;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {

	StudentRepository repo = new StudentRepository();

	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Student> getStudent() {
		return repo.getStudent();
	}
	
	@GET
	@Path("student/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Student getStudent(@PathParam("id") int id) {
		return repo.getStudent(id);
	}

	@POST
	@Path("student")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Student createStudent(Student s) {
		repo.createStudent(s);
		return s;
	}

}
