package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azag  reason: default package */
/* loaded from: classes2.dex */
public final class azag extends AtomicReference implements ayoa {
    private static final long serialVersionUID = 3256684027868224024L;
    final azaf a;
    final int b;
    boolean c;

    public azag(azaf azafVar, int i) {
        this.a = azafVar;
        this.b = i;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        azaf azafVar = this.a;
        int i = this.b;
        azafVar.h = true;
        azof.f(azafVar.e);
        azafVar.d(i);
        axzl.h(azafVar.a, th, azafVar, azafVar.g);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (!this.c) {
            this.c = true;
        }
        azaf azafVar = this.a;
        azafVar.d.set(this.b, obj);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        azof.k(this, bamfVar, Long.MAX_VALUE);
    }

    @Override // defpackage.bame
    public final void sm() {
        azaf azafVar = this.a;
        int i = this.b;
        if (!this.c) {
            azafVar.h = true;
            azof.f(azafVar.e);
            azafVar.d(i);
            axzl.f(azafVar.a, azafVar, azafVar.g);
        }
    }
}
