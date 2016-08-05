package com.example.tringuyen.passingdata;

/**
 * Created by Tri Nguyen on 8/5/2016.
 */
public class ObjectSample {
    private String id;
    private  String name;

    public ObjectSample (String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
