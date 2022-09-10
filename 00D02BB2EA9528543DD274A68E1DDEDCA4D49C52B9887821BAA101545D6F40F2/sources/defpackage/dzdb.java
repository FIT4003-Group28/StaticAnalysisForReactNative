package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzdb  reason: default package */
/* loaded from: classes6.dex */
public final class dzdb<T> implements dyzw, dzak {
    final dyzw<? super T> a;
    final TimeUnit b;
    final dyzy c;
    dzak d;
    dzak e;
    volatile long f;
    boolean g;

    public dzdb(dyzw<? super T> dyzwVar, TimeUnit timeUnit, dyzy dyzyVar) {
        this.a = dyzwVar;
        this.b = timeUnit;
        this.c = dyzyVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        this.d.SQ();
        this.c.SQ();
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        if (dzbd.c(this.d, dzakVar)) {
            this.d = dzakVar;
            this.a.b(this);
        }
    }

    @Override // defpackage.dyzw
    public final void c(T t) {
        if (this.g) {
            return;
        }
        long j = this.f + 1;
        this.f = j;
        dzak dzakVar = this.e;
        if (dzakVar != null) {
            dzbd.e((AtomicReference) dzakVar);
        }
        dzda dzdaVar = new dzda(t, j, this);
        this.e = dzdaVar;
        dzbd.f(dzdaVar, this.c.c(dzdaVar, 200L, this.b));
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        if (this.g) {
            dzfy.a(th);
            return;
        }
        dzak dzakVar = this.e;
        if (dzakVar != null) {
            dzbd.e((AtomicReference) dzakVar);
        }
        this.g = true;
        this.a.d(th);
        this.c.SQ();
    }

    @Override // defpackage.dyzw
    public final void e() {
        if (this.g) {
            return;
        }
        this.g = true;
        dzak dzakVar = this.e;
        if (dzakVar != null) {
            dzbd.e((AtomicReference) dzakVar);
        }
        if (dzakVar != null) {
            ((dzda) dzakVar).run();
        }
        this.a.e();
        this.c.SQ();
    }
}
