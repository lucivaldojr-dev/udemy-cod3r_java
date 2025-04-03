package iii_classesEmetodos;

public class i_ProdutoTeste {

	public static void main(String[] args) {
		
		i_Produto p1 = new i_Produto();
		p1.nome = "Notebook";
		p1.preco = 6500.10;
		p1.desconto = 0.25;
		
		var p2 = new i_Produto();
		p2.nome = "Caneta Azul";
		p2.preco = 10.99;
		p2.desconto = 0.30;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto(0);
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("A média do carrinho está em: R$%.2f.", mediaCarinho);
	}
}
