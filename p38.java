public class p38 {
    public static void main(String[] args)
    {
        vehicle[] vc = new vehicle[2];

        vc[0] = new car(1234,20.5);
        
        vc[1] = new plane(232);
        
        for(int i=0;i<vc.length;i++)
        {
            vc[i].show();
        }
    }
}

interface  vehicle
{
    int weight=1000;
    void show();
}

class car implements  vehicle
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

    }
}

class plane implements  vehicle
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

    }
}
