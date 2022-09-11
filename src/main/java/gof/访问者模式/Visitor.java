package gof.访问者模式;

/**
 * @author Yet
 * @date 2022/09/11 12:11
 **/
public class Visitor implements IVisitor{
    @Override
    public void visit(FreeCourse course) {
        System.out.println("免费课程"+course.toString());
    }
    @Override
    public void visit(NoFreeCourse course) {
        System.out.println("收费课程"+course.toString());
    }
}
