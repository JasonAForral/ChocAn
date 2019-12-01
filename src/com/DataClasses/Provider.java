package com.DataClasses;

public class Provider extends User{

    private String[] services;

    public Provider(){
        super();
        services = null;
    }

    public Provider(String[] userData) {
        super(userData);

        int serviceCount = (userData.length)-6;
        this.services = new String[serviceCount];
        System.arraycopy(userData,6 , services, 0, serviceCount);
    }

    public int display(){
        System.out.println("Provider Information:");
        System.out.println(super.name);
        System.out.println(super.ID);
        System.out.println(super.address);
        System.out.println(super.city);
        System.out.println(super.state);
        System.out.println(super.zip);
        return 0;
    }
}
