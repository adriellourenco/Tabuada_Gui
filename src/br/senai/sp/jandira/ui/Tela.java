package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
		minhaTela.setSize(600,500);
		minhaTela.setTitle("Tabuada");
		minhaTela.setLayout(null);
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Tabuada");
		lblTitulo.setBounds(20, 20, 300, 30);
		lblTitulo.setFont(fontTitle);
		lblTitulo.setForeground(whiteBlue);
		
		JPanel header = new JPanel();
		header.setBounds(0, 0, 600, 100);
		header.setBackground(white);
		header.setLayout(null);
		
		header.add(lblTitulo);
		
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(20, 80, 90, 30);

		JTextField txtDigiteOMultiplicando = new JTextField();
		txtDigiteOMultiplicando.setBounds(110, 80, 80, 30);
		txtDigiteOMultiplicando.getText();

		JLabel lblMáximoMultiplicador = new JLabel();
		lblMáximoMultiplicador.setText("Máximo Multiplicador:");
		lblMáximoMultiplicador.setBounds(20, 120, 90, 30);

		JTextField txtDigiteMaximoMultiplicador = new JTextField();
		txtDigiteMaximoMultiplicador.setBounds(110, 120, 80, 30);
		txtDigiteMaximoMultiplicador.getText();
		
		minhaTela.getContentPane().add(header);
		minhaTela.getContentPane().add(lblMultiplicando);
		minhaTela.getContentPane().add(txtDigiteOMultiplicando);
		minhaTela.getContentPane().add(lblMáximoMultiplicador);
		minhaTela.getContentPane().add(txtDigiteMaximoMultiplicador);
		
		minhaTela.setVisible(true);
		
	}
}
