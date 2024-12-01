package Lab7;

class Worker extends Thread {
    private final TaskQueue taskQueue;
    private volatile boolean isRunning = true;

    public Worker(TaskQueue taskQueue, String workerName) {
        super(workerName);
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        while (isRunning) {
            Task task = taskQueue.fetchTask();
            if (task != null) {
                processTask(task);
            }
        }
        System.out.println(Thread.currentThread().getName() + " has stopped.");
    }

    private void processTask(Task task) {
        System.out.println(Thread.currentThread().getName() + " is processing task: " + task.getTaskName());
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted during task processing.");
        }
        System.out.println(Thread.currentThread().getName() + " completed task: " + task.getTaskName());
    }

    public void stopWorker() {
        isRunning = false;
        interrupt(); 
    }
}
