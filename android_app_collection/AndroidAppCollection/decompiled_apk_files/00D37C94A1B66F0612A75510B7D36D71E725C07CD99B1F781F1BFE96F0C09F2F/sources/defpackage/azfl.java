package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azfl  reason: default package */
/* loaded from: classes2.dex */
public final class azfl extends AtomicReference implements ayom {
    private static final long serialVersionUID = -4606175640614850599L;
    final long a;
    final azfm b;
    volatile boolean c;
    volatile ayrn d;
    int e;

    public azfl(azfm azfmVar, long j) {
        this.a = j;
        this.b = azfmVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (azom.e(this.b.j, th)) {
            azfm azfmVar = this.b;
            boolean z = azfmVar.e;
            azfmVar.k();
            this.c = true;
            this.b.f();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.e == 0) {
            azfm azfmVar = this.b;
            if (azfmVar.get() != 0 || !azfmVar.compareAndSet(0, 1)) {
                ayrn ayrnVar = this.d;
                if (ayrnVar == null) {
                    ayrnVar = new azml(azfmVar.g);
                    this.d = ayrnVar;
                }
                ayrnVar.k(obj);
                if (azfmVar.getAndIncrement() != 0) {
                    return;
                }
            } else {
                azfmVar.c.c(obj);
                if (azfmVar.decrementAndGet() == 0) {
                    return;
                }
            }
            azfmVar.g();
            return;
        }
        this.b.f();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (!ayqi.g(this, aypgVar) || !(aypgVar instanceof ayri)) {
            return;
        }
        ayri ayriVar = (ayri) aypgVar;
        int sk = ayriVar.sk(7);
        if (sk == 1) {
            this.e = 1;
            this.d = ayriVar;
            this.c = true;
            this.b.f();
        } else if (sk != 2) {
        } else {
            this.e = 2;
            this.d = ayriVar;
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.c = true;
        this.b.f();
    }
}
