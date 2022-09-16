package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azbc  reason: default package */
/* loaded from: classes2.dex */
public final class azbc extends AtomicReference implements ayod, aypg {
    private static final long serialVersionUID = 4375739915521278546L;
    final ayod a;
    final ayqe b;
    final ayqe c;
    final Callable d;
    aypg e;

    public azbc(ayod ayodVar, ayqe ayqeVar, ayqe ayqeVar2, Callable callable) {
        this.a = ayodVar;
        this.b = ayqeVar;
        this.c = ayqeVar2;
        this.d = callable;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        try {
            ayof ayofVar = (ayof) this.c.a(th);
            ayrd.b(ayofVar, "The onErrorMapper returned a null MaybeSource");
            ayofVar.X(new azbb(this));
        } catch (Exception e) {
            bapv.j(e);
            this.a.b(new aypo(th, e));
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
        this.e.qr();
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        try {
            ayof ayofVar = (ayof) this.b.a(obj);
            ayrd.b(ayofVar, "The onSuccessMapper returned a null MaybeSource");
            ayofVar.X(new azbb(this));
        } catch (Exception e) {
            bapv.j(e);
            this.a.b(e);
        }
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.e, aypgVar)) {
            this.e = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayod
    public final void sm() {
        try {
            ayof ayofVar = (ayof) this.d.call();
            ayrd.b(ayofVar, "The onCompleteSupplier returned a null MaybeSource");
            ayofVar.X(new azbb(this));
        } catch (Exception e) {
            bapv.j(e);
            this.a.b(e);
        }
    }
}
