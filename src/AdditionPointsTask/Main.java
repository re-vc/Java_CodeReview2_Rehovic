package AdditionPointsTask;

public class Main {
    public static void main(String[] args) {

        IntervalWorkout intervalWorkout = new IntervalWorkout(
                "Push-ups",
                "Squats",
                "Planks",
                4,
                30);

        intervalWorkout.startMSG();
        for (int i = 1; i < intervalWorkout.rep; i++){
            intervalWorkout.printingReportRep();
            intervalWorkout.counter++;
        }
        intervalWorkout.printingReportLastRep();
        intervalWorkout.endMSG();
    }
}