import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Number of processors
        int N = 80;
        // Maximum treshold value of processor load
        int p = 80;
        // Amount of possible queries
        int z = 5;
        // Minimum treshold value of processor load
        int r = 15;
        Generator generator = new Generator();
        ArrayList<ArrayList<ProcessUnit>> arl = generator.generateProcessStream(N);
        ControlUnit controlUnit1 = new ControlUnit(p, z, r, (ArrayList<ArrayList<ProcessUnit>>) arl.clone());
        ControlUnit controlUnit2 = new ControlUnit(p, z, r, (ArrayList<ArrayList<ProcessUnit>>) arl.clone());
        ControlUnit controlUnit3 = new ControlUnit(p, z, r, (ArrayList<ArrayList<ProcessUnit>>) arl.clone());




    }
}
