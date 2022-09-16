package defpackage;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: azdt  reason: default package */
/* loaded from: classes2.dex */
final class azdt extends AtomicBoolean implements ayom, aypg {
    private static final long serialVersionUID = -8223395059921494546L;
    final ayom a;
    final Callable d;
    aypg e;
    long g;
    final int b = 2;
    final int c = 1;
    final ArrayDeque f = new ArrayDeque();

    public azdt(ayom ayomVar, Callable callable) {
        this.a = ayomVar;
        this.d = callable;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.f.clear();
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        long j = this.g;
        this.g = 1 + j;
        long j2 = j % this.c;
        try {
            this.f.offer(((azoi) this.d).call());
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                collection.add(obj);
                if (this.b <= collection.size()) {
                    it.remove();
                    this.a.c(collection);
                }
            }
        } catch (Throwable th) {
            this.f.clear();
            this.e.qr();
            this.a.b(th);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.e.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.e, aypgVar)) {
            this.e = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        while (!this.f.isEmpty()) {
            this.a.c(this.f.poll());
        }
        this.a.sm();
    }
}
