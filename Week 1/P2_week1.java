import java.util.Scanner;

class Car
{
    String reg_no,make;
    Car(String reg_no, String make)
    {
    this.reg_no = reg_no;
    this.make = make;
    }
    void display()
    {
        System.out.println("Suit and Value are: "+this.reg_no +this.make);
    }
}

class Line
{
    int front=0, rear=9, temp=0,size=0;
    Car arr[] = new Car[10];
    
    void park(Car car)
    {
        if(size==10)
        {
            System.out.println("Queue is full");
        }
        else
        {
            size++;
            if(front==-1)
            {
                front=0;
            }
            rear = (rear+1)%10;
            arr[rear]=car;
            System.out.println("Car parked");
        }
    }
    void remove()
    {
        if(size==0)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            front = (front+1)%10;
            size--;
            System.out.println("Car removed");
        }
    }
}

public class P2_week2
{
    public static void main(String[] args)
    {
        //considering that there are 5 cars
        Car car[] = new Car[5];
        car[0] = new Car("1","Benz");
        car[1] = new Car("2","Volvo");
        car[2] = new Car("3","Ford");
        car[3] = new Car("4","Volkswagen");
        car[4] = new Car("5","Maruthi Suzuki");
        Line pile = new Line();
        Scanner s = new Scanner(System.in);
        int op;
        while(true)
        {
            System.out.println("1.Park");
            System.out.println("2.Remove");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            op=s.nextInt();
            switch(op)
            {
                case 1:
                    System.out.println("Enter the car's reg_no to be parked");
                    int car_num = s.nextInt();
                    if(car_num>5)
                    {
                        System.out.println("Invalid car number");
                    }
                    else
                    {
                        pile.park(car[car_num-1]);
                    }
                    break;
                case 2:
                    pile.remove();
                    break;
                case 3:
                    s.close();
                    System.exit(1);
                    break;
                default:
                    System.out.println("Enter a valid number");
            }
        }
    }
} 