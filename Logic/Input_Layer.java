package Logic;

public class Input_Layer {
    double[] inputs = {1, 2, 3};
    double[] weights = {0.2, 0.8, -0.5};
    double bias = 2;

    public double FirstCalcInputToOutput(){
        double output = inputs[0]*weights[0] + inputs[1]*weights[1] + inputs[2]*weights[2] + bias; 
        return output;
    }
    public static void main(String[] args) {

        Input_Layer IL = new Input_Layer();

        System.out.println(IL.FirstCalcInputToOutput());
    }

}
