package Logic;

import java.util.ArrayList;
import java.util.List;

public class Output_Layer 
{
    double[] inputs = {1, 2, 3, 2.5};

    double[] weights1 = {0.2, 0.8, -0.5, 1.0};
    double[] weights2 = {0.5, -0.91, 0.26, -0.5};
    double[] weights3 = {-0.26, -0.27, 0.17, 0.87};

    double bias1 = 2;
    double bias2 = 3;
    double bias3 = 0.5;

    List<Double> output = new ArrayList<>();

    public List<Double> FirstCalcInputToOutput(){
        
        output.add(inputs[0]*weights1[0] + inputs[1]*weights1[1] + inputs[2]*weights1[2] + inputs[3]*weights1[3] + bias1);
        output.add(inputs[0]*weights2[0] + inputs[1]*weights2[1] + inputs[2]*weights2[2] + inputs[3]*weights2[3] + bias2);
        output.add(inputs[0]*weights3[0] + inputs[1]*weights3[1] + inputs[2]*weights3[2] + inputs[3]*weights3[3] + bias3); 

        return output;
    }
    public static void main(String[] args) {

        Output_Layer OL = new Output_Layer();

        System.out.println(OL.FirstCalcInputToOutput());
    }
}