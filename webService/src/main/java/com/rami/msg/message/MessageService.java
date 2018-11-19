package com.rami.msg.message;


import com.rami.msg.DatabaseClass;

import java.util.*;

public class MessageService {

    private Map<Long, Message> messages = DatabaseClass.getMessages();

    public MessageService() {

        messages.put(1L, new Message(1, "hello world", "Rami"));
        messages.put(2L, new Message(2, "hello jersey", "nur"));
    }

    public List<Message> getAllMessage() {

        messages.values();

        return new ArrayList<Message>(messages.values());

    }

    public Message getMessage(Long id) {

        return messages.get(id);
    }

    public Message addMessage(Message message) {

        message.setId(messages.size() + 1);
        messages.put(message.getId(), message);
        return message;
    }

    public Message updateMessage(Message message) {

        if (message.getId() <= 0)
            return null;


        messages.put(message.getId(), message);
        System.out.println(messages);

        return message;
    }

    public Message removeMessage(long id) {

        return messages.remove(id);

    }

    public List<Message> getAllMessageForYear(int year) {

        List<Message> messageForYear = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        for (Message msg : messages.values()) {
            cal.setTime(msg.getCreated());
            if (cal.get(Calendar.YEAR) == year)
                messageForYear.add(msg);
        }
        return messageForYear;
    }


    public List<Message> getAllMessagePaginated(int start, int size) {
        List<Message> list = new ArrayList<>(messages.values());
        if (start + size > list.size())
            return new ArrayList<>();
        return list.subList(start, start + size);
    }


    public static void main(String[] args) {

        Map<Long, Message> msg = new HashMap<>();

        msg.put(1L, new Message(1, "hello rami", "Rami"));
        msg.put(5L, new Message(2, "hello nour", "Nour"));
        msg.put(4L, new Message(2, "hello nour", "Nour"));

        String java;

    }
}
