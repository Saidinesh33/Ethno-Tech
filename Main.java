//Inheritance

class Vehicle
{
    void start()
    {
        System.out.println("Vehicle is starting");
    }
}

class car extends Vehicle{
    void drive(){
        System.out.println("car is running");
    }
}

class Main{
    public static void main(String args[])
    {
        car c=new car();
        c.start();
        c.drive();
    }
}