/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import views.ViewMayor;
import models.ModelMayor;


public class ControllerMayor {
    
    ViewMayor view_mayor;
    ModelMayor model_mayor;
    String mensaje;
    
    public ControllerMayor(ModelMayor model_mayor,ViewMayor view_mayor){
        
        this.model_mayor = model_mayor;
        this.view_mayor = view_mayor;
        
        initView();
        
        view_mayor.jbtn_calcular.addActionListener(e -> this.jbtnCalcularNumero());
    }
    
    public void initView(){
        
        view_mayor.jtf_numero1.setText(String.valueOf(model_mayor.getNumero1()));
        view_mayor.jtf_numero2.setText(String.valueOf(model_mayor.getNumero2()));
        view_mayor.jtf_numero3.setText(String.valueOf(model_mayor.getNumero3()));
    }
    
    public void jbtnCalcularNumero(){
        
        model_mayor.setNumero1(Integer.parseInt(view_mayor.jtf_numero1.getText()));
        model_mayor.setNumero2(Integer.parseInt(view_mayor.jtf_numero2.getText()));
        model_mayor.setNumero3(Integer.parseInt(view_mayor.jtf_numero3.getText()));
        
        model_mayor.calcularMayor();
        
        mensaje = "El número mayor es " + String.valueOf(model_mayor.getMayor());
        view_mayor.jl_mayor.setText(mensaje);
        
        model_mayor.caclularMenor();
        
        mensaje = "El número menor es " + String.valueOf(model_mayor.getMenor());
        view_mayor.jl_menor.setText(mensaje);
    }
}
