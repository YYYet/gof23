package gof.状态模式;

/**
 * @author Yet
 * @date 2022/09/11 22:23
 **/
public class StatusContext {
    private Status status;
    public static Status RUNNING = new RunningStatus();
    public static Status STOP = new StopStatus();

    public void setStatus(Status status) {
        this.status = status;
        this.status.SetContext(this);
    }

    public void running() {
        status.running();
    }
    public void stop() {
        status.stop();
    }

}
