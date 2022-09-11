package gof.命令模式;

/**
 * @author Yet
 * @date 2022/09/11 20:28
 **/
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void play(){
        System.out.println(this.name+" 开始播放");
    }

    public void stop(){
        System.out.println(this.name+" 停止播放");
    }
}
