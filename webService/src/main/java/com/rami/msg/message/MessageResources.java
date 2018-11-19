package com.rami.msg.message;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/message")
public class MessageResources {

    MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessage(@QueryParam("year") int year,
                                    @QueryParam("start") int start,
                                    @QueryParam("size") int size) {

        if (year > 0)
            return messageService.getAllMessageForYear(year);
        if (start >= 0 && size > 0)
            return messageService.getAllMessagePaginated(start, size);

        return messageService.getAllMessage();

    }

    @GET
    @Path("/{messageID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getSingleMessage(@PathParam("messageID") long id) {

        return messageService.getMessage(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message addMessage(Message message) {

        messageService.addMessage(message);
        return message;
    }


    @POST
    @Path("delete")
    @Consumes(MediaType.APPLICATION_JSON)
    public Student changeName(Student student) {

        System.out.println(student.getFirstName());
        return student;
    }

    @PUT
    @Path("/{messageID}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message updateMessage(@PathParam("messageID") long id, Message message) {
        message.setId(id);
        return messageService.updateMessage(message);
    }

    @DELETE
    @Path("/{messageID}")
    public void deleteMessage(@PathParam("messageID") long id) {

        messageService.removeMessage(id);

    }
}
