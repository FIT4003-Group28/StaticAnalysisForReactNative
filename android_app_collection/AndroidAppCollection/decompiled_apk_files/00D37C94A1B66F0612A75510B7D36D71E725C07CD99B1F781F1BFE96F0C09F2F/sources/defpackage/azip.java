package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azip  reason: default package */
/* loaded from: classes2.dex */
public final class azip extends AtomicReference implements ayom {
    private static final long serialVersionUID = 3837284832786408377L;
    final aziq a;
    final long b;
    final int c;
    volatile ayrn d;
    volatile boolean e;

    public azip(aziq aziqVar, long j, int i) {
        this.a = aziqVar;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        aziq aziqVar = this.a;
        if (this.b != aziqVar.j || !azom.e(aziqVar.e, th)) {
            azqc.d(th);
            return;
        }
        aziqVar.h.qr();
        aziqVar.f = true;
        this.e = true;
        aziqVar.g();
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.b == this.a.j) {
            if (obj != null) {
                this.d.k(obj);
            }
            this.a.g();
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.g(this, aypgVar)) {
            if (aypgVar instanceof ayri) {
                ayri ayriVar = (ayri) aypgVar;
                int sk = ayriVar.sk(7);
                if (sk == 1) {
                    this.d = ayriVar;
                    this.e = true;
                    this.a.g();
                    return;
                } else if (sk == 2) {
                    this.d = ayriVar;
                    return;
                }
            }
            this.d = new azml(this.c);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.b == this.a.j) {
            this.e = true;
            this.a.g();
        }
    }
}
