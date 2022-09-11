package gof.访问者模式;

public interface  IVisitor {
    void visit(FreeCourse course);
    void visit(NoFreeCourse course);
}
