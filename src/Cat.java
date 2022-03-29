public class Cat {
    String name;
    int age;
    int weight;
    String color;

    public Cat(){
        this("noname",0,0.1,"black");
    }
    public Cat(String name, int age,weight, String color){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    public void OutputCat(){
        System.out.println(" This "+color+" cat is "+name+" ,his age "+age+ " years and weight is "+weight);
    }
    public feed(int eat){
        weight+=eat;
    }
    public play(int time){
        weight-=0.5*time;
    }
}
