import javax.swing.JOptionPane;

public class Calculadora{

    public static void main(String[] args) {
    
        int a;
        int b;
        int num;

        a = Integer.parseInt((JOptionPane.showInputDialog("Digite o primeiro numero")));
        b =Integer.parseInt((JOptionPane.showInputDialog("Digite o segundo numero ")));

        num = a-b;

        JOptionPane.showMessageDialog(null,"O resultado"+num);

    }
}