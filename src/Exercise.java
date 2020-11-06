public class Exercise {

    public String name;
    public String description;
    public int duration;
    public String position;

    // constructor
    public Exercise(String name, String description, int duration, String position){

        this.name = name;
        this.description = description;
        this.duration = duration;
        this.position = position;

    }

    @Override
    public String toString() {
        return "Exercise{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", position='" + position + '\'' +
                '}';
    }
    public void printFormat(){
        System.out.println(name + "          DURATION: " + duration + " seconds.");
        System.out.println("--------------------------------------------------");
        System.out.println("DESCRIPTION: " + description);
        System.out.println("POSITION : " + position);
    }
}
