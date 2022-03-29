public class Cat {
    String name;
    int age;
    double weight;
    String color;

    public Cat(){
        this("noname",0,0.1,"black");
    }
    public Cat(String name, int age,double weight, String color){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    public void OutputCat(){
        System.out.println(" This "+color+" cat is "+name+" ,his age "+age+ " years and weight is "+weight);
    }
    public void Feed(int eat){
        weight+=eat;
    }
    public void Walk(int time){

        weight-=time;
    }
    public void Play(int time){
        weight-=0.5*time;
    }

}
