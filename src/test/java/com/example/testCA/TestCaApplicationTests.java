package com.example.testCA;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestCaApplicationTests extends TestCaApplication {

	@Test
	public void testSnakeMovesToD() {
		String s = "D";
		int n = 1;
		Position position = new Position(0, 1);

		assertEquals(snakeGame(n, s).getX(), position.getX());
		assertEquals(snakeGame(n, s).getY(), position.getY());

	}

	@Test
	public void testSnakeMovesToB() {
		String s = "B";
		int n = 1;
		Position position = new Position(1, 0);

		assertEquals(snakeGame(n, s).getX(), position.getX());
		assertEquals(snakeGame(n, s).getY(), position.getY());

	}

	@Test
	public void testSnakeMovesToG() {
		String s = "G";
		int n = 1;

		Exception exception = assertThrows(IllegalStateException.class, () -> {
			snakeGame(n, s);
		});

		assertTrue(exception.getMessage().contains("Game over! Hit the frame!"));

	}

	@Test
	public void testSnakeMovesToH() {
		String s = "H";
		int n = 1;

		Exception exception = assertThrows(IllegalStateException.class, () -> {
			snakeGame(n, s);
		});

		assertTrue(exception.getMessage().contains("Game over! Hit the frame!"));

	}

	@Test
	public void testSnakeMovesBackwardsHB() {
		String s = "HB";
		int n = 1;

		Exception exception = assertThrows(IllegalStateException.class, () -> {
			snakeGame(n, s);
		});

		assertTrue(exception.getMessage().contains("Invalid movement backwards"));

	}

	@Test
	public void testSnakeMovesBackwardsGD() {
		String s = "GD";
		int n = 1;

		Exception exception = assertThrows(IllegalStateException.class, () -> {
			snakeGame(n, s);
		});

		assertTrue(exception.getMessage().contains("Invalid movement backwards"));

	}

	@Test
	public void testSnakeEatsItself() {
		String s = "BGH";
		int n = 5;

		Exception exception = assertThrows(IllegalStateException.class, () -> {
			snakeGame(n, s);
		});

		assertTrue(exception.getMessage().contains("Game over! you ate yourself!"));


	}

	@Test
	public void testSnakeGame() {
		String s = "DBDBBBD";
		int n = 5;
		Position position = new Position(1, 6);

		assertEquals(snakeGame(n, s).getX(), position.getX());
		assertEquals(snakeGame(n, s).getY(), position.getY());

	}

}
