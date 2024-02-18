package distributed.core;

import java.util.ArrayList;
import java.util.List;
import distributed.core.NetworkSimulator; // Assuming you have a class to simulate network communication

public class MasterNode {
    private List<WorkerNode> workerNodes;
    private int taskId = 0;

    public MasterNode() {
        this.workerNodes = new ArrayList<>();
        // Initialize worker nodes
        for (int i = 0; i < 5; i++) {
            workerNodes.add(new WorkerNode());
        }
    }

    public void distributeTasks(String job) {
        System.out.println("Distributing job: " + job);
        // Example division of job into tasks
        for (int i = 0; i < 10; i++) {
            String task = "Task " + (taskId++) + " of " + job;
            assignTaskToWorker(task);
        }
    }

    private void assignTaskToWorker(String task) {
        WorkerNode worker = workerNodes.get(taskId % workerNodes.size());
        NetworkSimulator.sendMessage(worker, task); // Simulate sending the task
    }
}
