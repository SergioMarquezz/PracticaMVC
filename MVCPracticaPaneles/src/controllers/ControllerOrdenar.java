/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

//Practica

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultListModel;
import views.ViewOrdenar;
import models.ModelOrdenar;

public class ControllerOrdenar {
    
    ViewOrdenar view_ordenar;
    ModelOrdenar model_ordenar;
    DefaultListModel modelo_lista;
    
    List<Integer> lista = new ArrayList<Integer>();
    
    public ControllerOrdenar(ModelOrdenar model_ordenar,ViewOrdenar view_ordenar){
        
        this.model_ordenar = model_ordenar;
        this.view_ordenar  = view_ordenar;
        
        modelo_lista = new DefaultListModel();
        
        
         view_ordenar.jlist_numeros.setModel(modelo_lista);
        
        initView();
        
        view_ordenar.jbtn_agregar.addActionListener(e -> this.agregarValores());
        view_ordenar.jbtn_promedio.addActionListener(e -> this.promedio());
        view_ordenar.jbtn_ascendente.addActionListener(e -> this.ordenarAscendente());
      
       
    }
    
    public void initView(){
        
        view_ordenar.jtf_numero.setText(String.valueOf(model_ordenar.getNumeros()));
        
    }
        
    public void agregarValores(){
        
        modelo_lista.addElement(view_ordenar.jtf_numero.getText());
        int anadir = Integer.parseInt(view_ordenar.jtf_numero.getText());
        view_ordenar.jtf_numero.setText("");
        
        lista.add(anadir);
        
       
    }
    
    public void promedio(){
        
        int suma = 0;
        int promedio = 0;
        int resultado = 0;
        
        for(int i=0; i< view_ordenar.jlist_numeros.getModel().getSize(); i++){
            
            String cadena = view_ordenar.jlist_numeros.getModel().getElementAt(i);
            promedio = Integer.parseInt(cadena);
            suma += promedio; 
        }
        
        resultado = suma / view_ordenar.jlist_numeros.getModel().getSize();
        view_ordenar.jl_promedio.setText(String.valueOf(resultado)); 
        Collections.sort(lista);
    }
    
    public void ordenarAscendente(){
        
        modelo_lista.removeAllElements();
        for(int i=0; i< lista.size(); i++){
            
            Integer cadena = lista.get(i);
            modelo_lista.addElement(cadena);                                                                      
          
        }
        
       
    }
    
   }
    
    

        
              
    
    

    
    

