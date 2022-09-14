package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dzag  reason: default package */
/* loaded from: classes6.dex */
final class dzag extends dyzy {
    private final Handler a;
    private volatile boolean b;

    public dzag(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        this.b = true;
        this.a.removeCallbacksAndMessages(this);
    }

    @Override // defpackage.dyzy
    public final dzak c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit != null) {
                if (this.b) {
                    return dzbe.INSTANCE;
                }
                dzfy.c(runnable);
                dzah dzahVar = new dzah(this.a, runnable);
                Message obtain = Message.obtain(this.a, dzahVar);
                obtain.obj = this;
                this.a.sendMessageDelayed(obtain, Math.max(0L, timeUnit.toMillis(j)));
                if (!this.b) {
                    return dzahVar;
                }
                this.a.removeCallbacks(dzahVar);
                return dzbe.INSTANCE;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }
}
