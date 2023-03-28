/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author MANHICA
 */
public class Barras extends JFrame {
    
    public Barras(){
      setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Grsfico Barras");
        setSize(950,700);
        setLocationRelativeTo(null);
        criarGrafico();
        setVisible(true);
    }
    
     public void criarGrafico(){ 
         DefaultCategoryDataset barra = new DefaultCategoryDataset();
         barra.setValue(1400, "Motor", "");
         barra.setValue(100, "pneu", "");
         barra.setValue(400, "jantas", "");
         barra.setValue(50, "farol", "");
         
         JFreeChart grafico = ChartFactory.createBarChart("Estatisticas", "Produtos", "Quantia", barra, PlotOrientation.VERTICAL,true,true,false);
         ChartPanel painel =new ChartPanel(grafico);
         add(painel);
         
     }
     
     public static void main(String[] args) {
        new Barras();
    }
}
