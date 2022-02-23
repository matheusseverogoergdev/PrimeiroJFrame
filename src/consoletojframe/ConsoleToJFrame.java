/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoletojframe;
import javax.swing.JFrame; // Import JFrame
import javax.swing.JButton; // Import JButton
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import view.DiasVividos;
import view.IMC;

/**
 *
 * @author User
 */
public class ConsoleToJFrame implements ActionListener {

    JFrame janela = new JFrame();
    // Criando Painel/Coitaner para add os objetos
    JPanel painel = new JPanel();
    JLabel jlNome = new JLabel("Seu nome: ");
    // Vamos criar um input / JTextField
    JTextField jtfsNome = new JTextField(5);
    JButton btnOk = new JButton("OK");
    JButton btnIMC = new JButton("Calc. IMC");
    JButton btnDias = new JButton("Calc. Dias");
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ConsoleToJFrame();
        
    }

    private ConsoleToJFrame() {
        janela.setTitle("Janela Principal");
        janela.setSize(350, 150);
        janela.setLocation(50, 50);
        // Define a exibição do botão fechar janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setLayout(new FlowLayout (FlowLayout.CENTER, 30, 20));
        // add label ao painel
        painel.add(jlNome);
        // add jtextfield ao painel
        painel.add(jtfsNome);
        // Adiciona o botão ao painel
        painel.add(btnOk);
        painel.add(btnIMC);
        painel.add(btnDias);
        // Add o painel na janela
        janela.add(painel);
        // Define que o JFrame vai ser carregado
        janela.setVisible(true);
        
        // Registrando o botão do listener
        btnOk.addActionListener(this);
        btnIMC.addActionListener(this);
        btnDias.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == btnOk) {
            JOptionPane.showMessageDialog(null, "Você digitou: " + jtfsNome.getText());
        }
        
        if (e.getSource() == btnIMC) {
            IMC jfIMC = new IMC();
            jfIMC.setVisible(true);
            jfIMC.jtfSNome.setText(jtfsNome.getText());
            jfIMC.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        
        if (e.getSource() == btnDias) {
            DiasVividos jfDias = new DiasVividos();
            jfDias.setVisible(true);
            jfDias.jtfSNome.setText(jtfsNome.getText());
            jfDias.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
    }
    
}
