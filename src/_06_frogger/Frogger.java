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
    	
    	car_01 = new Car(500, 273, 56, 50);
    	car_02 = new Car(400, 273, 56, 50);
    	
    	
    }

    @Override
    public void draw() {
    	background(237, 166, 42);
    	fill(23, 246, 155);
    	ellipse(frogX, frogY, 50, 40);
    	car_01.display();
    	car_02.display();
    	
    }
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            }
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
    	
    	void moveLeft {
    		
    		
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
