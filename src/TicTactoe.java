import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    private JButton[][] botoes = new JButton[3][3];
    private boolean vezDoX = true;

    public TicTacToe() {
        super("Jogo da Velha - Tic Tac Toe");

        setLayout(new GridLayout(3, 3)); // 3x3 botões

        // Cria os 9 botões e adiciona à janela
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botoes[i][j] = new JButton("");
                botoes[i][j].setFont(new Font("Arial", Font.BOLD, 60));
                botoes[i][j].addActionListener(this);
                add(botoes[i][j]);
            }
        }

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centraliza a janela
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botao = (JButton) e.getSource();

        if (botao.getText().equals("")) {
            botao.setText(vezDoX ? "X" : "O");
            vezDoX = !vezDoX;
            verificarVencedor();
        }
    }

    private void verificarVencedor() {
        String vencedor = null;

        // Verifica linhas e colunas
        for (int i = 0; i < 3; i++) {
            if (!botoes[i][0].getText().equals("") &&
                    botoes[i][0].getText().equals(botoes[i][1].getText()) &&
                    botoes[i][0].getText().equals(botoes[i][2].getText())) {
                vencedor = botoes[i][0].getText();
            }
            if (!botoes[0][i].getText().equals("") &&
                    botoes[0][i].getText().equals(botoes[1][i].getText()) &&
                    botoes[0][i].getText().equals(botoes[2][i].getText())) {
                vencedor = botoes[0][i].getText();
            }
        }

        // Verifica diagonais
        if (!botoes[0][0].getText().equals("") &&
                botoes[0][0].getText().equals(botoes[1][1].getText()) &&
                botoes[0][0].getText().equals(botoes[2][2].getText())) {
            vencedor = botoes[0][0].getText();
        }
        if (!botoes[0][2].getText().equals("") &&
                botoes[0][2].getText().equals(botoes[1][1].getText()) &&
                botoes[0][2].getText().equals(botoes[2][0].getText())) {
            vencedor = botoes[0][2].getText();
        }

        // Se alguém venceu
        if (vencedor != null) {
            JOptionPane.showMessageDialog(this, "Jogador " + vencedor + " venceu!");
            limparTabuleiro();
        } else if (tabuleiroCheio()) {
            JOptionPane.showMessageDialog(this, "Empate!");
            limparTabuleiro();
        }
    }

    private boolean tabuleiroCheio() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (botoes[i][j].getText().equals("")) return false;
            }
        }
        return true;
    }

    private void limparTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botoes[i][j].setText("");
            }
        }
        vezDoX = true;
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
