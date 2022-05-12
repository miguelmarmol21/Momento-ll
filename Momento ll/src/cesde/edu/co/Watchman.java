package cesde.edu.co;

public class Watchman extends Person{
    private String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday;
    }

    private String workday;

    public String mostrarWatchman()
    {
        return this.getIdentification() +" "+this.getName()+" "+ this.getAge();
    }
}
