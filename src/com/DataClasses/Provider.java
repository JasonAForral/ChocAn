package com.DataClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class Provider extends User{

    private final ArrayList<String> serviceCodes;

    public Provider(){
        super();
        serviceCodes = new ArrayList<>();
    }

    public Provider(String[] userData) {
        super(userData);

        //Builds a vector of initial serviceCodes.
        serviceCodes = new ArrayList<>();
        serviceCodes.addAll(Arrays.asList(userData).subList(6, userData.length));
    }

    public String[] getServices() {
        //Gets an array of all serviceCodes
        if (serviceCodes == null)
            return null;
        return serviceCodes.toArray(new String[0]);
    }

    public void removeService(String toRemove){
        for(int i = 0; i < serviceCodes.size(); ++i){
            if(toRemove.equals(serviceCodes.get(i))){
                serviceCodes.remove(i);
                return;
            }
        }
    }

    public void addService(String serviceName){
        if(serviceName == null){
            return;
        }
        serviceCodes.add(serviceName);
    }

    public void display(){
        System.out.println("Provider Information:");
        super.display();
    }

    public String[] toStringArray() {
        String[] all = new String[6+serviceCodes.size()];
        System.arraycopy(super.getAll(), 0, all, 0, 6);
        for (int i = 0; i < serviceCodes.size(); i++) {
            all[6+i] = serviceCodes.get(i);
        }
        return all;
    }
}