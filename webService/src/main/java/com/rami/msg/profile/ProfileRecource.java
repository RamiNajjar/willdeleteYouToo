package com.rami.msg.profile;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileRecource {


    private ProfileService profileService = new ProfileService();

    @GET

    public List<Profile> getProfiles() {

        return profileService.getAllProfile();

    }

    @GET
    @Path("/{profileName}")
    public Profile getProfile(@PathParam("profileName") String profileName) {

        return profileService.getProfile(profileName);
    }

    @POST
    public Profile addProfile(Profile profile) {
        profileService.addProfile(profile);
        return profile;
    }

    @PUT
    @Path("/{profileName}")
    public Profile updateProfile(@PathParam("profileName") String profileName, Profile profile) {
        profile.setProfileName(profileName);
        return profileService.updateProfile(profile);
    }


    @DELETE
    @Path("/{profileName}")
    public void deleteProfile(@PathParam("profileName") String profileName) {
        profileService.removeProfile(profileName);

    }
}


