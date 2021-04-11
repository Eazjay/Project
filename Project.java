
class Project{
    private String name;
    private String desc;

    public void setName(String firstName, String lastName){
        this.name = firstName + " " + lastName;
    }
    public String getName(){
        return name;
    }
    public void setElevatorPitch(String name, String description){
        this.name = name;
        this.desc = description;
    }
    public String getElevatorPitch(){
        return name + ": " + desc;
    }
}