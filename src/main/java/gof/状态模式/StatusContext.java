package gof.状态模式;

/**
 * @author Yet
 * @date 2022/10/21 21:16
 **/
public class StatusContext {
    VideoStatus videoStatus;

    public void setVideoStatus(VideoStatus videoStatus) {
        this.videoStatus = videoStatus;
        this.videoStatus.setStatusContext(this);
    }

    public VideoStatus getVideoStatus() {
        return videoStatus;
    }
}
