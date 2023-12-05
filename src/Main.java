import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Process> processes = new ArrayList<>();
        System.out.print("Enter the number of processes: ");
        int numProcesses = scanner.nextInt();

        for (int i = 0; i < numProcesses; i++) {
            System.out.println("Enter details for Process " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Arrival Time: ");
            double arrivalTime = scanner.nextDouble();

            System.out.print("Burst Time: ");
            double burstTime = scanner.nextDouble();

            processes.add(new Process(name, arrivalTime, burstTime));
        }

        SJF sjfScheduler = new SJF();
        sjfScheduler.setProcesses(processes);

        System.out.println("Executing SJF Scheduling Algorithm:");
        sjfScheduler.schedule();

        scanner.close();
    }
}
