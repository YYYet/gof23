package gof.状态模式;

/**
 * @author Yet
 * @date 2022/10/21 21:19
 **/
public class StopStatus extends VideoStatus{
    @Override
    void play() {
        super.statusContext.setVideoStatus(new PlayStatus());
    }

    @Override
    void stop() {
        System.out.println("停止状态不允许再次停止");
    }
}
