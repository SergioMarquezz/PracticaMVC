/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package controllers;

import views.ViewOperaciones;
import models.ModelOperaciones;


public class ControllerOperaciones {
    
    ViewOperaciones view_operaciones;
    ModelOperaciones model_operaciones;
    String mensaje;
    
    public ControllerOperaciones(ModelOperaciones model_operaciones,ViewOperaciones view_operaciones){
        
        this.model_operaciones = model_operaciones;
        this.view_operaciones = view_operaciones;
        
        initView();
        
        view_operaciones.jbtn_suma.addActionListener(e -> this.jbtnSumar());
        view_operaciones.jbtn_resta.addActionListener(e -> this.jbtnResta());
        view_operaciones.jbtn_division.addActionListener(e -> this.jbtnDividir());
        view_operaciones.jbtn_modulo.addActionListener(e -> this.jbtnModulo());
        view_operaciones.jbtn_multiplicacion.addActionListener(e -> this.jbtnMutiplicar());
    }
    
    public void initView(){
        
        view_operaciones.jtf_numero1.setText(String.valueOf(model_operaciones.getNumero1()));
        view_operaciones.jtf_numero2.setText(String.valueOf(model_operaciones.getNumero2()));
    }
    
    public void jbtnSumar(){
        
        model_operaciones.setNumero1(Integer.parseInt(view_operaciones.jtf_numero1.getText()));
        model_operaciones.setNumero2(Integer.parseInt(view_operaciones.jtf_numero2.getText()));
        
        model_operaciones.suma();
        
        mensaje = "La suma es: " + String.valueOf(model_operaciones.getResultado());
        view_operaciones.jl_resultadoo.setText(mensaje);
        
    }
    
    public void jbtnResta(){
        
        model_operaciones.setNumero1(Integer.parseInt(view_operaciones.jtf_numero1.getText()));
        model_operaciones.setNumero2(Integer.parseInt(view_operaciones.jtf_numero2.getText()));
        
        model_operaciones.resta();
        
        mensaje = "La resta es: " + String.valueOf(model_operaciones.getResultado());
        view_operaciones.jl_resultadoo.setText(mensaje);
    }
    
    public void jbtnMutiplicar(){
        
        model_operaciones.setNumero1(Integer.parseInt(view_operaciones.jtf_numero1.getText()));
        model_operaciones.setNumero2(Integer.parseInt(view_operaciones.jtf_numero2.getText()));
        
        model_operaciones.multiplicar();
        
        mensaje = "La multiplicacion es: " + String.valueOf(model_operaciones.getResultado());
        view_operaciones.jl_resultadoo.setText(mensaje);
    }
    
    public void jbtnDividir(){
        
        model_operaciones.setNumero1(Integer.parseInt(view_operaciones.jtf_numero1.getText()));
        model_operaciones.setNumero2(Integer.parseInt(view_operaciones.jtf_numero2.getText()));
        
        model_operaciones.division();
        
        mensaje = "La division es: " + String.valueOf(model_operaciones.getResultado());
        view_operaciones.jl_resultadoo.setText(mensaje);
    }
    
    public void jbtnModulo(){
        
        model_operaciones.setNumero1(Integer.parseInt(view_operaciones.jtf_numero1.getText()));
        model_operaciones.setNumero2(Integer.parseInt(view_operaciones.jtf_numero2.getText()));
        
        model_operaciones.modulo();
        
        mensaje = "El modulo es: " + String.valueOf(model_operaciones.getResultado());
        view_operaciones.jl_resultadoo.setText(mensaje);
    }
}
