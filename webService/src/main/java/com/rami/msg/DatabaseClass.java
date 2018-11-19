package com.rami.msg;

import com.rami.msg.message.Message;
import com.rami.msg.profile.Profile;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {


    private static Map<Long, Message> message = new HashMap<>();
    private static Map<String, Profile> profile = new HashMap<>();

    public static Map<Long, Message> getMessages() {

        return message;
    }

    public static Map<String, Profile> getProfile() {

        return profile;
    }

}
