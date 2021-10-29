package br.senai.sp.jandira.model;

public class Tabuada {
	
	private int multiplicando;
	private int maximoMultiplicador;
	
	public void setMultilplicando(int multiplicando){
		this.multiplicando = multiplicando;
	}
	
	public void setmaximoMultiplicador(int maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}
	
	public void calcular() {
		String contas[] = new String[maximoMultiplicador + 1]; 
		for (int multiplicador = 0; multiplicador <= maximoMultiplicador; multiplicador++) {
			
			int resultado = multiplicando * multiplicador;
			
			//String stringMultiplicando = (String.valueOf(multiplicando));
			//String stringMultiplicador = (String.valueOf(multiplicador));
			//String stringResultado = (String.valueOf(resultado));
			
			contas[multiplicador] = multiplicando +" x " +multiplicador +" = " +resultado;
		}
	}
	
}
