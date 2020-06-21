package br.com.gargel.usmensagem.validadores;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsNumeroInteiroValidadorTest {

	@Test
	public void deveValidarNumeroNegativo() {
		Validador validador = new IsNumeroInteiroValidador();
		assertEquals(true, validador.validar("-121"));
	}

	@Test
	public void deveValidarNumeroNulo() {
		Validador validador = new IsNumeroInteiroValidador();
		assertEquals(true, validador.validar("0"));
	}

	@Test
	public void deveValidarNumeroPositivo() {
		Validador validador = new IsNumeroInteiroValidador();
		assertEquals(true, validador.validar("121"));
	}

	@Test
	public void deveValidarParametroTexto() {
		Validador validador = new IsNumeroInteiroValidador();
		assertEquals(false, validador.validar("texto"));
	}

	@Test
	public void deveValidarParametroVazio() {
		Validador validador = new IsNumeroInteiroValidador();
		assertEquals(false, validador.validar(""));
	}

	@Test
	public void deveValizarPontoFlutuante() {
		Validador validador = new IsNumeroInteiroValidador();
		assertEquals(false, validador.validar("10.2"));
	}
	
	@Test
	public void deveValizarPontoFlutuanteNegativo() {
		Validador validador = new IsNumeroInteiroValidador();
		assertEquals(false, validador.validar("-10.2"));
	}
	
	

}
