class ProjectTest{
    public static void main(String[] args){
        Project name = new Project();
        Project nameAndDescription = new Project();

        name.setName("Joel", "Okoh");
        String myName = name.getName();

        nameAndDescription.setElevatorPitch(myName, "A tall black guy.");
        String myND = nameAndDescription.getElevatorPitch();

        System.out.println(myName);

    }
}