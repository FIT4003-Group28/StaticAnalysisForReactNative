package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ayuc  reason: default package */
/* loaded from: classes2.dex */
final class ayuc implements ayoa, bamf {
    final bame a;
    final Callable b;
    Collection c;
    bamf d;
    boolean e;

    public ayuc(bame bameVar, Callable callable) {
        this.a = bameVar;
        this.b = callable;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.e) {
            azqc.d(th);
            return;
        }
        this.e = true;
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.e) {
            return;
        }
        Collection collection = this.c;
        if (collection == null) {
            try {
                collection = ((azoi) this.b).call();
                this.c = collection;
            } catch (Throwable th) {
                bapv.j(th);
                si();
                b(th);
                return;
            }
        }
        collection.add(obj);
        this.c = null;
        this.a.c(collection);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.d, bamfVar)) {
            this.d = bamfVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.d.si();
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.e) {
            return;
        }
        this.e = true;
        Collection collection = this.c;
        if (collection != null && !collection.isEmpty()) {
            this.a.c(collection);
        }
        this.a.sm();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            this.d.sp(ayno.d(j, 1L));
        }
    }
}
