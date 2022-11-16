public class DogTest
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Dzeki",5);
        System.out.println(d1.toString());
        System.out.println(d1.getAge());
        System.out.println(d1.getName());
        d1.setAge(8);
        d1.setName("Julian");
        System.out.println(d1.toString());
        System.out.println(d1.human_age());
    }

}
