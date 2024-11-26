public class p41{
    public static void main(String[] args) {
        
        car car1 = new car(1234,20.5);
        car1.vshow();
        car1.mshow();
    }
}

interface vehicle
{
    void vshow();
}
interface meterial
{
    void mshow();
}

class car implements vehicle,meterial
{
    private int num;
    private double gas;

public car(int n,double g)
{
    num=n;
    gas=g;

    System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
}

public void vshow()
{
    System.out.println("車號是："+num);
    System.out.println("汽油量是："+gas);
}
public void mshow()
{
    System.out.println("車子的材質是鐵");
}
}
