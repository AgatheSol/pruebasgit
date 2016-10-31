/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author ytaly
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Libro libro1 = new Libro();
        
       
        do {
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" seleccione una opcion "
                    + "\n1 autor "
                    + "\n2 titulo"
                    + "\n3 numero de exemplares"
                    + "\n4 exemplares prestados"
                    + "\n5 exemplares devoltos"
                    + "\n6 visualizar TosTring"
                    + "\n0 Salir"));
          switch(opcion){
   
              case 1: 
             
               String autor = JOptionPane.showInputDialog("Inserte o autor ");
               libro1.setAutor(autor);
             break;
           
              case 2:
              
              String titulo = JOptionPane.showInputDialog("Introduzca o titulo ");
               libro1.setTitulo(titulo);
               
               break;
               
              case 3:
                  int nExemplares =Integer.parseInt( JOptionPane.showInputDialog("Introduzca o numero de exemplares "));
                  libro1.setnExemplares(nExemplares);
               break;
               
              case 4:
                  int nPrestados = Integer.parseInt(JOptionPane.showInputDialog("Introduzca o numero de exemplares  "));
                  libro1.setnPrestados(nPrestados);
               break;
               
              case 5:
               libro1.devolver();
                  System.out.println(""  + libro1.toString()        ); 
               break;
     
               
                      
        }
              
            
            
        }while (opcion!=5);
        
    }
    }
    

