import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // objects
        Exercise PushUps = new Exercise(
                "Push-ups",
                "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to the starting position.",
                30,
                "Floor");
        Exercise Planks = new Exercise(
                "Planks",
                "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.",
                90,
                "Floor");
        Exercise BackwardKick = new Exercise(
                "Backward Kick",
                "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.",
                60,
                "Floor");
        Exercise Squats = new Exercise(
                "Squats",
                "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.",
                45,
                "Standing");
        Exercise LegCurl = new Exercise(
                "Leg Curl",
                "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.",
                90,
                "Standing");
        Exercise SidewardsBackStretch = new Exercise(
                "Sidewards Back Stretch",
                "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.",
                60,
                "Standing");

        // array
        ArrayList<Exercise> exercisesList = new ArrayList<>();
        exercisesList.add(PushUps);
        exercisesList.add(Planks);
        exercisesList.add(BackwardKick);
        exercisesList.add(Squats);
        exercisesList.add(LegCurl);
        exercisesList.add(SidewardsBackStretch);

        // loop + print method
        for (int i = 0; i < exercisesList.size(); i++){
            exercisesList.get(i).printFormat();
            System.out.println();
        }

        // new loop
        for (int i = 0; i < exercisesList.size(); i++){

        }


    }
}
