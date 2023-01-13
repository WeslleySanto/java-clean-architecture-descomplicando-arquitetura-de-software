package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CPFTest {
    @Test
    void naoDeveriaCriarCPFComNumerosInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("999"));
    }

    @Test
    void deveriaPermitirCriarCPFComNumeroValido() {
        String numero = "123.456.789-00";
        
        CPF cpf = new CPF(numero);

        assertEquals(numero, cpf.getNumero());
    }
}