package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: azjm  reason: default package */
/* loaded from: classes2.dex */
final class azjm implements ayom, aypg {
    final ayot a;
    Collection b;
    aypg c;

    public azjm(ayot ayotVar, Collection collection) {
        this.a = ayotVar;
        this.b = collection;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.b = null;
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.b.add(obj);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.c.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.c, aypgVar)) {
            this.c = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        Collection collection = this.b;
        this.b = null;
        this.a.sh(collection);
    }
}
