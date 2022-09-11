package gof.命令模式;

/**
 * @author Yet
 * @date 2022/09/11 20:31
 **/
public class PlayCourseVideoCommand implements Command{
    private CourseVideo courseVideo;

    public PlayCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void exceut() {
        courseVideo.play();
    }
}
