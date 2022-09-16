package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ayue  reason: default package */
/* loaded from: classes2.dex */
final class ayue extends AtomicInteger implements ayoa, bamf {
    private static final long serialVersionUID = -5616169793639412593L;
    final bame a;
    final Callable b;
    final int c;
    final int d = 1;
    Collection e;
    bamf f;
    boolean g;
    int h;

    public ayue(bame bameVar, int i, Callable callable) {
        this.a = bameVar;
        this.c = i;
        this.b = callable;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.g) {
            azqc.d(th);
            return;
        }
        this.g = true;
        this.e = null;
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.g) {
            return;
        }
        Collection collection = this.e;
        int i = this.h;
        int i2 = i + 1;
        if (i == 0) {
            try {
                collection = ((azoi) this.b).call();
                this.e = collection;
            } catch (Throwable th) {
                bapv.j(th);
                si();
                b(th);
                return;
            }
        }
        if (collection != null) {
            collection.add(obj);
            if (collection.size() == this.c) {
                this.e = null;
                this.a.c(collection);
            }
        }
        if (i2 == this.d) {
            i2 = 0;
        }
        this.h = i2;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.f, bamfVar)) {
            this.f = bamfVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.f.si();
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.g) {
            return;
        }
        this.g = true;
        Collection collection = this.e;
        this.e = null;
        if (collection != null) {
            this.a.c(collection);
        }
        this.a.sm();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                this.f.sp(ayno.d(this.d, j));
                return;
            }
            this.f.sp(ayno.c(ayno.d(j, this.c), ayno.d(this.d - this.c, j - 1)));
        }
    }
}
