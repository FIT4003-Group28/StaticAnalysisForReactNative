package okhttp3;

import h.w;
/* loaded from: classes.dex */
public interface Call extends Cloneable {

    /* loaded from: classes.dex */
    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    /* renamed from: clone */
    Call mo344clone();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    w timeout();
}
