import java.util.List;

public class priorityScheduling implements Ischeduler{
    private List<Process> processes;

    public void setProcesses(List<Process> processes) {
        this.processes = processes;
    }
    @Override
    public void schedule() {
        // Sort the processes based on priority (lower priority value = higher priority)
        processes.sort((p1, p2) -> (int) (p1.getArrivalTime() - p2.getArrivalTime()));
        double priority=Integer.MAX_VALUE;
        double totalwaitingtime=0;
        double turnaroundtime=0;
        for (Process process : processes)
        {
            if (priority <process.getPriority())
            {

            }
        }



    }
}
