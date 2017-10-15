/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import views.*;
import models.*;
import controllers.*;


public class Main {
    
    public static void main(String alb[]){
     
        ModelEdad model_edad = new ModelEdad();
        ViewEdad view_edad = new ViewEdad();
        ControllerEdad controller_edad = new ControllerEdad(model_edad,view_edad);
        
        ModelMayor model_mayor = new ModelMayor();
        ViewMayor view_mayor = new ViewMayor();
        ControllerMayor controller_mayor = new ControllerMayor(model_mayor,view_mayor);
        
        ModelNotas model_notas = new ModelNotas();
        ViewNotas view_notas = new ViewNotas();
        ControllerNotas controller_notas = new ControllerNotas(model_notas,view_notas);
        
        ModelOperaciones model_operaciones = new ModelOperaciones();
        ViewOperaciones view_operaciones = new ViewOperaciones();
        ControllerOperaciones controller_operaciones = new ControllerOperaciones(model_operaciones,view_operaciones);
        
        ModelOrdenar model_ordenar = new ModelOrdenar();
        ViewOrdenar view_ordenar = new ViewOrdenar();
        ControllerOrdenar controller_ordenar = new ControllerOrdenar(model_ordenar,view_ordenar);
        
        
        ModelPrincipal model_principal = new ModelPrincipal();
        ViewPrincipal view_principal = new ViewPrincipal();
        
        Object views[] = new Object[6];
        
        views[0] = view_edad;
        views[1] = view_mayor;
        views[2] = view_notas;
        views[3] = view_operaciones;
        views[4] = view_ordenar;
        views[5] = view_principal;
        
        ControllerPrincipal controller_principal = new ControllerPrincipal(model_principal,views);
        
    }
    
}
