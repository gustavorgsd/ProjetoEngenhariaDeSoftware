package br.edu.ifc.videira;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args){
		
		for(;;) {
			int op = 0;
			int op2 = 0;
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Loja de Roupas\n"
					+ "1 - Comprar produtos\n"
					+ "2 - Vender produtos\n"
					+ "3 - Lista de preços\n"
					+ "4 - Consultar compras\n"
					+ "5 - Consultar vendas\n"
					+ "6 - Sair\n"));
			if(op==1){
				op2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Camiseta\n"
						+ "2 - Moletom\n"
						+ "3 - Jaqueta\n"
						+ "4 - Calça\n"));
			}
		}
	}
}
