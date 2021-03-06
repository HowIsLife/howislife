package fi.questionofday.android.ui.presenter;

import fi.questionofday.android.helper.SubscriptionHelper;

public abstract class BasePresenter<T extends BasePresenter.View> {

    private T view;
    protected final SubscriptionHelper subscriptionHelper;

    BasePresenter(SubscriptionHelper subscriptionHelper) {
        this.subscriptionHelper = subscriptionHelper;
    }

    public final T getView() {
        return view;
    }

    public void setView(T view) {
        this.view = view;
    }

    public void initialize() {
    }

    public void pause() {
    }

    public void destroy() {
        subscriptionHelper.unsubscribeAll();
    }

    public void resume() {
    }

    public interface View {
    }

}
