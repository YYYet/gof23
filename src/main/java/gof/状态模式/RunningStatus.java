package gof.状态模式;

/**
 * @author Yet
 * @date 2022/09/11 22:24
 **/
public class RunningStatus extends Status{
    @Override
    void running() {
        System.out.println("正在running 无法再次running");
    }

    @Override
    void stop() {
        System.out.println("stop");
        super.context.setStatus(StatusContext.STOP);
    }
}
