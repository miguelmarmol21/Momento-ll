package cesde.edu.co;

public class Accountant extends Person{
    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    private String leader;
    private String parking;
    public String mostrarAccuntant()
    {
        return this.getIdentification() +" "+ this.getName()+" "+ this.getAge() +" "+  this.getLeader()+  this.getParking();
    }
}
