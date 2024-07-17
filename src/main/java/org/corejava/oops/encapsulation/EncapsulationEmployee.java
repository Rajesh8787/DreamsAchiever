package main.java.org.corejava.oops.encapsulation;


class Employee{
    private int empId;
    private String empName;

    public int getEmpId(int empId){
        return empId;

    }

    public void setEmpId(int empId){
        this.empId = empId;
    }
    public String getEmpName(String empName)
    {
        return empName;
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }
}
public class EncapsulationEmployee {
   public static void main(String args[]){
       Employee obj = new Employee();
       obj.setEmpName("Beast Airways");
       obj.setEmpId(23);
   /*    System.out.println(obj.setEmpName);
       System.out.println(obj.setEmpId());*/
   }

}

