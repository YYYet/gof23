package gof.状态模式;

/**
 * @author Yet
 * @date 2022/09/11 22:40
 **/
public class main {
    public static void main(String[] args) {
        StatusContext statusContext = new StatusContext();

        statusContext.setStatus(new RunningStatus());
        statusContext.running();
        statusContext.running();
        statusContext.stop();
        statusContext.stop();


    }
}
