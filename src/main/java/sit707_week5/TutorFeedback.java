package sit707_week5;

public class TutorFeedback {
    public boolean provideFeedback(int taskId, String feedback) {
        System.out.println("Feedback provided for Task " + taskId + ": " + feedback);
        return true;
    }
}