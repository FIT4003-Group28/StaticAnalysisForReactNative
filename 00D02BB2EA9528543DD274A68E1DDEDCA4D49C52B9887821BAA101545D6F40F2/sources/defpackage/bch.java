package defpackage;

import android.os.Build;
import androidx.work.ListenableWorker;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bch  reason: default package */
/* loaded from: classes.dex */
public final class bch extends bcm<bch, bci> {
    public bch(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit) {
        super(cls);
        bgh bghVar = this.b;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            bbz.e();
            millis = 900000;
        }
        bghVar.c(millis, millis);
    }

    @Override // defpackage.bcm
    public final /* bridge */ /* synthetic */ bci a() {
        if (!this.b.o || Build.VERSION.SDK_INT < 23 || !this.b.i.c) {
            return new bci(this);
        }
        throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
    }

    public bch(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        super(cls);
        this.b.c(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
    }
}
