package main.java.org.corejava.hashMap;

public class Loan {
    private String name;
    private String status;

    public Loan(String name, String status){
        this.name = name;
        this.status = status;

    }
    public String getName(){
        return name;
    }

    public String getStatus(){
        return status;
    }

   @Override
   public String toString(){
        return "Loan{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
