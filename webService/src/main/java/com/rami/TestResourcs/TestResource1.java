package com.rami.TestResourcs;


import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class TestResource1 {


    public static void main(String[] args) {

    /*    Client programmer1 = ClientBuilder.newClient();  // someone want to call the service

        String service_URL = "http://localhost:8080/EE8/rest/data/{methodCall}/{var1}/{var2}";

        WebTarget myResourceFinalURL = programmer1.target(service_URL)
                .path("ZZZ")
                .resolveTemplate("methodCall", "getM")
                .resolveTemplate("var1", "najjar")
                .resolveTemplate("var2", "rami");
        //.queryParam("var1", "rami")
        //.queryParam("var2", "najjar");

        System.out.println(myResourceFinalURL.toString());

        Invocation.Builder builder = myResourceFinalURL.request(MediaType.TEXT_PLAIN);

        String data = builder.get(String.class);

        System.out.println(data);
*/
        // ==========================================

        String service_URL2 = "http://localhost:8080/EE8/rest/data";

        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(service_URL2).path("personInfo");
        System.out.println(webTarget.toString());

        Invocation.Builder builder2 = webTarget.request(MediaType.APPLICATION_JSON);
        Person ref = new Person("rami", "programmer", "1");
        Response person = builder2.post(Entity.entity(ref, MediaType.APPLICATION_JSON));


        String josn = "{ tutorials: { id:Crunchify, topic: REST ervice description: This is REST Service Example by Crunchify }";

    }

}