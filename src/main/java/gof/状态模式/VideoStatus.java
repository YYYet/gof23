package gof.状态模式;

/**
 * @author Yet
 * @date 2022/10/21 21:17
 **/
public abstract class VideoStatus {
    StatusContext statusContext;

    public void setStatusContext(StatusContext statusContext) {
        this.statusContext = statusContext;
    }

    abstract void play();
    abstract void stop();
}
