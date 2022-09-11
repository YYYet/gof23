package gof.状态模式;

/**
 * @author Yet
 * @date 2022/09/11 22:26
 **/
public class StopStatus extends Status{
    @Override
    void running() {
        super.context.setStatus(StatusContext.RUNNING);
    }

    @Override
    void stop() {
        System.out.println("已经停止 无法继续stop");
    }
}
