package Management_package;

 class employee {
    private String name;
    private int nid;
    private double salary;


    // EMPLOYER NAME METHODS 
    protected void setEmployerName(String name){
        this.name = name;
    }
    protected String getEmployerName(){
        return this.name;
    }

    // EMPLOYER ID METHODS 
    protected void setnid(int nid){
        this.nid = nid;
    }
    protected int getnid(){
        return this.nid;
    }

    // EMPLOYER SALARY METHODDS 
    protected void setEmployerSalary(double salary){
        this.salary = salary;
    }
    protected double getEmployerSalaray(){
        return this.salary;
    }

}
