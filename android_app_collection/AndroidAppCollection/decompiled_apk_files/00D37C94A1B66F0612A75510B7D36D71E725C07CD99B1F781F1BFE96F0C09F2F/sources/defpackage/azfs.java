package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azfs  reason: default package */
/* loaded from: classes2.dex */
public final class azfs extends AtomicInteger implements aypg, ayom {
    private static final long serialVersionUID = 8443155186132538303L;
    final ayns a;
    final ayqe c;
    aypg e;
    volatile boolean f;
    final azoj b = new azoj();
    final aypf d = new aypf();

    public azfs(ayns aynsVar, ayqe ayqeVar) {
        this.a = aynsVar;
        this.c = ayqeVar;
        lazySet(1);
    }

    @Override // defpackage.ayom
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

    @Override // defpackage.ayom
    public final void c(Object obj) {
        try {
            aynu aynuVar = (aynu) this.c.a(obj);
            ayrd.b(aynuVar, "The mapper returned a null CompletableSource");
            getAndIncrement();
            azfr azfrVar = new azfr(this);
            if (this.f || !this.d.d(azfrVar)) {
                return;
            }
            aynuVar.U(azfrVar);
        } catch (Throwable th) {
            bapv.j(th);
            this.e.qr();
            b(th);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.f = true;
        this.e.qr();
        this.d.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.e, aypgVar)) {
            this.e = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (decrementAndGet() == 0) {
            Throwable d = azom.d(this.b);
            if (d != null) {
                this.a.b(d);
            } else {
                this.a.sm();
            }
        }
    }
}
