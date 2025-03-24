package br.ufrpe.metamorphic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MetamorphicApplicationTests {

	/*@Test
	void contextLoads() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		assertTrue(mlp.build(0.0) > 0.90);
	}*/

	@Test
	void contextMLP1d5625() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(1.5625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN1d5625() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(1.5625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP3d125() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(3.125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN3d125() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(3.125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP4d6875() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(4.6875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN4d6875() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(4.6875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP6d25() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(6.25);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN6d25() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(6.25);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP7d8125() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(7.8125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN7d8125() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(7.8125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP9d375() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(9.375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN9d375() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(9.375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP10d9375() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(10.9375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN10d9375() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(10.9375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP12d5() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(12.5);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN12d5() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(12.5);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP14d0625() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(14.0625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN14d0625() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(14.0625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP15d625() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(15.625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN15d625() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(15.625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP17d1875() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(17.1875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN17d1875() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(17.1875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP18d75() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(18.75);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN18d75() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(18.75);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP20d3125() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(20.3125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN20d3125() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(20.3125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP21d875() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(21.875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN21d875() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(21.875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP23d4375() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(23.4375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN23d4375() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(23.4375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP25() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(25.0);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN25() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(25.0);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP26d5625() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(26.5625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN26d5625() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(26.5625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP28d125() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(28.125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN28d125() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(28.125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP29d6875() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(29.6875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN29d6875() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(29.6875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP31d25() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(31.25);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN31d25() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(31.25);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP32d8125() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(32.8125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN32d8125() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(32.8125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP34d375() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(34.375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN34d375() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(34.375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP35d9375() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(35.9375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN35d9375() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(35.9375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP37d5() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(37.5);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN37d5() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(37.5);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP39d0625() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(39.0625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN39d0625() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(39.0625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP40d625() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(40.625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN40d625() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(40.625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP42d1875() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(42.1875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN42d1875() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(42.1875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP43d75() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(43.75);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN43d75() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(43.75);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP45d3125() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(45.3125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN45d3125() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(45.3125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP46d875() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(46.875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN46d875() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(46.875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP48d4375() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(48.4375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN48d4375() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(48.4375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP50() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(50.0);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN50() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(50.0);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP51d5625() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(51.5625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN51d5625() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(51.5625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP53d125() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(53.125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN53d125() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(53.125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP54d6875() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(54.6875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN54d6875() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(54.6875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP56d25() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(56.25);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN56d25() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(56.25);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP57d8125() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(57.8125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN57d8125() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(57.8125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP59d375() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(59.375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN59d375() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(59.375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP60d9375() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(60.9375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN60d9375() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(60.9375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP62d5() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(62.5);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN62d5() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(62.5);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP64d0625() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(64.0625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN64d0625() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(64.0625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP65d625() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(65.625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN65d625() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(65.625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP67d1875() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(67.1875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN67d1875() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(67.1875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP68d75() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(68.75);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN68d75() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(68.75);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP70d3125() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(70.3125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN70d3125() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(70.3125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP71d875() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(71.875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN71d875() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(71.875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP73d4375() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(73.4375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN73d4375() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(73.4375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP75() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(75.0);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN75() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(75.0);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP76d5625() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(76.5625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN76d5625() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(76.5625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP78d125() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(78.125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN78d125() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(78.125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP79d6875() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(79.6875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN79d6875() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(79.6875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP81d25() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(81.25);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN81d25() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(81.25);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP82d8125() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(82.8125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN82d8125() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(82.8125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP84d375() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(84.375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN84d375() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(84.375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP85d9375() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(85.9375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN85d9375() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(85.9375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP87d5() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(87.5);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN87d5() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(87.5);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP89d0625() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(89.0625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN89d0625() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(89.0625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP90d625() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(90.625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN90d625() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(90.625);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP92d1875() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(92.1875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN92d1875() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(92.1875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP93d75() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(93.75);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN93d75() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(93.75);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP95d3125() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(95.3125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN95d3125() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(95.3125);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP96d875() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(96.875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN96d875() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(96.875);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP98d4375() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse = mlp.build(98.4375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN98d4375() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse = ibk.build(98.4375);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextMLP100() {

		WekaMultiLayerPerceptron mlp = new WekaMultiLayerPerceptron();
		Double buildResponse= mlp.build(100.0);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}
	@Test
	void contextKNN100() {

		WekaKNN ibk = new WekaKNN();
		Double buildResponse= ibk.build(100.0);
		System.out.println(buildResponse);
		assertTrue(buildResponse > 0.90);
	}

}
