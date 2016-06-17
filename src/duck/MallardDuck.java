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
public class MallardDuck extends Duck
{
    
    public MallardDuck() {
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyWithWings();
    }
    
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
    
}
