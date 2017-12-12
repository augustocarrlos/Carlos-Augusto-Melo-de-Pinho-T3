/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho3;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Principal extends JFrame implements ActionListener {
    JButton sair, Consulta_veiculos, Adiciona_Veiculos, Aluga, Devolve, Excluir, Avançar_Data ;
    private int i =1;
    private int aux =1;
    ConVeic c = new ConVeic();
    private int cad;
    public Principal(){
         
         super("Branco");
         JFrame frame = new JFrame();
         JOptionPane.showMessageDialog(null,"Boas vindas!");
         JOptionPane.showMessageDialog(null,"Sistema básico para locação de veículos!");
         
         
        
        //c[j] = new ConVeic();
         
        //c.setMarca(JOptionPane.showInputDialog("Marca do veículo: "));
        //c.setModelo(JOptionPane.showInputDialog("Modelo do veículo: "));
        //c.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano do veículo: ")));
        //c.setValDia(Double.parseDouble(JOptionPane.showInputDialog("Valor da diária do veículo: ")));
        //double valor = Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial para conta-comum:"));
        //conta1.depositar(valor);
        
        Container h = getContentPane();
        Container h2 = new JPanel();
        
        Consulta_veiculos = new JButton("Consultar veiculos");
        Consulta_veiculos.addActionListener(this);

        Adiciona_Veiculos = new JButton("Adicionar veículos");
        Adiciona_Veiculos.addActionListener(this);

        Aluga = new JButton("Alugar");
        Aluga.addActionListener(this);

        Devolve = new JButton("Devolver");
        Devolve.addActionListener(this);

        Excluir = new JButton("Excluir");
        Excluir.addActionListener(this);

        sair = new JButton("Sair");
        sair.addActionListener(this);
        
        Avançar_Data = new JButton("Avançar data");
        Avançar_Data.addActionListener(this);
        
        h2.setLayout(new GridLayout(3,2));
        h2.add(Consulta_veiculos);
        h2.add( Adiciona_Veiculos);
        h2.add(Aluga);
        h2.add(Devolve);
        h2.add(Excluir);
        h2.add( Avançar_Data);
        h2.add(sair);
       
        
        Label meg = new Label("Selecione a opção desejada:");
        meg.setAlignment(1);
        meg.setFont(new Font("Serif", Font.PLAIN, 20));
        h.setLayout(new GridLayout(2,1));
        h.add(meg);
        h.add(h2);
        
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
    public void actionPerformed(ActionEvent e){
        //SAIR
        if(e.getSource() == sair){
            System.exit(0);
        }
        //CONSULTAR VEICULO
        if(e.getSource() == Consulta_veiculos){
            
          for(i  = 1; i < aux; i++ ){  
            JOptionPane.showMessageDialog(null,
                                          
                                          "\nModelo: " +c.getModelo()+
                                          "\nDisponível para aluguel "+
                                          "\nData atual: 14/12/2017 "+
                                          "\n\nCódigo: " +00+i
                                                 
                 
                    
                                                 
            );
            
            c.setCons(Integer.parseInt(JOptionPane.showInputDialog("Deseja obter mais detalhes? digite 1 para sim, e 2 para não.")));
            
            if(c.Cons == 1){
                 JOptionPane.showMessageDialog(null,
                                          "Marca: " +c.getMarca()+
                                          "\nAno: " +c.getAno()+
                                          "\nValor Diário: " +c.getValDia()
             
                 );                                
            }
            if(c.Cons == 2){
                break;
            }
          }  
        }
        //ADICIONA VEÍCULO
        if(e.getSource() == Adiciona_Veiculos){ 
            aux++;    
            c.setMarca(JOptionPane.showInputDialog("Marca do veículo: "));
            c.setModelo(JOptionPane.showInputDialog("Modelo do veículo: "));
            c.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano do veículo: ")));
            c.setValDia(Double.parseDouble(JOptionPane.showInputDialog("Valor da diária do veículo: ")));
            cad++;
            JOptionPane.showMessageDialog(null,"Quantidade de veículos cadastrados: " + cad);
            
            
        }
        //if(e.getSource() == Excluir){
            //int codigo;
            //(Integer.parseInt(JOptionPane.showInputDialog("Ano do veículo: ")));
        //}
           
        
    }
    
        
    public static void main(String[] args) {
         Principal Principal = new Principal();
    }
        
}

