class Car 
{
    
     String brand;
     String model;
     int year;
     double speed;

    
    Car()
    {
        this.brand = "--";
        this.model = "--";
        this.year = 0;
        this.speed = 0;
    }

    Car(String brand, String model, int year, int speed) 
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }
     void display() 
     {
        System.out.println("Brand: " + brand);
        System.out.println(" Model: " + model);
        System.out.println(" Year: " + year);
        System.out.println(" Speed: " + speed + " km/h");
        System.out.println();
    }
     void accelerate(int incrementSpeed) 
    {
        this.speed =this.speed+incrementSpeed;
    }
}
    public class Car_object
    {
        public static void main(String[] args) 
        {
        
        Car car1 = new Car("Tata", "Harrier", 2022, 60);
        Car car2 = new Car("Honda", "Jazz", 2017, 50);
        Car car3 = new Car();
        System.out.println("Before Speed Increment:");
        car1.display();
        car2.display();
        car3.display();

        
        car1.accelerate(20); 
        car2.accelerate(15); 
         
        
        System.out.println("After Speed Increment:");
        car1.display();
        car2.display();
        car3.display();
    }
}
