package cesde.edu.co;

public class Admin extends Person{
    private String leader;

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

    private String parking;
    public String mostrarAdmin()
    {
        return this.getIdentification() +" "+ this.getName() +" "+ this.getAge() +" "+  this.getLeader()+ this.getParking();
    }
}
