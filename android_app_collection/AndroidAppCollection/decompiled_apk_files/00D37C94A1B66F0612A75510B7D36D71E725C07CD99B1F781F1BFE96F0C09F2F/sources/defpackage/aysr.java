package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: aysr  reason: default package */
/* loaded from: classes2.dex */
final class aysr extends AtomicInteger implements ayns, aypg {
    private static final long serialVersionUID = 4109457741734051389L;
    final ayns a;
    final aypv b;
    aypg c;

    public aysr(ayns aynsVar, aypv aypvVar) {
        this.a = aynsVar;
        this.b = aypvVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.b(th);
        c();
    }

    final void c() {
        if (compareAndSet(0, 1)) {
            try {
                this.b.a();
            } catch (Throwable th) {
                bapv.j(th);
                azqc.d(th);
            }
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.c.qr();
        c();
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.c, aypgVar)) {
            this.c = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        this.a.sm();
        c();
    }
}
