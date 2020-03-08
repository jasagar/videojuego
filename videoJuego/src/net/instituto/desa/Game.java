package net.instituto.desa;

public class Game {
	private static final String ABAJO = "Abajo";
	private static final String ARRIBA = "Arriba";
	private static final String IZQUIERDA = "Izquierda";
	private static final String DERECHA = "Derecha";
	Jugador j;

	public void movimiento(String m) {
		if (m.equalsIgnoreCase(DERECHA)) {
			moverDerecha();
		}
		if (m.equalsIgnoreCase(IZQUIERDA)) {
			moverIzquierda();
		}
		if (m.equalsIgnoreCase(ARRIBA)) {
			moverArriba();
		}
		if (m.equalsIgnoreCase(ABAJO)) {
			moverAbajo();
		}
	}

	private void moverAbajo() {
		j.setY(j.getY() + 1);
	}

	private void moverArriba() {
		j.setY(j.getY() - 1);
	}

	private void moverIzquierda() {
		j.setX(j.getX() - 1);
	}

	private void moverDerecha() {
		j.setX(j.getX() + 1);
	}
}
