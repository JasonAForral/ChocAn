package com.DataClasses;

public class Record {

    private String currDateTime;
    private String dateProvided;
    private String providerID;
    private String memberID;
    private String serviceCode;
    private String comment;
    private String cost;

    public Record(String[] input){
        build(input);
    }

    //THIS FUNCTION MUST BE CALLED FIRST
    public void build(String [] components){
        //Builds a record from ana array of Strings.
        //The order is the order of Strings in
        //The private data section.
        if(components == null){
            return;
        }
        if(components.length != 7){
            return;
        }
        for(int i = 0; i < 7; ++i){
            if(components[i] == null){
                return;
            }
        }
        this.currDateTime = components[0];
        this.dateProvided = components[1];
        this.providerID = components[2];
        this.memberID = components[3];
        this.serviceCode = components[4];
        this.comment = components[5];
        this.cost = components[6];
    }

    public String [] getAll(){
        //Returns all the fields in an array of
        //Strings. The order is the order of the
        //private data members
        if(currDateTime == null){
            return null;
        }
        String [] components = new String [7];
        components[0] = currDateTime;
        components[1] = dateProvided;
        components[2] = providerID;
        components[3] = memberID;
        components[4] = serviceCode;
        components[5] = comment;
        components[6] = cost;
        return components;
    }

    public void display(){
        System.out.println(currDateTime);
        System.out.println(dateProvided);
        System.out.println(providerID);
        System.out.println(memberID);
        System.out.println(serviceCode);
        System.out.println(comment);
        System.out.println(cost);

    }
}
