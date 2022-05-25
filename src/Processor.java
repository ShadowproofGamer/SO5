import java.util.ArrayList;

public class Processor {
    int idNumber;
    ArrayList<ProcessUnit> currentProcesses = new ArrayList<>();
    int usage = 0;

    public Processor(int idNumber) {

        this.idNumber = idNumber;
        usage=0;
    }


    public int getUsage() {
        return usage;
    }
    public void update(int time){
        for (ProcessUnit pr :
                currentProcesses) {
            pr.timeNeeded--;
            if (pr.timeNeeded<=0)currentProcesses.remove(pr);
        }
        for (ProcessUnit pr :
                currentProcesses) {
            usage+=pr.powerDemand;
        }
    }
}
