package br.ufrpe.metamorphic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MetamorphicApplicationTests {

	@Test
	void contextLoads() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		assertTrue(mlp.build(0) > 0.90);
	}

	@Test
	void context10() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(10);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}

	@Test
	void context20() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		assertTrue(mlp.build(20) > 0.90);
	}

	@Test
	void context30() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		assertTrue(mlp.build(30) > 0.90);
	}

	@Test
	void context40() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		assertTrue(mlp.build(40) > 0.90);
	}

	@Test
	void context60() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		assertTrue(mlp.build(60) > 0.90);
	}

}
