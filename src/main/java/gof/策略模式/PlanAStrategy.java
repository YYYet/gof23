package gof.策略模式;

/**
 * @author Yet
 * @date 2022/09/11 20:52
 **/
public class PlanAStrategy implements Strategy{
    @Override
    public void execute() {
        System.out.println("PlanA");
    }
}
