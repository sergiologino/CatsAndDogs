public class Dog {
    String name;
    int age;
    double weight;
    String color;

    public Dog(){
        this("noname",0,0.1,"black");
    }
    public Dog(String name, int age,double weight, String color){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    public void Feed(int eat){
        weight+=eat;
    }
    public void Play(int time) {
        weight -= 0.5 * time;
    }
    public void OutputDog() {
        System.out.println(" This " + color + " dog is " + name + " ,his age " + age + " years and weight is " + weight);
    }
}
