import javax.swing.JOptionPane;

public class Comparison {
    public static void main(String agrs [])
    {
        String firstNumber, secundNumber, result;
        int number1, number2;
        firstNumber = JOptionPane.showInputDialog("Enter first integer");
        secundNumber = JOptionPane.showInputDialog("Enter second integer");
        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secundNumber);
        result = "";

        if(number1 == number2)
            result = result + number1 +"=="+number2;
        if(number1 != number2)
            result = result + number1 +"!="+number2;
        if(number1 < number2)
            result = result + "\n" + number1 +"<"+number2;
        if(number1 > number2)
            result = result + "\n" + number1 +">"+number2;
        if(number1 < number2)
            result = result + "\n" + number1 +"<="+number2;
        if(number1 > number2)
            result = result + "\n" + number1 +">="+number2;
        JOptionPane.showMessageDialog(null, result, "Comparison results",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
