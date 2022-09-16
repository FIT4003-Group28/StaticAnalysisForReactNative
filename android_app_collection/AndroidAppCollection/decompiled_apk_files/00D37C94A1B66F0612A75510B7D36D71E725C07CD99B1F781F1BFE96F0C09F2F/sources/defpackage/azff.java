package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: azff  reason: default package */
/* loaded from: classes2.dex */
final class azff implements ayom, aypg {
    final ayot a;
    final Object b;
    aypg c;
    long d;
    boolean e;

    public azff(ayot ayotVar, Object obj) {
        this.a = ayotVar;
        this.b = obj;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.e) {
            azqc.d(th);
            return;
        }
        this.e = true;
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.e) {
            return;
        }
        long j = this.d;
        if (j != 0) {
            this.d = j + 1;
            return;
        }
        this.e = true;
        this.c.qr();
        this.a.sh(obj);
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
        if (!this.e) {
            this.e = true;
            Object obj = this.b;
            if (obj != null) {
                this.a.sh(obj);
            } else {
                this.a.b(new NoSuchElementException());
            }
        }
    }
}
