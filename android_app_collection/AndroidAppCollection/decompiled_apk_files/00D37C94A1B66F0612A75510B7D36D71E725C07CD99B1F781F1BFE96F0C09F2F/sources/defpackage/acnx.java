package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acnx  reason: default package */
/* loaded from: classes.dex */
public final class acnx {
    public final Handler a;
    public final long b;
    public final long c;
    public final long d;
    public long e = Long.MIN_VALUE;
    public final Runnable f;
    public boolean g;
    public final acqb h;

    public acnx(acnw acnwVar, acqb acqbVar, Handler handler) {
        acnv acnvVar = new acnv(this);
        this.f = acnvVar;
        this.h = acqbVar;
        handler.getClass();
        this.a = handler;
        aqxo.p(true);
        this.b = TimeUnit.SECONDS.toMillis(1L) / 15;
        long nanos = TimeUnit.SECONDS.toNanos(1L) / 30;
        this.c = nanos;
        this.d = (nanos * 10) / 100;
        acnwVar.a = new acnu(acnvVar);
    }

    public final void a() {
        this.g = false;
    }
}
