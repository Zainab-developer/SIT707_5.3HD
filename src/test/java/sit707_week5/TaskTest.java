package sit707_week5;

import org.junit.Test;

import sit707_week5.Task;
import sit707_week5.TaskDetail;
import sit707_week5.TaskSubmit;
import sit707_week5.TaskView;
import sit707_week5.TutorCommunication;
import sit707_week5.TutorFeedback;

import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TaskTest {
    @Test
    public void testViewTaskInbox() {
        TaskView taskView = new TaskView();
        List<Task> tasks = taskView.viewTaskInbox(123);
        assertNotNull(tasks);
        assertEquals(2, tasks.size());
    }

    @Test
    public void testViewTaskDetail() {
        TaskView taskView = new TaskView();
        TaskDetail taskDetail = taskView.viewTaskDetail(1);
        assertNotNull(taskDetail);
        assertEquals(1, taskDetail.getTaskId());
        assertEquals("Sample feedback", taskDetail.getFeedback());
        assertEquals(2, taskDetail.getChatMessages().size());
    }

    @Test
    public void testSubmitTask() {
        TaskSubmit taskSubmit = new TaskSubmit();
        Task task = new Task(3, "Task 3", "Description of Task 3");
        boolean submitted = taskSubmit.submitTask(task);
        assertEquals(true, submitted);
    }

    @Test
    public void testProvideFeedback() {
        TutorFeedback tutorFeedback = new TutorFeedback();
        boolean feedbackProvided = tutorFeedback.provideFeedback(1, "Good job!");
        assertEquals(true, feedbackProvided);
    }

    @Test
    public void testSendMessage() {
        TutorCommunication tutorCommunication = new TutorCommunication();
        boolean messageSent = tutorCommunication.sendMessage(1, "Please review my task.");
        assertEquals(true, messageSent);
    }
}