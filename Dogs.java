package november29th;
public class Dogs
{
    public void speak()
    {
        System.out.println("bow bow");
    }

    public static void main(String[] args)
    {
        Dogs d = new Dogs();
        d.speak();
        Dogs b = new Beagle();
        b.speak();
    }
}

class Beagle extends Dogs
{
    @Override
    public void speak()
    {
        System.out.println("arf arf");
    }
}