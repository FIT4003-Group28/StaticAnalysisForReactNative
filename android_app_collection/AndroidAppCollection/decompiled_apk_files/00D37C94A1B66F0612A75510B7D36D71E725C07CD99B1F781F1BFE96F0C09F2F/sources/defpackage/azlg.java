package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azlg  reason: default package */
/* loaded from: classes2.dex */
final class azlg extends AtomicReference implements ayot, aypg {
    private static final long serialVersionUID = -5843758257109742742L;
    final ayod a;
    final ayqe b;

    public azlg(ayod ayodVar, ayqe ayqeVar) {
        this.a = ayodVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
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
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ayof, java.lang.Object] */
    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        try {
            ?? a = this.b.a(obj);
            if (e()) {
                return;
            }
            a.X(new azca(this, this.a, 3));
        } catch (Throwable th) {
            bapv.j(th);
            b(th);
        }
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.g(this, aypgVar)) {
            this.a.sj(this);
        }
    }
}
