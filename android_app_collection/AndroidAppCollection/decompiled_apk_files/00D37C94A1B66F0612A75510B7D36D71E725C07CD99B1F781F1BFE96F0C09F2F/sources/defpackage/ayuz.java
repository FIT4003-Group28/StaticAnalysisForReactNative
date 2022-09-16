package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayuz  reason: default package */
/* loaded from: classes2.dex */
public final class ayuz extends AtomicLong implements ayoa, bamf {
    private static final long serialVersionUID = -9102637559663639004L;
    final bame a;
    final long b;
    final TimeUnit c;
    final ayoq d;
    bamf e;
    aypg f;
    volatile long g;
    boolean h;

    public ayuz(bame bameVar, long j, TimeUnit timeUnit, ayoq ayoqVar) {
        this.a = bameVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayoqVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.h) {
            azqc.d(th);
            return;
        }
        this.h = true;
        aypg aypgVar = this.f;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
        this.a.b(th);
        this.d.qr();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.h) {
            return;
        }
        long j = this.g + 1;
        this.g = j;
        aypg aypgVar = this.f;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
        ayuy ayuyVar = new ayuy(obj, j, this);
        this.f = ayuyVar;
        ayqi.i(ayuyVar, this.d.c(ayuyVar, this.b, this.c));
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.e, bamfVar)) {
            this.e = bamfVar;
            this.a.f(this);
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.e.si();
        this.d.qr();
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.h) {
            return;
        }
        this.h = true;
        aypg aypgVar = this.f;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
        if (aypgVar != null) {
            ((ayuy) aypgVar).a();
        }
        this.a.sm();
        this.d.qr();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this, j);
        }
    }
}
