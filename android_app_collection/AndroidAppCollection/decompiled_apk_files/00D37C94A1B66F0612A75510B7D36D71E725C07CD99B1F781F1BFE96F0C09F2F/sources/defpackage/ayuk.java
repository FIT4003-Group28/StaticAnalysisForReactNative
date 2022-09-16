package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayuk  reason: default package */
/* loaded from: classes2.dex */
public final class ayuk extends AtomicReference implements ayoa {
    private static final long serialVersionUID = -8730235182291002949L;
    final ayuj a;
    final int b;
    final int c;
    final int d;
    int e;

    public ayuk(ayuj ayujVar, int i, int i2) {
        this.a = ayujVar;
        this.b = i;
        this.c = i2;
        this.d = i2 - (i2 >> 2);
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        ayuj ayujVar = this.a;
        if (azom.e(ayujVar.l, th)) {
            ayujVar.b();
            ayujVar.k = true;
            ayujVar.f();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.a.g(this.b, obj);
    }

    public final void d() {
        int i = this.e + 1;
        if (i != this.d) {
            this.e = i;
            return;
        }
        this.e = 0;
        ((bamf) get()).sp(i);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        azof.k(this, bamfVar, this.c);
    }

    @Override // defpackage.bame
    public final void sm() {
        ayuj ayujVar = this.a;
        int i = this.b;
        synchronized (ayujVar) {
            Object[] objArr = ayujVar.e;
            if (objArr[i] != null) {
                int i2 = ayujVar.h + 1;
                if (i2 != objArr.length) {
                    ayujVar.h = i2;
                    return;
                }
                ayujVar.k = true;
            } else {
                ayujVar.k = true;
            }
            ayujVar.f();
        }
    }
}
