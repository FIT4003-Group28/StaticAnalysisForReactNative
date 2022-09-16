package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: rmv  reason: default package */
/* loaded from: classes4.dex */
public final class rmv implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ rng b;
    private final /* synthetic */ int c;

    public rmv(rng rngVar, long j) {
        this.b = rngVar;
        this.a = j;
    }

    public rmv(rng rngVar, long j, int i) {
        this.c = i;
        this.b = rngVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.b.x(this.a, true);
            this.b.l().q(new AtomicReference());
            return;
        }
        this.b.M().j.b(this.a);
        this.b.aG().j.b("Session timeout duration set", Long.valueOf(this.a));
    }
}
