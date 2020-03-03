import javax.swing.JOptionPane;

public class Calculadora{
    public static void main(final String[] args) {
    
        double a;
        double b;
        double aux;
        double result;

        aux =   Double.parseDouble((JOptionPane.showInputDialog(null, "Digite a operacao: \n 1 -Soma \n 2 -Subtracao \n 3- Multiplicacao \n 4- Divisao \n 0- Sair ")))  ;

        if (aux == 1){
        
            a = Double.parseDouble((JOptionPane.showInputDialog("Digite o primeiro numero")));
            b = Double.parseDouble((JOptionPane.showInputDialog("Digite o segundo numero ")));

            result = a+b;

            JOptionPane.showMessageDialog(null,"O resultado da soma"+result);
        }
        
        if(aux ==2){

            a = Double.parseDouble((JOptionPane.showInputDialog("Digite o primeiro numero")));
            b = Double.parseDouble((JOptionPane.showInputDialog("Digite o segundo numero")));

            result = a -b ;

            JOptionPane.showMessageDialog(null, "O resultado da subtracao " +result);

        }

        if (aux == 3){

            a = Double.parseDouble((JOptionPane.showInputDialog("Digite o primeiro numero")));
            b = Double.parseDouble((JOptionPane.showInputDialog("Digite o segundo numero")));

            result = a * b ;

            JOptionPane.showMessageDialog(null,"O resultado da multiplicacao" +result);
        }
        
        if (aux == 4){
           
            a = Double.parseDouble((JOptionPane.showInputDialog("Digite o primeiro numero")));
            b = Double.parseDouble((JOptionPane.showInputDialog("Digite o segundo numero")));


            result = a / b ;

            JOptionPane.showMessageDialog(null, "O resultado da divisao" +result);
        }
    }   
}