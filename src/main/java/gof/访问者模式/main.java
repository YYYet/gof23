package gof.访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yet
 * @date 2022/09/11 12:15
 **/
public class main {
    public static void main(String[] args) {
        ArrayList<Course> arrayList = new ArrayList();
        arrayList.add(new FreeCourse());
        arrayList.add(new NoFreeCourse());

        arrayList.forEach(item->{
            item.accept(new Visitor());
        });
    }
}
