package distributed.core;

public class WorkerNode {
    public void executeTask(String task) {
        try {
            System.out.println("Executing task: " + task);
            // Simulate a chance of task failure
            if (Math.random() < 0.2) {
                throw new RuntimeException("Simulated task failure.");
            }
        } catch (RuntimeException e) {
            System.out.println("Task execution failed for: " + task);
            // In a real scenario, notify the master node for reassignment
        }
    }

    public void receiveMessage(String task) {
        System.out.println("Received task: " + task);
        executeTask(task);
    }
}
