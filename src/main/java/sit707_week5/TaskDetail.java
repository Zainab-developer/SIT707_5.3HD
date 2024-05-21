package sit707_week5;

import java.util.ArrayList;
import java.util.List;

public class TaskDetail {
    private int taskId;
    private String feedback;
    private List<String> chatMessages;

    public TaskDetail(int taskId, String feedback, List<String> chatMessages) {
        this.taskId = taskId;
        this.feedback = feedback;
        this.chatMessages = chatMessages;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getFeedback() {
        return feedback;
    }

    public List<String> getChatMessages() {
        return chatMessages;
    }
}
