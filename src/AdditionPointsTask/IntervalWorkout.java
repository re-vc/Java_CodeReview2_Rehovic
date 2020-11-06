package AdditionPointsTask;

public class IntervalWorkout {

    public String ex1;
    public String ex2;
    public String ex3;
    public int rep;
    public int breaktime;

    public int counter;

    // constructor
    public IntervalWorkout(String ex1, String ex2, String ex3, int rep, int breaktime){
        this.ex1 = ex1;
        this.ex2 = ex2;
        this.ex3 = ex3;
        this.rep = rep;
        this.breaktime = breaktime;
        this.counter = 1;
    }

    @Override
    public String toString() {
        return "IntervalWorkout{" +
                "ex1='" + ex1 + '\'' +
                ", ex2='" + ex2 + '\'' +
                ", ex3='" + ex3 + '\'' +
                ", rep=" + rep +
                ", breaktime=" + breaktime +
                '}';
    }

    // method
    public void startMSG(){
        System.out.println("*****************************");
        System.out.println("Interval Workout STARTS !!!!");
        System.out.println("*****************************");
    }
    public void endMSG(){
        System.out.println("*****************************");
        System.out.println("CONGRATS - YOU ARE DONE !!!");
        System.out.println("*****************************");
    }
    public void printingReportRep(){
        System.out.println("=============================");
        System.out.println("ROUND " + counter + ":");
        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);
        System.out.println("=============================");
        System.out.println("DO THE BREAK" + " ( " + breaktime + " SECONDS )");
    }
    public void printingReportLastRep(){
        System.out.println("=============================");
        System.out.println("ROUND " + counter + ":");
        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);
        System.out.println();
    }

}