package com.rami.resources;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/data")
public class Resource1 {

    @GET
    @Path("getM")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHi() {

        return "hi";

    }

    @GET
    @Path("getM/{para1}/{para2}/ZZZ")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHi(@PathParam("para1") String str1, @PathParam("para2") String str2) {

        System.out.println("u reach here");
        return "the first param: " + str1 + " and the second param: " + str2;
    }

    @POST
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN)
    public Response addUser(
            @FormParam("id") int id,
            @FormParam("name") String name,
            @FormParam("price") float price) {

        return Response.ok(200)
                .entity(" Product added successfuly!<br> Id: " + id + "<br> Name: " + name + "<br> Price: " + price)
                .build();
    }


    @POST
    @Path("/personInfo")
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewPerson(@FormParam("name") String name,
                               @FormParam("job") String job,
                               @FormParam("xp") String xp) {

        return Response.ok(200).entity("Name: " + name + " job: " + job + "xp: " + xp).build();

    }


}