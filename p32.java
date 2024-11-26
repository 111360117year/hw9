public class p32 {
    public static void main(String[] args)
    {
        vehicle[] vc = new vehicle[2];

        vc[0] = new car(1234,20.5);
        vc[0].setspeed(60);

        vc[1] = new plane(232);
        vc[1].setspeed(50);

        for(int i=0;i<vc.length;i++)
        {
            if(vc[i] instanceof car)
                System.out.println("第"+(i+1)+"個物件是car類別");
            else
                System.out.println("第"+(i+1)+"個物件不是car類別");
        }
    }
}

abstract class vehicle
{
    protected int speed;
    public void setspeed(int s)
    {
        speed = s;
        System.out.println("將速度設為"+speed+"了");
    }
    abstract void show();
}

class car extends vehicle
{
    private int num;
    private double gas;

    public car(int n,double g)
    {
        num=n;
        gas=g;
        System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
    }

    public void show()
    {
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
        System.out.println("速度是"+speed);

    }
}

class plane extends vehicle
{
    private int flight;

    public plane(int f)
    {
        flight = f;
        System.out.println("生產了"+flight+"班次的飛機");
    }

    public void show()
    {
        System.out.println("飛機的班次是"+flight);
        System.out.println("速度是"+speed);

    }
}
