package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int frogX = 400;
	int frogY = 575;
	int hopDistance;
	Car car_01;
	Car car_02;
	Car car_uwu;
	Car car_rawr;
	int points;
	

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {

		car_01 = new Car(500, 273, 56, 20);
		car_02 = new Car(400, 273, 56, 20);
		car_uwu = new Car(300, 273, 56, 20);
		car_rawr = new Car(120, 300, 56, 20);
	}

	@Override
	public void draw() {
		background(237, 166, 42);
		fill(23, 246, 155);
		ellipse(frogX, frogY, 50, 40);
		fill(0, 0, 0);
		text("score: " + points, WIDTH - 100, 20);
		car_01.display();
		car_02.display();
		car_uwu.display();
		car_rawr.display();
		car_01.moveLeft();
		car_02.moveRight();
		car_uwu.moveLeft();
		car_rawr.moveRight();
		if (intersects(car_01) || intersects(car_02) || intersects(car_uwu) || intersects(car_rawr)) {
			frogX = 400;
			frogY = 575;
		}
		if (frogY == 0) {
			frogX = 400;
			frogY = 575;
			points += 1000000;
			
		}

	}
	
	boolean intersects(Car car) {
		if ((frogY > car.getY() && frogY < car.getY() + 50)
				&& (frogX > car.getX() && frogX < car.getX() + car.getSize())) {
			return true;
		} else {
			return false;
		}
	}

	void stopThatYouIdioticFrog() {
		if (frogX < 0) {
			frogX = 0;
		}
		if (frogY < 0) {
			frogY = 0;
		}
		if (frogX > WIDTH) {
			frogX = WIDTH;
		}
		if (frogY > HEIGHT) {
			frogY = HEIGHT;
		}
	}

	public void keyPressed() {
		if (key == CODED) {
			if (keyCode == UP) {
				frogY -= 10;
			} else if (keyCode == DOWN) {
				frogY += 10;
			} else if (keyCode == RIGHT) {
				frogX += 10;
			} else if (keyCode == LEFT) {
				frogX -= 10;
			}
			stopThatYouIdioticFrog();
		}
	}

	class Car {
		int carX;
		int carY;
		int carSize;
		int carSpeed;

		public Car(int carX, int carY, int carSize, int carSpeed) {
			this.carX = carX;
			this.carY = carY;
			this.carSize = carSize;
			this.carSpeed = carSpeed;
		}

		int getX() {
			return carX;
		}

		int getY() {
			return carY;
		}

		int getSize() {
			return carSize;
		}

		void moveLeft() {
			carX -= carSpeed;
			if (carX < -carSize) {
				carX = WIDTH;
			}
		}

		void moveRight() {
			carX += carSpeed;
			if (carX > WIDTH) {
				carX = -carSize;
			}
		}

		void display() {
			fill(0, 255, 0);
			rect(carX, carY, carSize, 50);
		}

	}

	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}
}
