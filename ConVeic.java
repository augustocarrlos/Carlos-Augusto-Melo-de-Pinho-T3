/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho3;
   
public class ConVeic {
    
    private String Marca ;
    private String Modelo ;
    private int Ano ;
    private double ValDia ;
    int Cons  ;
    

    public String getMarca(){
        return Marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public int getAno(){
        return Ano;
    }
    public double getValDia(){
        return ValDia;
    }
    public int getCos(){
        return Cons;
    }
     
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
        
    public void setAno(int Ano){
        this.Ano = Ano;
    }
    public void setValDia(double ValDia){
        this.ValDia = ValDia;
    }
    public void setCons(int Cons){
        this.Cons = Cons;
    }
    //public int Cod(){ 
       // return this.Codigo;
    //}


    
}
