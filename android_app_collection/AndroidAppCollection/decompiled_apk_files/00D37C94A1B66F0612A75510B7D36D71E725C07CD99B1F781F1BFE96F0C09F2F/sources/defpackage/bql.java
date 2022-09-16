package defpackage;

import android.os.Build;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bql  reason: default package */
/* loaded from: classes2.dex */
public final class bql extends bqp {
    public bql(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        bum bumVar = this.c;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            bqf.a();
            bqf.g(bum.a, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            millis = 900000;
        }
        bumVar.b(millis, millis);
    }

    @Override // defpackage.bqp
    public final /* bridge */ /* synthetic */ bqq a() {
        if (!this.a || Build.VERSION.SDK_INT < 23 || !this.c.k.c) {
            return new bqq(this.b, this.c, this.d);
        }
        throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
    }

    public bql(Class cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        super(cls);
        this.c.b(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
    }
}
