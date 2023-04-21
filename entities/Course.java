
package session05_Map.entities;


public class Course {
    private String code;
    private String name;
    private double fee;

    public Course() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
    @Override
    public String toString(){
        return getCode() + "\t\t"+
                getName() + "\t\t"+
                getFee();
    }
}
