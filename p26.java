public class p26{
    public static void main(String[] args) {
        
       car[] car = new car[2];

       car[0] = new car();
       car[1] = new racingcar();

       for(int i=0;i<car.length;i++)
       {
        Class cl = car[i].getClass();
        System.out.println("第"+(i+1)+"個物件的類別是"+cl);
       }

    }
}
class car
{
    protected  int num;
    protected double gas;

public car()
{
    num=0;
    gas=0.0;

    System.out.println("生產了車子");
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

}