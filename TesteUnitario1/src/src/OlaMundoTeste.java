package src;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class OlaMundoTeste {

@Test 

public void testeSaudacao() {
	
	OlaMundo Ola = new OlaMundo();
	String resultado = Ola.saudacao();
	assertEquals("Olá, Mundo!", resultado);
}
	
}
