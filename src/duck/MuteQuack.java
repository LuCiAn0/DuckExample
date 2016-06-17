/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

public class MuteQuack implements QuackBehaviour {

    public void quack() {
        System.out.println("Can't quack!! Mute;");
    }

}
