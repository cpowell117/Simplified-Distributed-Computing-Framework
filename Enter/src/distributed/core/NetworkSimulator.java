package distributed.core;

public class NetworkSimulator {
    public static void sendMessage(WorkerNode worker, String message) {
        worker.receiveMessage(message); // Directly call receiveMessage for simulation
    }
}
