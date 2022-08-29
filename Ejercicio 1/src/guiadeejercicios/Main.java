/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiadeejercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author cfco5
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Ingrese su codigo ");
        Scanner sc = new Scanner (System.in);
        int codigo = sc.nextInt();
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.next();
        System.out.print("Ingrese su apellido: ");
        String apellido = sc.next();
        System.out.print("Ingrese su salario mensual: ");
        double salarioMensual = sc.nextDouble();
        double salarioDiario = salarioMensual/30;
        sc.close();
        
        JOptionPane.showMessageDialog(null, "Codigo: "+ codigo+"\nNombre: "+nombre+"\nApellido: "+apellido+"\nSalario Mensual: "+salarioMensual+"\nSalario Diario: "+salarioDiario);
        
        
    }
    
}
