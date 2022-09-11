package gof.状态模式;

public abstract class Status {

    protected StatusContext context;

    public void SetContext(StatusContext context) {
        this.context = context;
    }

    abstract void running();

    abstract void stop();
}
