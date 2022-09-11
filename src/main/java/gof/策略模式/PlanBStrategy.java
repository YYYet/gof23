package gof.策略模式;

/**
 * \
 *
 * @author Yet
 * @date 2022/09/11 20:54
 **/
public class PlanBStrategy implements Strategy{
    @Override
    public void execute() {
        System.out.println("PlanB");
    }
}
