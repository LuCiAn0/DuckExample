/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 *
 * @author ziegler
 */
public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {

    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }
    
    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }
    
    public void setQuackBehaviour(QuackBehaviour qb)
    {
        quackBehaviour = qb;
    }
    
    

    public abstract void display();

}
