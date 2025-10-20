public class Concatenacao {
    public static void main(String[] args) {
        int y = 5;

        // Aqui o + é usado para concatenar strings
        System.out.println("y + 2 = " + y + 2);

        // Aqui o + dentro dos parênteses faz a soma primeiro
        System.out.println("y + 2 = " + (y + 2));
    }
}
/*Confundir o operador + utilizado para concatenação de strings com o operador + utilizado para adição
pode levar a resultados estranhos.
Por exemplo, suponha que a variável inteira y tem o valor 5, a expressão
"y + 2 = " + y + 2
resulta na string "y + 2 = 52", não em "y + 2 = 7",
porque o primeiro valor de y é concatenado com o string "y + 2 = ",
então o valor 2 é concatenado com o string novo e maior "y + 2 = 5".
A expressão "y + 2 = " + (y + 2) produz o resultado desejado.*/