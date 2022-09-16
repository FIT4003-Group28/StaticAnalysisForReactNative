package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azbf  reason: default package */
/* loaded from: classes2.dex */
public final class azbf extends AtomicReference implements ayod, aypg {
    private static final long serialVersionUID = 4375739915521278546L;
    final ayod a;
    final ayqe b;
    aypg c;

    public azbf(ayod ayodVar, ayqe ayqeVar) {
        this.a = ayodVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
        this.c.qr();
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        try {
            ayof ayofVar = (ayof) this.b.a(obj);
            ayrd.b(ayofVar, "The mapper returned a null MaybeSource");
            if (e()) {
                return;
            }
            ayofVar.X(new azbe(this));
        } catch (Exception e) {
            bapv.j(e);
            this.a.b(e);
        }
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.c, aypgVar)) {
            this.c = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayod
    public final void sm() {
        this.a.sm();
    }
}
