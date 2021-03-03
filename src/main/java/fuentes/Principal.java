/*
 * Ejemplo donde a través de la serie de fibonacci se podrá apreciar un problema
 *  de eficiencia o mejor de ineficiencia en el uso del procesador
 */
package fuentes;

import javax.swing.JOptionPane;

/**
 * @author AFV
 */
public class Principal {
    public Principal(){
        int n = Integer.parseInt(JOptionPane.showInputDialog(
                "Cuál término de la serie fe Fibonacci desea (n):"));
        double inicia = System.nanoTime();
        int fn = fiboIterativo(n);
        double termina = System.nanoTime();
        JOptionPane.showMessageDialog(null,"El termino solicitado es: "
                +fn+"\nTiempo: "+((termina-inicia)/1E9)+" segundos");
    }
    public static void main(String[] args) {
        new Principal();
    }

    private int fibonacci(int n) {
        if(n<=1){
            return n;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    
    private int fiboIterativo(int n){
        if(n>1){
            int fibo[] = new int[n+1];
            fibo[0]=0;
            fibo[1]=1;
            for(int i=2; i<=n; i++){
                fibo[i] = fibo[i-1]+fibo[i-2];
            }
            return fibo[n];
        } else {
            return n;
        }
    }
}
