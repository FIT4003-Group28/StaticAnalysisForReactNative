package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azdb  reason: default package */
/* loaded from: classes2.dex */
public final class azdb extends AtomicReference implements ayot {
    private static final long serialVersionUID = 8042919737683345351L;
    final azdc a;
    volatile Object b;

    public azdb(azdc azdcVar) {
        this.a = azdcVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        azdc azdcVar = this.a;
        if (!azdcVar.f.compareAndSet(this, null) || !azom.e(azdcVar.d, th)) {
            azqc.d(th);
            return;
        }
        azdcVar.g.si();
        azdcVar.d();
        azdcVar.g();
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        this.b = obj;
        this.a.g();
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }
}
