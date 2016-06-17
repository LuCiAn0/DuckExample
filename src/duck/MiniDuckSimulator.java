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
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();

    }
}
