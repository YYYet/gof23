package gof.备忘录模式;

/**
 * @author Yet
 * @date 2022/09/11 21:19
 **/
public class main {
    public static void main(String[] args) {
        Article article = new Article();
        ArticleManage articleManage = new ArticleManage();

        article.setTitle("备忘录模式");
        article.setContext("入门到入土");
        System.out.println("文章生成 "+article);
        articleManage.add(article.generateMemento());

        article.setTitle("备忘录模式2");
        article.setContext("从入土到入门");
        System.out.println("文章修改 "+article);


        article.readFromMemento(articleManage.undo());
        System.out.println(article);
    }
}
