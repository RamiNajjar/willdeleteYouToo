package com.rami.msg.profile;

import com.rami.msg.DatabaseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProfileService {


    Map<String, Profile> profiles = DatabaseClass.getProfile();

    public ProfileService() {
        profiles.put("ramiNJR", new Profile(1L, "Rami alNajjar", "rami", "najjar"));
    }

    public List<Profile> getAllProfile() {

        return new ArrayList<Profile>(profiles.values());
    }

    public Profile getProfile(String profileName) {

        return profiles.get(profileName);
    }

    public Profile addProfile(Profile profile) {

        profile.setId(profiles.size() + 1);
        profiles.put(profile.getProfileName(), profile);
        return profile;
    }

    public Profile updateProfile(Profile profile) {
        if (profile.getProfileName().isEmpty())
            return null;

        profiles.put(profile.getProfileName(), profile);
        return profile;
    }

    public Profile removeProfile(String profileName) {

        return profiles.remove(profileName);

    }


}
