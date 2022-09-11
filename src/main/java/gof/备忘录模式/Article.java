package gof.备忘录模式;



/**
 * @author Yet
 * @date 2022/09/11 21:04
 **/
public class Article {
    private String title;
    private String context;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Article() {
    }

    public Article(String title, String context) {
        this.title = title;
        this.context = context;
    }

    public ArticleMemento generateMemento(){
        System.out.println("生成快照");
        return new ArticleMemento(this.title, this.context);
    }

    public void readFromMemento(ArticleMemento articleMemento){
        System.out.println("读取快照");
        this.title = articleMemento.getTitle();
        this.context = articleMemento.getContext();
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
