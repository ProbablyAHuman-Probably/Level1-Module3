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
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {
    	
    	car_01 = new Car(500, 273, 56, 20);
    	car_02 = new Car(400, 273, 56, 20);
    	
    	
    }

    @Override
    public void draw() {
    	background(237, 166, 42);
    	fill(23, 246, 155);
    	ellipse(frogX, frogY, 50, 40);
    	car_01.display();
    	car_02.display();
    	car_01.moveLeft();
    	car_02.moveRight();
    	
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
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
            	frogY -= 10;
            }
            else if(keyCode == DOWN)
            {
            	frogY += 10;
            }
            else if(keyCode == RIGHT)
            {
            	frogX += 10;
            }
            else if(keyCode == LEFT)
            {
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
    	

//constructor for Car class that initializes each member variable with parameters
    	public Car(int carX, int carY, int carSize, int carSpeed) {
    		this.carX = carX;
    		this.carY = carY;
    		this.carSize = carSize;
    		this.carSpeed = carSpeed;
    		

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


void display()
  {
    fill(0,255,0);
    rect(carX, carY, carSize, 50);

    	
    }

    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
