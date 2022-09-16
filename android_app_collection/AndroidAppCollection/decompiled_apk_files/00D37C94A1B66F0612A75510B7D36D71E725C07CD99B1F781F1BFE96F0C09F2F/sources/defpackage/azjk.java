package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: azjk  reason: default package */
/* loaded from: classes2.dex */
final class azjk implements ayom, aypg {
    final ayom a;
    aypg b;
    Collection c;

    public azjk(ayom ayomVar, Collection collection) {
        this.a = ayomVar;
        this.c = collection;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.c = null;
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.c.add(obj);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.b.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.b, aypgVar)) {
            this.b = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        Collection collection = this.c;
        this.c = null;
        this.a.c(collection);
        this.a.sm();
    }
}
