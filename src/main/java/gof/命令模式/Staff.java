package gof.命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yet
 * @date 2022/09/11 20:34
 **/
public class Staff {

    private List<Command> list = new ArrayList<>();

    public void addCourseVide(Command command){
        list.add(command);
    }

    public void excute(){
        list.forEach(item->{
            item.exceut();
        });
    }

}
