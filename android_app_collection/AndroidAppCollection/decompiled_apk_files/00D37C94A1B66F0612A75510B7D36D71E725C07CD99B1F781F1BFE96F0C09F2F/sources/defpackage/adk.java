package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: adk  reason: default package */
/* loaded from: classes.dex */
public final class adk implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public adk() {
        this.a = new Handler(Looper.getMainLooper());
    }

    public adk(Handler handler, int i) {
        this.b = i;
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        if (i == 0) {
            this.a.post(runnable);
        } else if (i != 1) {
            if (i == 2) {
                this.a.post(runnable);
            } else {
                this.a.post(runnable);
            }
        } else {
            Handler handler = this.a;
            hz.g(runnable);
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.a + " is shutting down");
        }
    }

    public adk(Looper looper, int i) {
        this.b = i;
        this.a = new rfm(looper);
    }

    public adk(int i) {
        this.b = i;
        this.a = new rfm(Looper.getMainLooper());
    }
}
