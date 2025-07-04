// interface QueueBehaviour {
//     void takeInQueue(String person);
//     void releaseFromQueue();
//     void queueUpdate();
// }
public interface QueueBehaviour {
    void takeInQueue(String person);
    void releaseNextFromQueue();
}
