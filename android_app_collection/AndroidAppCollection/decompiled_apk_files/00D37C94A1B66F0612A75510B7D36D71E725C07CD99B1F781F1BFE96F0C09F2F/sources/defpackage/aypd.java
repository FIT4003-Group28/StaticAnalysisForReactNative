package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aypd  reason: default package */
/* loaded from: classes2.dex */
final class aypd extends ayor {
    private final Handler b;

    public aypd(Handler handler) {
        this.b = handler;
    }

    @Override // defpackage.ayor
    public final ayoq a() {
        return new aypb(this.b);
    }

    @Override // defpackage.ayor
    public final aypg c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            azqc.o(runnable);
            aypc aypcVar = new aypc(this.b, runnable);
            this.b.sendMessageDelayed(Message.obtain(this.b, aypcVar), timeUnit.toMillis(j));
            return aypcVar;
        }
        throw new NullPointerException("run == null");
    }
}
