package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aysa  reason: default package */
/* loaded from: classes2.dex */
public final class aysa extends AtomicReference implements ayom, aypg {
    private static final long serialVersionUID = -5417183359794346637L;
    final aysb a;
    final int b;
    public ayrn c;
    public volatile boolean d;
    int e;

    public aysa(aysb aysbVar, int i) {
        this.a = aysbVar;
        this.b = i;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        azef azefVar = (azef) this.a;
        if (azom.e(azefVar.e, th)) {
            if (azefVar.n == 1) {
                azefVar.h.qr();
            }
            f();
            azefVar.f();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.e == 0) {
            aysb aysbVar = this.a;
            this.c.k(obj);
            ((azef) aysbVar).f();
            return;
        }
        this.a.f();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    public final void f() {
        this.d = true;
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayrn azmkVar;
        if (ayqi.g(this, aypgVar)) {
            if (aypgVar instanceof ayri) {
                ayri ayriVar = (ayri) aypgVar;
                int sk = ayriVar.sk(3);
                if (sk == 1) {
                    this.e = 1;
                    this.c = ayriVar;
                    this.d = true;
                    this.a.g(this);
                    return;
                } else if (sk == 2) {
                    this.e = 2;
                    this.c = ayriVar;
                    return;
                }
            }
            int i = this.b;
            int i2 = -i;
            if (i2 < 0) {
                azmkVar = new azml(i);
            } else {
                azmkVar = new azmk(i2);
            }
            this.c = azmkVar;
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.a.g(this);
    }
}
