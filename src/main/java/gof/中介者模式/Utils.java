package gof.中介者模式;

import java.util.Date;

/**
 * @author Yet
 * @date 2022/09/11 19:09
 **/
public class Utils {
    public static void say(Object o, String keyword){
        System.out.println(o.toString()+" say ["+keyword+"]"+"  "+new Date().toString());
    }
}
