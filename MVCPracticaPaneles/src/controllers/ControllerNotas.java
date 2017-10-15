/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import views.ViewNotas;
import models.ModelNotas;



public class ControllerNotas {
    
    ViewNotas view_notas;
    ModelNotas model_notas;
    
    private FileReader leer_archivo = null;
    private JFileChooser elegir_archivo = new JFileChooser();
    private FileWriter escribir_archivo;
    
    public ControllerNotas(ModelNotas model_notas,ViewNotas view_notas){
        
        this.model_notas = model_notas;
        this.view_notas = view_notas;
        
        view_notas.jm_item_abrir.addActionListener(e -> this.itemAbrir());
        view_notas.jm_item_guardar.addActionListener(e -> this.itemGuardar());
        view_notas.jm_item_guardarcomo.addActionListener(e -> this.itemGuardarComo());
        view_notas.jm_item_salir.addActionListener(e -> this.salir());
        
        
        
        
    }
    
     public void itemAbrir(){
        
                        try{
               
               elegir_archivo.showOpenDialog(view_notas);
               model_notas.setArchivo(elegir_archivo.getSelectedFile());
               leer_archivo = new FileReader(model_notas.getArchivo());
               
                 int caracter = 0;
                 String texto = "";
               
               while((caracter = leer_archivo.read())!= -1){
                   
                   texto+= (char)caracter;
               }
               
               leer_archivo.close();
               view_notas.jtextarea_bloc.setText(texto);
               
           }catch(FileNotFoundException ex){
               
               System.err.println("Archivo no encontrado" + ex.getMessage());
               
           }catch(IOException ex){
               
               System.err.println("Error en el archivo" + ex.getMessage());
               
           }
           
           finally{
               
               try{
                   
                   leer_archivo.close();
                   
               }catch(IOException ex){
                   
                  System.err.println("Error al cerrar" + ex.getMessage());
                   
               }
           }
    
  
    }
     
      public void itemGuardar(){
        
                             try{
               
               //elegir_archivo.showSaveDialog(view_notas);
               model_notas.setArchivo(elegir_archivo.getSelectedFile());
               escribir_archivo = new FileWriter(model_notas.archivo,false);
               
              escribir_archivo.write(view_notas.jtextarea_bloc.getText());
               
              escribir_archivo.close();
               
              JOptionPane.showMessageDialog(null,"Archivo Guardado");
                   
               
           }catch (IOException ex) {
          
        }
    
    }
      
      public void itemGuardarComo(){
          
          try{
               
               elegir_archivo.showSaveDialog(view_notas);
               model_notas.setArchivo(elegir_archivo.getSelectedFile());
               escribir_archivo = new FileWriter(model_notas.archivo,false);
               
              escribir_archivo.write(view_notas.jtextarea_bloc.getText());
               
              escribir_archivo.close();
               
              JOptionPane.showMessageDialog(null,"Archivo Guardado");
                   
               
           }catch (IOException ex) {
          
        }
          
      }
      
      public void salir(){
          
         System.exit(0);
      }
}
