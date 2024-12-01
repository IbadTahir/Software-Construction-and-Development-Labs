package Lab7;

public class TaskAssignment {
    public static void main(String[] args) {
        TaskQueue taskQueue = new TaskQueue();
        Worker worker1 = new Worker(taskQueue, "Worker-1");
        Worker worker2 = new Worker(taskQueue, "Worker-2");
        worker1.start(); 
        worker2.start();

        try {
            for (int i = 1; i <= 5; i++) {
                Task task = new Task("Task-" + i);
                taskQueue.addTask(task);
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        worker1.stopWorker(); 
        worker2.stopWorker(); 
    }
}