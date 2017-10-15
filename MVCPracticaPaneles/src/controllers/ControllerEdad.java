/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import models.ModelEdad;
import views.ViewEdad;

public class ControllerEdad {

    ViewEdad view_edad;
    ModelEdad model_edad;
    String mensaje = "";
    
    public ControllerEdad(ModelEdad model_edad,ViewEdad view_edad){
     
        this.model_edad = model_edad;
        this.view_edad = view_edad;
        
        initView();
        
        view_edad.jbtn_calcular.addActionListener(e ->this.jbtnCalcularEdad());
    }
    
    public void initView(){
        
        view_edad.jtf_año.setText(String.valueOf(model_edad.getAño()));
    }
    
    public void jbtnCalcularEdad(){
        
        model_edad.setAño(Integer.parseInt(view_edad.jtf_año.getText()));
        model_edad.calcularEdad();
        view_edad.jl_edadd.setText(String.valueOf(model_edad.getMensaje()));
        
        mensaje = "Usted tiene " + String.valueOf(model_edad.getEdad()) + " años";
        view_edad.jl_edad.setText(mensaje);
    }
}
