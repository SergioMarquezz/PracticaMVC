/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


public class ModelEdad {

    int año = 0;
    int edad = 0;
    String mensaje = "";
    
    public int getEdad(){
        
        return edad;
    }
    
    public String getMensaje(){
        
        return mensaje;
    }
    
    public int getAño(){
        
        return año;
    }
    
    public void setEdad(int edad){
        
        this.edad = edad;
    }
    public void setCal(String mensaje){
        
        this.mensaje = mensaje;
    }
    public void setAño(int año){
        
        this.año = año;
    }
    public void calcularEdad(){
        
        edad = 2017 - año;
            if(edad>=18){
                
                mensaje = "Es mayor de edad";            
            }
            else
                
                mensaje = "Es menor de edad";            
    }
    
}
