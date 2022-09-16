package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rzw  reason: default package */
/* loaded from: classes4.dex */
public final class rzw implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public rzw(int i) {
        this.b = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    public rzw(Handler handler) {
        this.a = handler;
    }

    public rzw(Handler handler, int i) {
        this.b = i;
        this.a = handler;
    }

    public rzw(int i, byte[] bArr) {
        this.b = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    public rzw(int i, char[] cArr) {
        this.b = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        if (i == 0) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                runnable.run();
            } else {
                this.a.post(runnable);
            }
        } else if (i == 1) {
            this.a.post(runnable);
        } else if (i == 2) {
            this.a.post(runnable);
        } else if (i == 3) {
            this.a.post(runnable);
        } else {
            this.a.post(runnable);
        }
    }
}
