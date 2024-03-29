import java.util.Scanner;

public class MobieDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int timeToFilm = Integer.parseInt(scan.nextLine());
        int scenes = Integer.parseInt(scan.nextLine());
        int timePerScene = Integer.parseInt(scan.nextLine());

        double scenePreparation = timeToFilm * 0.15;
        int timeForScenes = scenes * timePerScene;

        double totalTimeForFilming = scenePreparation + timeForScenes;

        if (totalTimeForFilming < timeToFilm) {
            System.out.println(String.format("You managed to finish the movie on time! You have %d minutes left!",
                    Math.round(timeToFilm - totalTimeForFilming)));
        } else {
            System.out.println(String.format("Time is up! To complete the movie you need %d minutes.",
                    Math.round(totalTimeForFilming - timeToFilm)));
        }
    }
}
