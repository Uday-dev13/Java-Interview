package Oops.Encapsulation;

 class Employee{
    private String name;
    private int number;
    private String department;
    private int salary;

    //Getter
     public String getName(){
         return name;
     }

    //Setter
    public void setName(String name){
         this.name = name;
    }

    public int getNumber(){
         return number;
    }
    public void setNumber(int number){
         this.number=number;
    }

     public String getDepartment() {
         return department;
     }

     public void setDepartment(String department) {
         this.department = department;
     }

     public int getSalary() {
         return salary;
     }

     public void setSalary(int salary) {
         this.salary = salary;
     }
 }
