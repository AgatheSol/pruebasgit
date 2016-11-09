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
public class Libro {
   private String titulo,autor;
   private int nExemplares,nPrestados;
//ddd

public Libro(){

}


public Libro (String titulo,String autor,int nExemplares,int nPrestados){
    
    this.autor = autor;
    this.titulo = titulo;
    this.nExemplares = nExemplares;
    this.nPrestados = nPrestados;
    
}

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setnExemplares(int nExemplares) {
        this.nExemplares = nExemplares;
    }

    public void setnPrestados(int nPrestados) {
        this.nPrestados = nPrestados;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getnExemplares() {
        return nExemplares;
    }

    public int getnPrestados() {
        return nPrestados;
    }
 

    

    public void prestar (){
        
        if(nExemplares<=0)
            JOptionPane.showMessageDialog(null,"non hay exemplares pra prestar " +false);
       
        else
            
    JOptionPane.showMessageDialog(null," o número de exemplares prestados e "+(nExemplares-nPrestados)+true);
}

public void devolver (){
  nPrestados = Integer.parseInt( JOptionPane.showInputDialog("Introduzca a cantidade a devolver "));
    if(nPrestados>0){
        
    JOptionPane.showMessageDialog(null," o número de exemplares devoltos e "+(nPrestados+nExemplares )+( true));
    }
    else
        JOptionPane.showMessageDialog(null,false+"");
    
}


   @Override
   public String toString(){
    
       String mensaje =" o libro chamase "+titulo+"seu autor es "+autor+" y tiene "+nExemplares+"e se devolven "+nPrestados+""
               + "e a suma total e "+ (nPrestados+nExemplares);  
    return mensaje;
}
}
