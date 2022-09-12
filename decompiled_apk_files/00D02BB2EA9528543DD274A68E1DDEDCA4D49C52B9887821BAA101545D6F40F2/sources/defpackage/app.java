package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: app  reason: default package */
/* loaded from: classes2.dex */
public abstract class app<Result> {
    private static Handler a;
    public volatile int f = 1;
    final AtomicBoolean d = new AtomicBoolean();
    final AtomicBoolean e = new AtomicBoolean();
    public final FutureTask<Result> c = new apn(this, new apm(this));

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Result a();

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Result result) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Result result) {
        if (!this.e.get()) {
            e(result);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(Result result) {
        Handler handler;
        synchronized (app.class) {
            if (a == null) {
                a = new Handler(Looper.getMainLooper());
            }
            handler = a;
        }
        handler.post(new apo(this, result));
    }

    public final boolean f() {
        return this.d.get();
    }
}
