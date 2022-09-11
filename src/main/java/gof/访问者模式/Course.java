package gof.访问者模式;

/**
 * @author Yet
 * @date 2022/09/11 12:10
 **/
public interface Course {
    void accept(IVisitor visitor);
}
