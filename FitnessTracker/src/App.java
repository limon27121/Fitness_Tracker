import java.util.Scanner;

public class App {
    public Excercise exercise;
    public FavoritiesManager favoritesManager;
    public FitnessTracker fitnessTracker;
    public UserInteraction userInteraction;
    public WorkOutHistory workoutHistory;
    public WorkOutSession workoutSession;

    public App() {
        this.exercise = new Excercise();
        this.favoritesManager = new FavoritiesManager();
        this.fitnessTracker = new FitnessTracker();
        this.userInteraction = new UserInteraction();
        this.workoutHistory = new  WorkOutHistory();
        this.workoutSession = new WorkOutSession();
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 4) {
            displayMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    startNewWorkout();
                    break;
                case 2:
                    displayFavoriteWorkouts();
                    break;
                case 3:
                    displaySavedWorkouts();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();

    }

    public void displayMenu() {
        System.out.println("Fitness Tracker Menu");
        System.out.println("1. Start a new workout");
        System.out.println("2. Display your favorite workouts");
        System.out.println("3. Display your saved workouts");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    public void startNewWorkout() {
        // Logic for starting a new workout
        workoutSession.startNewWorkout();
        // You may need to interact with other classes here
    }

    public void displayFavoriteWorkouts() {
        // Logic for displaying favorite workouts
        favoritesManager.displayFavoriteWorkouts();
        // You may need to interact with other classes here
    }

    public void displaySavedWorkouts() {
        // Logic for displaying saved workouts
        workoutHistory.displaySavedWorkouts();
        // You may need to interact with other classes here
    }
}

