package negocio;

import java.util.ArrayList;

public class Memoria {

	private ArrayList<String> numeros;
	private String numero1="";
	private String numero2="";
	private String resultado;
	private String operador="";
	private int aux=0;
	private int i=1;

	public Memoria() {
		numeros = new ArrayList<String>();
	}

	public String getNumeros() {
		String resultado = "";
		
		for (String num : numeros) {
			resultado += ""+ num;
		}
		return resultado;
	}
	
//	primeiraParte opera��o segundaParte =  resultado
	
	public void setNumero(String numero) {
		if(numero.equals("A")) {
			for(int j=0; j<numeros.size(); j++) {
				numeros.remove(j);
				j--;
			}
			i=1;
			numero1="";
			numero2="";
			aux=0;
			resultado="";
			operador="";
			return;
		}
		
		if(numero.equals("+")==false && numero.equals("*")==false && numero.equals("-")==false && numero.equals("/")==false && i==1) {
			numero1+=numero;
		}
		
		if(numero.equals("+")==false && numero.equals("*")==false && numero.equals("-")==false && numero.equals("/")==false && numero.equals("=")==false && i==2) {
			numero2+=numero;
		}
		
		if(numero.equals("+")==true || numero.equals("*")==true || numero.equals("-")==true || numero.equals("/")==true && i==1) {
			i++;
			operador=numero;
		}
		
		numeros.add(numero);
		
		if(numero.equals("=")==true) {
			if(operador.equals("+")) {
				aux=Integer.valueOf(numero1)+Integer.valueOf(numero2);
			}else if(operador.equals("-")){
				aux=Integer.valueOf(numero1)-Integer.valueOf(numero2);
			}else if(operador.equals("*")) {
				aux=Integer.valueOf(numero1)*Integer.valueOf(numero2);
			}else {
				aux=Integer.valueOf(numero1)/Integer.valueOf(numero2);
			}
			resultado=Integer.toString(aux);
			numeros.add(resultado);
		}
//		System.out.println("i: " + i);
//		System.out.println("numero 1:" + numero1);
//		System.out.println("numero 2:" + numero2);
//		System.out.println("aux: " + aux);
//		System.out.println("Operador: " + operador);
	}
}
