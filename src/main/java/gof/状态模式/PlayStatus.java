package gof.状态模式;

/**
 * @author Yet
 * @date 2022/10/21 21:19
 **/
public class PlayStatus extends VideoStatus{
    @Override
    void play() {
        System.out.println("播放状态不允许再次播放");
    }

    @Override
    void stop() {
        super.statusContext.setVideoStatus(new StopStatus());
    }
}
