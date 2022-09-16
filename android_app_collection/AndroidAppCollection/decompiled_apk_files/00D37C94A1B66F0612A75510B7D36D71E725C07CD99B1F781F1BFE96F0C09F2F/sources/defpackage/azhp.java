package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: azhp  reason: default package */
/* loaded from: classes2.dex */
final class azhp extends AtomicBoolean implements ayom, aypg {
    private static final long serialVersionUID = -7419642935409022375L;
    final ayom a;
    final azhq b;
    final azho c;
    aypg d;

    public azhp(ayom ayomVar, azhq azhqVar, azho azhoVar) {
        this.a = ayomVar;
        this.b = azhqVar;
        this.c = azhoVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.b(th);
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.d.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.d.qr();
        if (compareAndSet(false, true)) {
            azhq azhqVar = this.b;
            azho azhoVar = this.c;
            synchronized (azhqVar) {
                azho azhoVar2 = azhqVar.b;
                if (azhoVar2 != null && azhoVar2 == azhoVar) {
                    long j = azhoVar.c - 1;
                    azhoVar.c = j;
                    if (j == 0 && azhoVar.d) {
                        azhqVar.c(azhoVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.d, aypgVar)) {
            this.d = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.sm();
        }
    }
}
