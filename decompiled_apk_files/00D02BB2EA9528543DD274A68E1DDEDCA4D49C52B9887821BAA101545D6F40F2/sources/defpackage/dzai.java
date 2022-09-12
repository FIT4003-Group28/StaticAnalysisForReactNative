package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dzai  reason: default package */
/* loaded from: classes6.dex */
final class dzai extends dyzz {
    private final Handler a;

    public dzai(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.dyzz
    public final dyzy a() {
        return new dzag(this.a);
    }

    @Override // defpackage.dyzz
    public final dzak c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            dzfy.c(runnable);
            dzah dzahVar = new dzah(this.a, runnable);
            this.a.postDelayed(dzahVar, Math.max(0L, timeUnit.toMillis(j)));
            return dzahVar;
        }
        throw new NullPointerException("run == null");
    }
}
