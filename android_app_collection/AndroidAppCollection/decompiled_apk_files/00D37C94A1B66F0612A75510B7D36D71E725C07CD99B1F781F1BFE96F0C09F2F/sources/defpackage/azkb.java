package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azkb  reason: default package */
/* loaded from: classes2.dex */
final class azkb extends AtomicReference implements ayoa {
    private static final long serialVersionUID = 8410034718427740355L;
    final azkc a;
    final int b;
    final int c;
    long d;
    volatile ayrm e;

    public azkb(azkc azkcVar, int i) {
        this.a = azkcVar;
        this.b = i;
        this.c = i - (i >> 2);
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.a.f(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.a.g(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayrm d() {
        ayrm ayrmVar = this.e;
        if (ayrmVar == null) {
            azmk azmkVar = new azmk(this.b);
            this.e = azmkVar;
            return azmkVar;
        }
        return ayrmVar;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        azof.k(this, bamfVar, this.b);
    }

    @Override // defpackage.bame
    public final void sm() {
        this.a.d();
    }
}
