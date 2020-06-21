package br.com.gargel.usmensagem.validadores;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.gargel.usmensagem.exception.USmensagemException;

public class IsPositivoValidadorTest {

	@Test
	public void deveValidarNumeroNegativo() {
		Validador validador = new IsPositivoValidador();
		assertEquals(false, validador.validar("-121"));
	}

	@Test
	public void deveValidarNumeroNulo() {
		Validador validador = new IsPositivoValidador();
		assertEquals(true, validador.validar("0"));
	}

	@Test
	public void deveValidarNumeroPositivo() {
		Validador validador = new IsPositivoValidador();
		assertEquals(true, validador.validar("121"));
	}

	@Test(expected = USmensagemException.class)
	public void deveValidarParametroTexto() {
		Validador validador = new IsPositivoValidador();
		validador.validar("texto");
	}

	@Test(expected = USmensagemException.class)
	public void deveValidarParametroVazio() {
		Validador validador = new IsPositivoValidador();
		validador.validar("");
	}

	@Test
	public void deveValizarPontoFlutuantePositivo() {
		Validador validador = new IsPositivoValidador();
		assertEquals(true, validador.validar("10.2"));
	}
	
	@Test
	public void deveValizarPontoFlutuanteNegativo() {
		Validador validador = new IsPositivoValidador();
		assertEquals(false, validador.validar("-10.2"));
	}
	
}
