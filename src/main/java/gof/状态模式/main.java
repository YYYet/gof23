package gof.状态模式;

/**
 * @author Yet
 * @date 2022/09/11 22:40
 **/
public class main {
    public static void main(String[] args) {
        StatusContext statusContext = new StatusContext();
        statusContext.setVideoStatus(new PlayStatus());
        System.out.println(statusContext.getVideoStatus().getClass().getSimpleName());

        statusContext.getVideoStatus().play();
        System.out.println(statusContext.getVideoStatus().getClass().getSimpleName());

        statusContext.getVideoStatus().stop();
        System.out.println(statusContext.getVideoStatus().getClass().getSimpleName());
    }
}
