public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    public void swim(){
        System.out.println("All ducks float, even decoys!");

    }
    public void perfomFly(){
        flyBehavior.fly();
    }
    public void perfomQuack(){
        quackBehavior.quack();
    }
    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior =quackBehavior;
    }
}
