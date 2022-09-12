package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dzec  reason: default package */
/* loaded from: classes6.dex */
final class dzec extends dyzy {
    volatile boolean a;
    private final dzbf b;
    private final dzaj c;
    private final dzbf d;
    private final dzee e;

    public dzec(dzee dzeeVar) {
        this.e = dzeeVar;
        dzbf dzbfVar = new dzbf();
        this.b = dzbfVar;
        dzaj dzajVar = new dzaj();
        this.c = dzajVar;
        dzbf dzbfVar2 = new dzbf();
        this.d = dzbfVar2;
        dzbfVar2.b(dzbfVar);
        dzbfVar2.b(dzajVar);
    }

    @Override // defpackage.dzak
    public final void SQ() {
        if (!this.a) {
            this.a = true;
            this.d.SQ();
        }
    }

    @Override // defpackage.dyzy
    public final dzak b(Runnable runnable) {
        if (this.a) {
            return dzbe.INSTANCE;
        }
        return this.e.f(runnable, 0L, TimeUnit.MILLISECONDS, this.b);
    }

    @Override // defpackage.dyzy
    public final dzak c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.a) {
            return dzbe.INSTANCE;
        }
        return this.e.f(runnable, j, timeUnit, this.c);
    }
}
