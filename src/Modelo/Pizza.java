/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author MANHICA
 */
public class Pizza extends JFrame {

    public Pizza() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Grsfico Pizza");
        setSize(950,700);
        setLocationRelativeTo(null);
        criarGrafico();
        setVisible(true);
    }
    
    public void criarGrafico(){
     DefaultPieDataset pizza = new DefaultKeyedValuesDataset();
        pizza.setValue("Motor", 10);
        pizza.setValue("pneu", 20);
        pizza.setValue("roda", 20);
        pizza.setValue("jantas", 50);
        
        JFreeChart grafico = ChartFactory.createPieChart("Produtos vendidos", pizza, true, true, false);
        ChartPanel painel = new ChartPanel(grafico);
        add(painel);
        
    }
    
    
    public static void main(String[] args) {
        new Pizza();
    }
    
}
