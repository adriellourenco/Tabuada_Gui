package br.senai.sp.jandira.model;

public class Tabuada {
	
	private int multiplicando;
	private int maximoMultiplicador;
	
	public void setMultilplicando(String StringMultiplicando){
		int multiplicando = Integer.parseInt(StringMultiplicando);
		this.multiplicando = multiplicando;
	}
	
	public void setMaximoMultiplicador(String StringMaximoMultiplicador) {
		int maximoMultiplicador = Integer.parseInt(StringMaximoMultiplicador);
		this.maximoMultiplicador = maximoMultiplicador;
	}
	
	String contas[] = new String[maximoMultiplicador + 1]; 
	
	public void calcular() {
		for (int multiplicador = 0; multiplicador <= maximoMultiplicador; multiplicador++) {
			
			int resultado = multiplicando * multiplicador;
			
			//String stringMultiplicando = (String.valueOf(multiplicando));
			//String stringMultiplicador = (String.valueOf(multiplicador));
			//String stringResultado = (String.valueOf(resultado));
			
			contas[multiplicador] = multiplicando +" x " +multiplicador +" = " +resultado;
		}
	}
	
	public String[] getContas() {
		return contas;
	}
	
}
