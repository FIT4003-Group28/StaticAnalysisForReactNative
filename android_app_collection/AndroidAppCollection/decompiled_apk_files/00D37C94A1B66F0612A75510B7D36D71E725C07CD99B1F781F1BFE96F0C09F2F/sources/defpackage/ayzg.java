package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayzg  reason: default package */
/* loaded from: classes2.dex */
public final class ayzg extends AtomicReference implements ayoa {
    private static final long serialVersionUID = -5592042965931999169L;
    final /* synthetic */ ayzh a;

    public ayzg(ayzh ayzhVar) {
        this.a = ayzhVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        azof.f(this.a.b);
        ayzh ayzhVar = this.a;
        axzl.h(ayzhVar.a, th, ayzhVar, ayzhVar.e);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.a.f = true;
        ((bamf) get()).si();
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        azof.k(this, bamfVar, Long.MAX_VALUE);
    }

    @Override // defpackage.bame
    public final void sm() {
        this.a.f = true;
    }
}
