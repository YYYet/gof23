package gof.命令模式;

/**
 * @author Yet
 * @date 2022/09/11 20:32
 **/
public class StopCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public StopCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void exceut() {
        courseVideo.stop();
    }
}
