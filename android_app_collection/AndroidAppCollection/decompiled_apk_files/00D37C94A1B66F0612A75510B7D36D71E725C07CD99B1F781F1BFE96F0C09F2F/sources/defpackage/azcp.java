package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azcp  reason: default package */
/* loaded from: classes2.dex */
public final class azcp extends AtomicReference implements ayod {
    private static final long serialVersionUID = -1266041316834525931L;
    final azcq a;

    public azcp(azcq azcqVar) {
        this.a = azcqVar;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        azcq azcqVar = this.a;
        if (ayqi.c(azcqVar)) {
            azcqVar.a.b(th);
        } else {
            azqc.d(th);
        }
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        this.a.c();
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayod
    public final void sm() {
        this.a.c();
    }
}
