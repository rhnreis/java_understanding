
// recebe dois interios e faz uma multiplicacao


import javax.swing.JOptionPane;

public class Tarefa {
    public static void main(String args[] )
    {
        String firstNumber, secundNumber, result;
        int number1, number2;
        firstNumber = JOptionPane.showInputDialog("Entre com o primeiro numero");
        secundNumber = JOptionPane.showInputDialog("Entre com o segundo numero");
        number1= Integer.parseInt(firstNumber);
        number2= Integer.parseInt(secundNumber);
        result = number1 * number2 + "";
        JOptionPane.showMessageDialog(null, "Resultado da multiplicacao = "  + result, "Resultado da multiplicacao" ,JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}
