package com.rami.TestResourcs;

public class Person {

    private String name;
    private String job;
    private String xp;

    public Person() {
    }

    public Person(String name, String job, String xp) {
        this.name = name;
        this.job = job;
        this.xp = xp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getXp() {
        return xp;
    }

    public void setXp(String xp) {
        this.xp = xp;
    }
}
