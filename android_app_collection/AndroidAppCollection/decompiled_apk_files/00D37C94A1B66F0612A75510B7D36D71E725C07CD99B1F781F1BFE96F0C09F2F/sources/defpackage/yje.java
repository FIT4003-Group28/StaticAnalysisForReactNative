package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: yje  reason: default package */
/* loaded from: classes4.dex */
public final class yje extends yjj {
    private final Handler b;
    private final Thread c;

    private yje(Handler handler, yiw yiwVar) {
        super(yiwVar);
        handler.getClass();
        this.b = handler;
        this.c = handler.getLooper().getThread();
    }

    public static yje c(Handler handler, yiw yiwVar) {
        return new yje(handler, yiwVar);
    }

    @Override // defpackage.yjj
    protected final void d(Runnable runnable) {
        if (Thread.currentThread() != this.c) {
            this.b.post(runnable);
        } else {
            runnable.run();
        }
    }
}
