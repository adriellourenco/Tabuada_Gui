package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

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
		minhaTela.setSize(450,500);
		minhaTela.setTitle("Tabuada");
		minhaTela.setLayout(null);
		
		minhaTela.setVisible(true);
		
		
	}
}
