package gof.备忘录模式;

/**
 * @author Yet
 * @date 2022/09/11 21:04
 **/
public class ArticleMemento {
    private String title;
    private String context;

    public String getTitle() {
        return title;
    }

    public String getContext() {
        return context;
    }

    public ArticleMemento(String title, String context) {
        this.title = title;
        this.context = context;
    }
}
