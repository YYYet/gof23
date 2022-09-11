package gof.策略模式;

/**
 * @author Yet
 * @date 2022/09/11 20:54
 **/
public class Activity {
    private Strategy strategy;

    public Activity(Strategy strategy) {
        this.strategy = strategy;
    }

    public void StartActivity(){
        this.strategy.execute();
    }
}
