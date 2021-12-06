package main.java.data;

import java.util.ArrayList;
import java.util.List;

public class Employee extends User{
    private String password;
    private List<Employee> headOf = new ArrayList<Employee>();
    //constructor
    public Employee(String userName) {
        super(userName);

    }
    public Employee(String userName, String password, List<Employee> headOf) {
        super(userName);
        this.password = password;
        this.headOf = headOf;
    }

    @Override
    public boolean authenticate(String password){
        if(password.equals(this.password)){
            return true;
        }else {
            return false;
        }
    }

    public String getPassword() {
        return password;
    }

    private void order(String item, int amount){
        System.out.println("The "+item+ " with the amount: "+amount+" has been ordered");

    }
@Override
    public void greet(){
        System.out.println("Hello,"+ super.name+"\n If you experience a problem with the system,\n" +
                "please contact technical support.");

    }
@Override
    public void bye(List<String> actions){
        super.bye(actions);
    System.out.println(actions);

    }
}
