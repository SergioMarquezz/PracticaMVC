/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;



public class ModelMayor {

    int numero1 ;
    int numero2;
    int numero3;
    int mayor;
    int menor;
    
    
    public int getNumero1(){
        
        return numero1;
        
    }
    
    public int getNumero2(){
        
        return numero2;
    }
    
    public int getNumero3(){
        
        return numero3;
    }
    
    public int getMayor(){
        
        return mayor;
    }
    
    public int getMenor(){
        
        return menor;
    }
    
  
    
    public void setNumero1(int numero1){
        
        this.numero1 = numero1;
    }
    
    public void setNumero2(int numero2){
        
        this.numero2 = numero2;        
    }
    
    public void setNumero3(int numero3){
       
        this.numero3 = numero3;
    }
    
    public void setMayor(int mayor){
        
        this.mayor = mayor;
    }
    
    public void setMenor(int menor){
        
        this.menor = menor;
    }
    
   
    
    public void calcularMayor(){
        
        mayor = numero1;
        
        if(numero2 > mayor){
            
            mayor = numero2;
        }
        
        if(numero3 > mayor){
            
            mayor = numero3;
        }
    }
    
    public void caclularMenor(){
        
        menor = numero1;
        
        if(numero2 < menor){
            
            menor = numero2;
        }
        
        if(numero3 < menor){
            
            menor = numero3;
        }
    }
}
