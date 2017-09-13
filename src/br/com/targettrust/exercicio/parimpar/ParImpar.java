package br.com.targettrust.exercicio.parimpar;

public class ParImpar {
	
	public static String pares(int[] numeros) {
		String retorno = "";
		for(int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				if (!retorno.equals("")) {
					retorno += " , ";
				}
				retorno += numeros[i];
			}
		}
		return retorno;
	}
	
	public static String pares2(int[] numeros) {
		StringBuilder retorno = new StringBuilder();
		final String SEPARADOR = " , "; 
		for(int i : numeros) {
			if (i % 2 == 0) {
				if (retorno.length() == 0) {
					retorno = new StringBuilder().append(i);
				}else {
					retorno.append(SEPARADOR).append(i);
				}
			}
		}
		return retorno.toString();
	}
	
	public static String paresComForEath(int[] numeros) {
		String retorno = "";
		for(int i : numeros) {
			if (i % 2 == 0) {
				if (!retorno.equals("")) {
					retorno += " , ";
				}
				retorno += i;
			}
		}
		return retorno;
	}
	
	public static String impares(int[] numeros) {
		String retorno = "";
		for(int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0) {
				if (!retorno.equals("")) {
					retorno += " , ";
				}
				retorno += numeros[i];
			}
		}
		return retorno;
	}
	
	public static String impares2(int[] numeros) {
		StringBuilder retorno = new StringBuilder();
		final String SEPARADOR = " , "; 
		for(int i : numeros) {
			if (i % 2 != 0) {
				if (retorno.length() == 0) {
					retorno = new StringBuilder().append(i);
				}else {
					retorno.append(SEPARADOR).append(i);
				}
			}
		}
		return retorno.toString();
	}
	
	public static String imparesComForEath(int[] numeros) {
		String retorno = "";
		for(int i : numeros) {
			if (i % 2 != 0) {
				if (!retorno.equals("")) {
					retorno += " , ";
				}
				retorno += i;
			}
		}
		return retorno;
	}
	
	public static void main(String[] args) {
		int[] numeros = {1,2,3,4,5,6,7,8};
		
		System.out.println("Pares:");
		System.out.println(pares(numeros));
		System.out.println("Pares2:");
		System.out.println(pares2(numeros));
		System.out.println("Impares:");
		System.out.println(impares(numeros));
		System.out.println("Impares2:");
		System.out.println(impares2(numeros));
		System.out.println("Pares com ForEath:");
		System.out.println(paresComForEath(numeros));
		System.out.println("Impares com ForEath:");
		System.out.println(imparesComForEath(numeros));
		
	}

}
