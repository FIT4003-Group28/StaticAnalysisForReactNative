package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayzr  reason: default package */
/* loaded from: classes2.dex */
final class ayzr extends AtomicReference implements ayoa {
    private static final long serialVersionUID = -3592821756711087922L;
    final /* synthetic */ ayzs a;

    public ayzr(ayzs ayzsVar) {
        this.a = ayzsVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        azof.f(this.a.c);
        ayzs ayzsVar = this.a;
        axzl.h(ayzsVar.a, th, ayzsVar, ayzsVar.d);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        azof.f(this);
        sm();
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        azof.k(this, bamfVar, Long.MAX_VALUE);
    }

    @Override // defpackage.bame
    public final void sm() {
        azof.f(this.a.c);
        ayzs ayzsVar = this.a;
        axzl.f(ayzsVar.a, ayzsVar, ayzsVar.d);
    }
}
