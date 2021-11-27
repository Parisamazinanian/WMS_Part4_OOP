package main.java.data;

import java.util.List;

public class User {
    protected String name= "Anonymous";
    private boolean isAuthenticated=false;

    //constructor
    public User(String userName){
        this.name=userName;
    }


    public boolean authenticate(String password){
        return false;
    }

    public String getName() {
        return name;
    }

    public boolean isNamed(String name){
        if(name.equals(this.name)) {
            return true;
        }else{
            return false;
        }
    }

    private void greet(){
        System.out.println("Hello, "+ this.name +"!\n"+
                "Welcome to our Warehouse Database.\n If you don't find what you are looking for," +
                "\nplease ask one of our staff members to assist you.");

    }

    public void bye(List<String> actions){
        System.out.println("Thank you for your visit, "+this.name+" !");

    }
}
