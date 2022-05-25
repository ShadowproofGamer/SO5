public class ProcessUnit {
    int processId;
    int powerDemand;
    int arrivalTime;
    int timeNeeded;
    public ProcessUnit(int processId, int powerDemand, int arrivalTime, int timeNeeded){

        this.processId = processId;
        this.powerDemand = powerDemand;
        this.arrivalTime = arrivalTime;
        this.timeNeeded = timeNeeded;
    }
    public ProcessUnit(int powerDemand, int arrivalTime, int timeNeeded){
        this.processId = (powerDemand*1000000+arrivalTime*10000+timeNeeded);
        this.powerDemand = powerDemand;
        this.arrivalTime = arrivalTime;
        this.timeNeeded = timeNeeded;
    }
}
