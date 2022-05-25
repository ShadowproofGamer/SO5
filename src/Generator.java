import java.util.ArrayList;
import java.util.Random;

public class Generator {
    Random random = new Random();
    int processAmount = 100000;
    //maximum time between new process call
    int maxAT = 90;
    //maximum time needed for new process to finish
    int maxTN = 70;
    // max power usage/demand
    int maxPowerUsage = 8;

    public Generator() {

    }

    public Generator(int processAmount, int maxTM, int maxTN, int maxPowerUsage) {

        this.processAmount = processAmount;
        this.maxAT = maxTM;
        this.maxTN = maxTN;
        this.maxPowerUsage = maxPowerUsage;
    }

    public ArrayList<ArrayList<ProcessUnit>> generateProcessStream(int N) {
        ArrayList<ArrayList<ProcessUnit>> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ArrayList<ProcessUnit> subList = new ArrayList<>();
            for (int j = 0; j < processAmount; j++) {
                subList.add(new ProcessUnit((processAmount+1)*i+j, random.nextInt(maxPowerUsage-1)+1, random.nextInt(maxAT-1)+1+subList.get(j-1).arrivalTime, random.nextInt(maxTN-1)+1));
            }
            result.add(subList);
        }
        return result;
    }
}
