package gof.命令模式;

/**
 * @author Yet
 * @date 2022/09/11 20:33
 **/
public class main {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("java从入门到入土");

        PlayCourseVideoCommand playCourseVideoCommand = new PlayCourseVideoCommand(courseVideo);
        StopCourseVideoCommand stopCourseVideoCommand = new StopCourseVideoCommand(courseVideo);

        Staff staff = new Staff();

        staff.addCourseVide(playCourseVideoCommand);
        staff.addCourseVide(stopCourseVideoCommand);

        staff.excute();
    }
}
