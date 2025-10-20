//Progama de adicao
// Pacotes de extessao java
import javax.swing.JOptionPane;

public class Addition {
    //metodo que incia o aplicativo
    public static void main(String args [])
    {
        String firstNumber, //primeiro numero
        secundNumber; // segundo numero
        int number1; //primeiro numero a somar
        int number2; //segundo numero a somar
        int sum; //soma dos numeros

        //ler o primeiro numero com string
    firstNumber = JOptionPane.showInputDialog("Enter first integer");
    // ler o segundo numero com string
    secundNumber = JOptionPane.showInputDialog("Enter second integer");
    //converter os numeros em inteiros
    number1 = Integer.parseInt(firstNumber);
    number2 = Integer.parseInt(secundNumber);
    //adicionar os numeros
    sum = number1 + number2;
    //exibir o resultado
    JOptionPane.showMessageDialog(
            null, "The sum is " + sum ,"Results",
            //JOptionPane.PLAIN_MESSAGE); //sem icone
            //JOptionPane.INFORMATION_MESSAGE); // i icone
            //JOptionPane.QUESTION_MESSAGE); //? icone
            JOptionPane.ERROR_MESSAGE); //! icone
    System.exit(0
    );//terminar o programa

    }

}


//OBS: A VIRGULA DECLARA DUAS VARIAVEIS NA MESMA LINHA
//OBS: O PONTO E VIRGULA FINALIZA UMA INSTRUCAO