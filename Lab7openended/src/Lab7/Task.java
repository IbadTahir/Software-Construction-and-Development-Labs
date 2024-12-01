package Lab7;

import java.util.LinkedList;
import java.util.Queue;

class Task {
    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }
}

class TaskQueue {
    private final Queue<Task> taskQueue = new LinkedList<>();
    public synchronized void addTask(Task task) {
        taskQueue.add(task);
        System.out.println("New task added: " + task.getTaskName());
        notifyAll(); 
    }

    public Task fetchTask() {
        synchronized (this) {
            while (taskQueue.isEmpty()) {
                try {
                    System.out.println(Thread.currentThread().getName() + " is waiting for tasks...");
                    wait(); 
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " was interrupted.");
                    return null;
                }
            }
            return taskQueue.poll();
        }
    }
}