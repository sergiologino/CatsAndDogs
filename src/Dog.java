public class Dog {
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
    public void OutputDog(){
        System.out.println(" This "+color+" dog is "+name+" ,his age "+age+ " years and weight is "+weight);
}
