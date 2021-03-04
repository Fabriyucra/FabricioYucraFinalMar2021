package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductoTest {
	@Test
	public void queSePuedePedirImpuestoSobreProducto() {
		Producto produc = new Producto(1, "Arroz ", 100.00);
		
		Double imp = 21.00;
		
		assertEquals (imp , produc.getImpuesto());
	}
	
	@Test
	public void queSePuedePedirImpuestoSobreProductoDeLujo() {	
       Producto produc = new ProductoDeLujo(1, "ArrozA ", 100.00);
		
		Double imp = 36.00;
		assertEquals (imp , produc.getImpuesto());
	}
	
}
