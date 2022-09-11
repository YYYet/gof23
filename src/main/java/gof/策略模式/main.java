package gof.策略模式;

/**
 * @author Yet
 * @date 2022/09/11 20:55
 **/
public class main {
    public static void main(String[] args) {
        PlanAStrategy planAStrategy = new PlanAStrategy();
        PlanBStrategy planBStrategy = new PlanBStrategy();

        Activity activity1 = new Activity(planAStrategy);
        Activity activity2 = new Activity(planBStrategy);

        activity1.StartActivity();
        activity2.StartActivity();
    }
}
