class Humane{
    //attributes

    private String name;
    private int age;
    private double height;
    private boolean isAwake;

    //constructor(Initialisation)
    public Humane(String name, int age , double height , boolean isAlive){
        this.name=name;
        this.age=age;
        this.height=height;
        this.isAwake= true;
    }

    //functions/behaviours

    public void greet(){
        System.out.println("Hello yall wassup!");


    }
    public void sleep(){
        isAwake= false;
        System.out.println("Human is going to sleep");


    }
    public void eat(){

        System.out.println("Human needs to eat and is eatingg");



    }
    public void Woke() {
        isAwake = true;
        System.out.println("Human woke up");
    }

    //getter
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public boolean status(){
        return isAwake;
    }


    //Setter(for controlled modification)
    public void setAge(int newAge){
        if (newAge > 0 && newAge < 120) { // Reasonable age validation
            age = newAge;
        } else {
            System.out.println("Invalid age!");
        }
    }



}
class Dancer extends Humane{
    private String Type;

    public Dancer(String name,int age,double height, boolean isAwake,String Type){
        super(name,age,height,isAwake);
        this.Type=Type;
    }
    @Override
    public void greet(){
        System.out.println("hello yall Im a Dancer!");
    }

}
public  class Human {
    public static void main(String[] args) {
        Humane Indhu = new Humane("Indhu",19,165,true);
        Indhu.greet();
        Indhu.sleep();
        Indhu.eat();
        Indhu.Woke();
        Dancer IndhuS= new Dancer("Indhu",19,165,true,"B");
        IndhuS.greet();
        IndhuS.eat();

    }
}


