package defpackage;

import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayve  reason: default package */
/* loaded from: classes2.dex */
public final class ayve implements ayoa, bamf {
    final bame a;
    final long b;
    final TimeUnit c;
    final ayoq d;
    bamf e;

    public ayve(bame bameVar, long j, TimeUnit timeUnit, ayoq ayoqVar) {
        this.a = bameVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayoqVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.d.c(new ayvc(this, th), 0L, this.c);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.d.c(new ayvd(this, obj), this.b, this.c);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.e, bamfVar)) {
            this.e = bamfVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.e.si();
        this.d.qr();
    }

    @Override // defpackage.bame
    public final void sm() {
        this.d.c(new ayvb(this), this.b, this.c);
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        this.e.sp(j);
    }
}
