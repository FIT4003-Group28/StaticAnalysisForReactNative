package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azec  reason: default package */
/* loaded from: classes2.dex */
public final class azec extends AtomicReference implements ayom {
    private static final long serialVersionUID = 2620149119579502636L;
    final ayom a;
    final azed b;

    public azec(ayom ayomVar, azed azedVar) {
        this.a = ayomVar;
        this.b = azedVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        azed azedVar = this.b;
        if (azom.e(azedVar.c, th)) {
            boolean z = azedVar.e;
            azedVar.g.qr();
            azedVar.h = false;
            azedVar.f();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.i(this, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        azed azedVar = this.b;
        azedVar.h = false;
        azedVar.f();
    }
}
