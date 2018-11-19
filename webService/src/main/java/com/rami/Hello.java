package com.rami;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHi() {

        return "hi";
    }


    @POST
    @Path("/{param}")
    public void printOutData(@PathParam("param") String data) {

    }


  /*  private void jsonParserTest() {
        JsonParser parser = Json.createParser();
        JsonParserFactory jsonParserFactory = JsonParserFactory();
    }*/
}

