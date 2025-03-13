package model;

import java.util.Date;
import java.util.Set;

public class Boom {
    private Integer id;
    private String uuid;
    private String name;
    private Integer position;
    private Float Salary;
    // set info
    public void setBookInfo(Integer id, String bUuid, String bname,
                            Integer bposition, Float bSalary) {
        this.id = id;// using this keyword to identify, it's the class's
        this.uuid = bUuid;
        this.name = bname;
        this.position = bposition;
        this.Salary = bSalary;
    }
    public void getBookInfo(){
        System.out.print("Book ID: "  + this.id);
        System.out.print("Book uuid: " + this.uuid);
        System.out.print("Book Name: " + this.name);
        System.out.print("Book position: " + this.position);
        System.out.print("Book Salary: " + this.Salary);

    }

    @Override
    public String toString() {
        return "Boom{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", Salary=" + Salary +
                ", '}'";
    }
}
