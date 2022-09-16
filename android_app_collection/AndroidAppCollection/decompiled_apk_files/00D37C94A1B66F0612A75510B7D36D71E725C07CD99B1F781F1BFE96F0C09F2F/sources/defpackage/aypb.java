package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aypb  reason: default package */
/* loaded from: classes2.dex */
final class aypb extends ayoq {
    private final Handler a;
    private volatile boolean b;

    public aypb(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.b = true;
        this.a.removeCallbacksAndMessages(this);
    }

    @Override // defpackage.ayoq
    public final aypg c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit != null) {
                if (this.b) {
                    return ayqj.INSTANCE;
                }
                azqc.o(runnable);
                aypc aypcVar = new aypc(this.a, runnable);
                Message obtain = Message.obtain(this.a, aypcVar);
                obtain.obj = this;
                this.a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.b) {
                    return aypcVar;
                }
                this.a.removeCallbacks(aypcVar);
                return ayqj.INSTANCE;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }
}
