package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

import br.senai.sp.jandira.model.Tabuada;

public class Tela {

	public void criarTela(){
		
		Font fontTitle = new Font("Arial Black", Font.BOLD, 30);
		Font fontSubTitle = new Font("Arial Black", Font.PLAIN, 20);
		
		Color whiteBlue = new Color(102, 255, 242);
		Color green = new Color(106, 214, 43);
		Color red = new Color(255, 61, 61);
		Color white = new Color(255, 255, 255);
		
		JFrame minhaTela = new JFrame();
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(550,400);
		minhaTela.setTitle("Tabuada");
		minhaTela.setLayout(null);
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Tabuada");
		lblTitulo.setBounds(20, 20, 300, 30);
		lblTitulo.setFont(fontTitle);
		lblTitulo.setForeground(whiteBlue);
		
		JPanel header = new JPanel();
		header.setBounds(0, 0, 600, 50);
		header.setBackground(white);
		header.setLayout(null);
		
		header.add(lblTitulo);
		
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(20, 80, 90, 30);

		JTextField txtDigiteOMultiplicando = new JTextField();
		txtDigiteOMultiplicando.setBounds(150, 80, 80, 30);
		txtDigiteOMultiplicando.getText();

		JLabel lblMáximoMultiplicador = new JLabel();
		lblMáximoMultiplicador.setText("Máximo Multiplicador:");
		lblMáximoMultiplicador.setBounds(20, 120, 130, 30);

		JTextField txtDigiteMaximoMultiplicador = new JTextField();
		txtDigiteMaximoMultiplicador.setBounds(150, 120, 80, 30);
		txtDigiteMaximoMultiplicador.getText();
		
		JButton btnCalcular = new JButton();
		btnCalcular.setBounds(20, 200, 230, 50);
		btnCalcular.setBackground(green);
		btnCalcular.setText("Calcular");
		
		JButton btnLimpar = new JButton();
		btnLimpar.setBounds(20, 260, 230, 50);
		btnLimpar.setBackground(red);
		btnLimpar.setText("Limpar");
		
		JLabel lblResultado = new JLabel();
		lblResultado.setBounds(300, 80, 150, 30);
		lblResultado.setText("Resultado:");
		lblResultado.setFont(fontSubTitle);
		lblResultado.setForeground(whiteBlue);
		
		
		DefaultListModel<String> modelResultado= new DefaultListModel<String>(); 
		
		JList<String> listResultado = new JList<String>(modelResultado);
		
		JScrollPane scrollResultado = new JScrollPane(listResultado);
		scrollResultado.setBounds(300, 115, 200, 195);
		
		minhaTela.getContentPane().add(header);
		minhaTela.getContentPane().add(lblMultiplicando);
		minhaTela.getContentPane().add(txtDigiteOMultiplicando);
		minhaTela.getContentPane().add(lblMáximoMultiplicador);
		minhaTela.getContentPane().add(txtDigiteMaximoMultiplicador);
		minhaTela.getContentPane().add(btnCalcular);
		minhaTela.getContentPane().add(btnLimpar);
		minhaTela.getContentPane().add(lblResultado);
		minhaTela.getContentPane().add(scrollResultado);
		
		
		minhaTela.setVisible(true);
	
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tabuada tabuada = new Tabuada();
				
				tabuada.setMultilplicando(txtDigiteOMultiplicando.getText());
				tabuada.setMaximoMultiplicador(txtDigiteMaximoMultiplicador.getText());
				
				tabuada.calcular();
				
				String[] contas = tabuada.getContas();
				ArrayList<String[]> arrayList = new ArrayList<String[]>();
				arrayList.add(contas);
				
				modelResultado.addElement(arrayList);
				
			}
		});
		
	}
}
