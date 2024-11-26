public class p4{
    public static void main(String[] args) {
        
        racingcar rccar1=new racingcar();

        rccar1.setcar(1234,20.5);

        rccar1.setcourse(5);
    }
}
class car
{
    private int num;
    private double gas;

public car()
{
    num=0;
    gas=0.0;

    System.out.println("生產了車子");
}

public void setcar(int n,double g)
{
    num = n;
    gas = g;

    System.out.println("將車號設為："+num+"，汽油量設為："+gas);
}

public void show()
{
    System.out.println("車號是："+num);
    System.out.println("汽油量是："+gas);
}
}

class racingcar extends car
{
    private int course;

    public racingcar()
    {
        course = 0;
        System.out.println("生產了賽車");
    }

    public void setcourse(int c)
    {
        course = c;
        System.out.println("將賽車編號設為"+course);
    }
}