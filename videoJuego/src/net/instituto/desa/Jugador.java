package net.instituto.desa;

public class Jugador {
	int y, x;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	void moverDerecha() {
		setX(getX() + 1);
	}

	void moverIzquierda() {
		setX(getX() - 1);
	}

	void moverArriba() {
		setY(getY() - 1);
	}

	void moverAbajo() {
		setY(getY() + 1);
	}
}
