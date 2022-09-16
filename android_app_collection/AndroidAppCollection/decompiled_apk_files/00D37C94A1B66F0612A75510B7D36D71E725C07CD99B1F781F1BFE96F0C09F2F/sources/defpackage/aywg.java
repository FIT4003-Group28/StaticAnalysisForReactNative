package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aywg  reason: default package */
/* loaded from: classes2.dex */
public final class aywg extends AtomicInteger implements ayoa, aypg {
    private static final long serialVersionUID = 8443155186132538303L;
    final ayns a;
    final ayqe c;
    bamf f;
    volatile boolean g;
    final azoj b = new azoj();
    final aypf d = new aypf();
    final int e = Integer.MAX_VALUE;

    public aywg(ayns aynsVar, ayqe ayqeVar) {
        this.a = aynsVar;
        this.c = ayqeVar;
        lazySet(1);
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (azom.e(this.b, th)) {
            qr();
            if (getAndSet(0) <= 0) {
                return;
            }
            this.a.b(azom.d(this.b));
            return;
        }
        azqc.d(th);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aynu, java.lang.Object] */
    @Override // defpackage.bame
    public final void c(Object obj) {
        try {
            ?? a = this.c.a(obj);
            getAndIncrement();
            aywf aywfVar = new aywf(this);
            if (this.g || !this.d.d(aywfVar)) {
                return;
            }
            a.U(aywfVar);
        } catch (Throwable th) {
            bapv.j(th);
            this.f.si();
            b(th);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.d.b;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.f, bamfVar)) {
            this.f = bamfVar;
            this.a.sj(this);
            int i = this.e;
            if (i == Integer.MAX_VALUE) {
                bamfVar.sp(Long.MAX_VALUE);
            } else {
                bamfVar.sp(i);
            }
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.g = true;
        this.f.si();
        this.d.qr();
    }

    @Override // defpackage.bame
    public final void sm() {
        if (decrementAndGet() != 0) {
            if (this.e == Integer.MAX_VALUE) {
                return;
            }
            this.f.sp(1L);
            return;
        }
        Throwable d = azom.d(this.b);
        if (d != null) {
            this.a.b(d);
        } else {
            this.a.sm();
        }
    }
}
