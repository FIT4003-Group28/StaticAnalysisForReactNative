package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ayzy  reason: default package */
/* loaded from: classes2.dex */
final class ayzy implements ayoa, bamf {
    final bame a;
    final TimeUnit b;
    bamf c;
    long d;

    public ayzy(bame bameVar, TimeUnit timeUnit) {
        this.a = bameVar;
        this.b = timeUnit;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        long e = ayor.e(this.b);
        long j = this.d;
        this.d = e;
        this.a.c(new azpk(obj, e - j, this.b));
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.c, bamfVar)) {
            this.d = ayor.e(this.b);
            this.c = bamfVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.c.si();
    }

    @Override // defpackage.bame
    public final void sm() {
        this.a.sm();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        this.c.sp(j);
    }
}
