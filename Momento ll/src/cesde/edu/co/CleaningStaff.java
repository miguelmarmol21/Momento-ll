package cesde.edu.co;

public class CleaningStaff extends Person{
    public String getDayOff() {
        return dayOff;
    }

    public void setDayOff(String dayOff) {
        this.dayOff = dayOff;
    }

    private String dayOff;
    public String mostrarCleaningstaff()
    {
        return this.getIdentification() +" "+ this.getName() +" "+ this.getAge() +  this.getDayOff();
    }
}
