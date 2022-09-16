package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azcb  reason: default package */
/* loaded from: classes2.dex */
final class azcb extends AtomicReference implements ayod, aypg {
    private static final long serialVersionUID = 2026620218879969836L;
    final ayod a;
    final ayqe b;
    final boolean c = true;

    public azcb(ayod ayodVar, ayqe ayqeVar) {
        this.a = ayodVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        if (this.c || (th instanceof Exception)) {
            try {
                ayof ayofVar = (ayof) ((ayqy) this.b).a;
                ayrd.b(ayofVar, "The resumeFunction returned a null MaybeSource");
                ayqi.i(this, null);
                ayofVar.X(new azca(this.a, this));
                return;
            } catch (Throwable th2) {
                bapv.j(th2);
                this.a.b(new aypo(th, th2));
                return;
            }
        }
        this.a.b(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        this.a.sh(obj);
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.g(this, aypgVar)) {
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayod
    public final void sm() {
        this.a.sm();
    }
}
