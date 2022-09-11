package gof.中介者模式;

import javax.swing.*;

/**
 * @author Yet
 * @date 2022/09/11 19:08
 **/
public class Person {
    public void Say(String keyword){
        Utils.say(this, keyword);
    }
}
