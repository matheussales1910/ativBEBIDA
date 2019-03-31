package AtivBEBIDA;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;




public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Nome, Tipo, Sabor;
		int VerificaRetornavel = 0;
		double Preco = 0;
		int Safra;
		int resp = 0;
		int respopcao = 0;
		
		
		String Opcoes [] = {"0 - Sair", "1 - Cadastrar", "2 - Verificar Preço","3 - Mostrar Dados"};
		String OpcoesCadastro [] = {"0 - Sair", "1 - Vinho", "2 - Suco", "3 - Refrigerante"
		};
		String Retornavel [] = {"0 - SAIR", "1 - SIM","2 - Não   "};
		
		
		Vinho Vinho10 = new Vinho();
		Suco Suco10 = new Suco();
		Refrigerante Refrigerante10 = new Refrigerante();
		
		do {
			
			
			resp = JOptionPane.showOptionDialog(null, "BEBIDAS", "MENU", 0, 
					JOptionPane.QUESTION_MESSAGE, null, Opcoes, Opcoes[0]);
			
			switch (resp) {
			
		
			
			case 1 :
				do {
			
				respopcao = JOptionPane.showOptionDialog(null, "Opções", "Menu",0 ,
						JOptionPane.QUESTION_MESSAGE,	null, OpcoesCadastro, OpcoesCadastro[0]);
			
				switch (respopcao) {
				 
				case 1 :
					
			try {		
			Vinho10.setNome(Nome = JOptionPane.showInputDialog(null, "DIGITE O NOME DO VINHO",
							"ENTRADA", JOptionPane.QUESTION_MESSAGE));		
			}catch (InputMismatchException error) {
				JOptionPane.showMessageDialog(null, "Digite apenas caracteres válidos");
				
			}
			
			try {
			Vinho10.setPreco(Preco = Double.parseDouble(JOptionPane.showInputDialog(null, 
					"DIGITE O PREÇO DO VINHO",	"ENTRADA", JOptionPane.QUESTION_MESSAGE)));		
			}catch (NumberFormatException error) {
				JOptionPane.showMessageDialog(null, "Digite apenas caracteres numericos");
			}
				
			try {
			Vinho10.setTipo(Tipo = JOptionPane.showInputDialog(null, "DIGITE O TIPO DO VINHO",
					"ENTRADA", JOptionPane.QUESTION_MESSAGE));	
			}catch(NumberFormatException error) {
				JOptionPane.showMessageDialog(null, "Digite apenas caracteres validos");
			}
			
			try {		
			Vinho10.setSafra(Safra = Integer.parseInt(JOptionPane.showInputDialog(null,
			"DIGITE A SAFRA DO VINHO", "ENTRADA", JOptionPane.QUESTION_MESSAGE)));	
			
			break;
			}catch(NumberFormatException error){
				JOptionPane.showMessageDialog(null, "Digite apenas caracteres numericos");
				
			}
			
			
				case 2 : 
					
				Suco10.setNome(Nome = JOptionPane.showInputDialog(null,
				"DIGITE O NOME DO SUCO","ENTRADA", JOptionPane.QUESTION_MESSAGE));
					
				Suco10.setPreco(Preco = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"DIGITE O PREÇO DO SUCO",	"ENTRADA", JOptionPane.QUESTION_MESSAGE)));
					
				Suco10.setSabor(Sabor = JOptionPane.showInputDialog(null,"DiGITE O SABOR DO SUCO",
				"ENTRADA", JOptionPane.QUESTION_MESSAGE));  
			break;
			
				case 3 :
					
				Refrigerante10.setNome(Nome = JOptionPane.showInputDialog(null,
				"DIGITE O NOME DO REFRIGERANTE","ENTRADA", JOptionPane.QUESTION_MESSAGE));
							
				Refrigerante10.setPreco(Preco = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"DIGITE O PREÇO DO REFRIGERANTE",	"ENTRADA", JOptionPane.QUESTION_MESSAGE)));
		
				
				VerificaRetornavel = JOptionPane.showOptionDialog(null, "ESTE REFRIGERANTE É RETORNÁVEL?",
						"ENTRADA", 0, JOptionPane.QUESTION_MESSAGE,null, Retornavel, Retornavel[0]);
				
				if(VerificaRetornavel==1) {
					Refrigerante10.setRetornavel(true);
					
				}else {
					Refrigerante10.setRetornavel(false);
				}
				
				
				
				}
				}while(respopcao!=0);
				break;
			
			case 2 :
				do {
				respopcao = JOptionPane.showOptionDialog(null, "Opções", "Menu",0 ,
				JOptionPane.QUESTION_MESSAGE,	null, OpcoesCadastro, OpcoesCadastro[0]);
			
				switch (respopcao) {
				
				case 1 :
				if(Vinho10.VerificarPreco(Preco)) {
					JOptionPane.showMessageDialog(null, "PRODUTO EM PROMOÇÂO", "SAIDA",
					JOptionPane.INFORMATION_MESSAGE);	
				}else {
					JOptionPane.showMessageDialog(null, "PRODUTO COM PREÇO NORMAL", "SAIDA",
					JOptionPane.INFORMATION_MESSAGE);
				}

					
			   break;
			
				case 2 :
					
				if(Suco10.VerificarPreco(Preco)) {
					JOptionPane.showMessageDialog(null, "PRODUTO EM PROMOÇÂO", "SAIDA",
					JOptionPane.INFORMATION_MESSAGE);	
				}else {
					JOptionPane.showMessageDialog(null, "PRODUTO COM PREÇO NORMAL", "SAIDA",
					JOptionPane.INFORMATION_MESSAGE);
				}
			break;
			
				case 3 :
					
				if (Refrigerante10.VerificarPreco(Preco)) {
					JOptionPane.showMessageDialog(null, "PRODUTO EM PROMOÇÂO", "SAIDA",
					JOptionPane.INFORMATION_MESSAGE);	
				}else {
					JOptionPane.showMessageDialog(null, "PRODUTO COM PREÇO NORMAL", "SAIDA",
					JOptionPane.INFORMATION_MESSAGE);
					}
				}
				
				}while(respopcao!=0);
				
			break;
					
				
			case 3 : 
				do {				
				respopcao = JOptionPane.showOptionDialog(null, "Opções", "Menu",0 ,
				JOptionPane.QUESTION_MESSAGE,	null, OpcoesCadastro, OpcoesCadastro[0]);
				
				switch (respopcao) {
				
				case 1:
				JOptionPane.showMessageDialog(null, Vinho10.MostrarBebida(),
				"SAIDA", JOptionPane.INFORMATION_MESSAGE);
				
				break;
				
				case 2:
					JOptionPane.showMessageDialog(null,Suco10.MostrarBebida(),
							"SAIDA", JOptionPane.INFORMATION_MESSAGE);
				
				break;
				
				case 3:
					JOptionPane.showMessageDialog(null, Refrigerante10.MostrarBebida(),
							"SAIDA", JOptionPane.INFORMATION_MESSAGE);
				}
				}while(respopcao!=0);
				break;
					
			}
		}while(resp!=0);		
	}

}
