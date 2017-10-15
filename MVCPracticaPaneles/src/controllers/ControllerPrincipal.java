/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import views.*;
import models.*;


public final class ControllerPrincipal {
    
    ViewPrincipal view_principal;
    ViewNotas view_notas;
    ViewEdad view_edad;
    ViewMayor view_mayor;
    ViewOperaciones view_operaciones;
    ViewOrdenar view_ordenar;
    ModelPrincipal model_principal;
    
    
    public ControllerPrincipal(ModelPrincipal model_principal,Object views[]){
        
        this.model_principal = model_principal;
        this.view_notas = (ViewNotas) views[2];
        this.view_edad = (ViewEdad) views[0];
        this.view_mayor = (ViewMayor) views[1];
        this.view_operaciones = (ViewOperaciones) views[3];
        this.view_ordenar = (ViewOrdenar) views[4];
        this.view_principal = (ViewPrincipal) views[5];
        
        initView();
        
        view_principal.jm_item_notas.addActionListener(e -> this.frameBlockNotas());
        view_principal.jm_item_edad.addActionListener(e -> this.frameEdad());
        view_principal.jm_item_mayor.addActionListener(e -> this.frameMayor());
        view_principal.jm_item_operaciones.addActionListener(e -> this.frameOperaciones());
        view_principal.jm_item_ordenar.addActionListener(e -> this.frameOrdenar());
        
    }
    
    public void initView(){
        
        view_principal.setVisible(true);
        view_edad.setVisible(true);
        view_principal.jdesktop_principal.setBackground(java.awt.Color.LIGHT_GRAY);
        view_principal.setLocationRelativeTo(null);
        view_principal.setTitle("Practica Paneles");
        view_principal.setSize(800, 600);
       
       
    }
    
    public void frameBlockNotas(){
        
        view_principal.setContentPane(view_notas);
        view_principal.revalidate();
        view_principal.repaint();
        
    }
    
    public void frameEdad(){
        
        view_principal.setContentPane(view_edad);
        view_principal.revalidate();
        view_principal.repaint();
        
    }
    
    public void frameMayor(){
        
        view_principal.setContentPane(view_mayor);
        view_principal.revalidate();
        view_principal.repaint();
    }
    
    public void frameOperaciones(){
        
        view_principal.setContentPane(view_operaciones);
        view_principal.revalidate();
        view_principal.repaint();
    }
    
    public void frameOrdenar(){
        
        view_principal.setContentPane(view_ordenar);
        view_principal.revalidate();
        view_principal.repaint();
        
    }
    
    
}
