package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aziu  reason: default package */
/* loaded from: classes2.dex */
public final class aziu extends AtomicReference implements ayom {
    private static final long serialVersionUID = -8693423678067375039L;
    final /* synthetic */ aziv a;

    public aziu(aziv azivVar) {
        this.a = azivVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        aziv azivVar = this.a;
        ayqi.c(azivVar.b);
        axzl.g(azivVar.a, th, azivVar, azivVar.d);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        ayqi.c(this);
        this.a.f();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.a.f();
    }
}
