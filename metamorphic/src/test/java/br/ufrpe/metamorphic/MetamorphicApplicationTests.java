package br.ufrpe.metamorphic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MetamorphicApplicationTests {

	@Test
	void contextLoads() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		assertTrue(mlp.build(1) < 90.0);
	}

	@Test
	void context10() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		assertTrue(mlp.build(10) < 90.0);
	}

	@Test
	void context20() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		assertTrue(mlp.build(20) < 90.0);
	}

	@Test
	void context30() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		assertTrue(mlp.build(30) < 90.0);
	}

	@Test
	void context40() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		assertTrue(mlp.build(40) < 90.0);
	}

	@Test
	void context60() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		assertTrue(mlp.build(60) < 90.0);
	}

}
