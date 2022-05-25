import java.util.ArrayList;

public class ControlUnit {
    // Maximum treshold value of processor load
    int p;
    // Amount of possible queries
    int z;
    // Minimum treshold value of processor load
    int r;
    // ArrayLists of processing units
    ArrayList<ArrayList<ProcessUnit>> lists;
    ArrayList<Processor> processors = new ArrayList<>();
    public ControlUnit(int p, int z, int r, ArrayList<ArrayList<ProcessUnit>> lists){

        this.p = p;
        this.z = z;
        this.r = r;
        this.lists = lists;
        for (int i = 0; i < lists.size(); i++) {
            processors.add(new Processor(i));
        }
    }
    public void mainLoop(){

    }

}
