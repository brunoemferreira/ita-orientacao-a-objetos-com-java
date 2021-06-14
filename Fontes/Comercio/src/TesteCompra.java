import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCompra {

	@Test
	// Faz o Teste da compra A Vista
	void compraAVista() {
		Compra c = new Compra(500);
		assertEquals(1,c.getNumeroParcelas());  // Testa se a quantidade de parcelas que vai voltar é igual a 1
		assertEquals(500, c.getValorTotal());   // Testa se o valor total de Retorno é igual a 500
		assertEquals(500, c.getValorParcela()); // testa se o valor da parcela é igual a 500
	}
	
	@Test
	// Faz o Teste da compra Parcelada
	void compraAPrazo() {
		Compra c = new Compra(4, 250);          // quantidade de parcelas e valor de cada parcela
		assertEquals(4,c.getNumeroParcelas());  // Testa se a quantidade de parcelas que vai voltar é igual a 4
		assertEquals(1000, c.getValorTotal());  // Testa se o valor total de Retorno é igual a 1000
		assertEquals(250, c.getValorParcela()); // testa se o valor da parcela é igual a 250
	}

}
