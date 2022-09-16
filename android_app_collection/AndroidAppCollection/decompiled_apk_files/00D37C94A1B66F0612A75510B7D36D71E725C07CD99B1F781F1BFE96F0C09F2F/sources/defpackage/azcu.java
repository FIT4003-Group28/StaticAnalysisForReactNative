package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: azcu  reason: default package */
/* loaded from: classes2.dex */
final class azcu implements ayod, aypg {
    final ayot a;
    final Object b;
    aypg c;

    public azcu(ayot ayotVar, Object obj) {
        this.a = ayotVar;
        this.b = obj;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        this.c = ayqi.a;
        this.a.b(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.c.qr();
        this.c = ayqi.a;
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        this.c = ayqi.a;
        this.a.sh(obj);
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.c, aypgVar)) {
            this.c = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayod
    public final void sm() {
        this.c = ayqi.a;
        Object obj = this.b;
        if (obj != null) {
            this.a.sh(obj);
        } else {
            this.a.b(new NoSuchElementException("The MaybeSource is empty"));
        }
    }
}
