package gof.访问者模式;

/**
 * @author Yet
 * @date 2022/09/11 12:12
 **/
public class FreeCourse implements Course{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
