package br.ufrpe.metamorphic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MetamorphicApplicationTests {

	@Test
	void contextLoads() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		assertTrue(mlp.build() < 90.0);
	}

}
