package com.example.tringuyen.passingdata;

/**
 * Created by Tri Nguyen on 8/4/2016.
 */
public class SingleTon {
    private ObjectSample data = new ObjectSample("","");
    //create an object of SingleObject
    private static SingleTon singleTon = new SingleTon();
    //m ake the constructor private so that this class cannot be instantiated
    private SingleTon() {}
    //Get the only object available
    public static SingleTon getInstance()
    {
        return singleTon;
    }

    public void setData( ObjectSample data) {this.data = data;}
    public void setData (String id, String name)
    {
        data.setId(id);
        data.setName(name);
    }
    public ObjectSample getData() {return data;}

}