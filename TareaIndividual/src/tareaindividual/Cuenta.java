/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaindividual;

/**
 *
 * @author cfco5
 */
public class Cuenta {
    private String nombre; // variable de instancia
    
// método para establecer el nombre en el objeto
    public void establecerNombre(String nombre){
    this.nombre = nombre; // almacenar el nombre
    }
// método para obtener el nombre del objeto
    public String obtenerNombre(){
        return nombre; // devuelve el valor de nombre a quien lo invocó
    }
}
