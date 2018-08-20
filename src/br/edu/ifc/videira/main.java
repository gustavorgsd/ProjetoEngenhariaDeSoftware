package br.edu.ifc.videira;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args){
		
		List<String> compras = new ArrayList<>();
		List<String> vendas = new ArrayList<>();
		
		for(;;) {
			int op = 0;
			int op2 = 0;
			int unid = 0;
			
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
				
				if(op2==1) {
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add(unid+" Camiseta(s)");
				}else if(op2==2){
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add(unid+" Moletom(s)");
				}else if(op2==3){
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add(unid+" Jaqueta(s)");
				}else{
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add(unid+" Calça(s)");	
					}
				}else if(op==2){
					op2 = Integer.parseInt(JOptionPane.showInputDialog("1- Camiseta = 50,00R$\n"
							+ "2- Moletom = 80,00R$\n"
							+ "3- Jaqueta = 100,00R$\n"
							+ "4- Calça = 60,00R$\n"));
					if(op2==1) {
						vendas.add("Camiseta");				
					}else if(op2==2){
						vendas.add("Moletom");	
					}else if(op2==3){
						vendas.add("Jaqueta");	
					}else{
						vendas.add("Calça");	
					}
				}else if(op==3){
						JOptionPane.showMessageDialog(null,"1- Camiseta = 50,00R$\n"
								+ "2- Moletom = 80,00R$\n"
								+ "3- Jaqueta = 100,00R$\n"
								+ "4- Calça = 60,00R$\n");
					}
			}
		}
	}

