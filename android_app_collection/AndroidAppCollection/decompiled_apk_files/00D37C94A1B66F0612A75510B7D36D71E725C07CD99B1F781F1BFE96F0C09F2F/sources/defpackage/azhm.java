package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azhm  reason: default package */
/* loaded from: classes2.dex */
final class azhm extends AtomicReference implements ayom, aypg {
    private static final long serialVersionUID = 854110278590336484L;
    final ayom a;
    aypg b;

    public azhm(ayom ayomVar) {
        this.a = ayomVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        ayqi.c(this);
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.b.qr();
        ayqi.c(this);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.b, aypgVar)) {
            this.b = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        ayqi.c(this);
        this.a.sm();
    }
}
