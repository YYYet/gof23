package gof.备忘录模式;

import java.util.Stack;

/**
 * @author Yet
 * @date 2022/09/11 21:07
 **/
public class ArticleManage {
    private final Stack<ArticleMemento> stack = new Stack();

    public void add(ArticleMemento articleMemento){
        System.out.println("快照保存成功");
        stack.push(articleMemento);
    }

    public ArticleMemento undo(){
        System.out.println("撤销当前修改");
        return stack.pop();
    }
}
