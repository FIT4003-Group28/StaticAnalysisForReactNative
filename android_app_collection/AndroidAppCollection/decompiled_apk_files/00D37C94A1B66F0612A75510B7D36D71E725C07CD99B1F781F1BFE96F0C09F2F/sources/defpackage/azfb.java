package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: azfb  reason: default package */
/* loaded from: classes2.dex */
final class azfb implements ayom, aypg {
    final ayom a;
    final Object b;
    final boolean c;
    aypg d;
    long e;
    boolean f;

    public azfb(ayom ayomVar, Object obj, boolean z) {
        this.a = ayomVar;
        this.b = obj;
        this.c = z;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.f) {
            azqc.d(th);
            return;
        }
        this.f = true;
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.f) {
            return;
        }
        long j = this.e;
        if (j != 0) {
            this.e = j + 1;
            return;
        }
        this.f = true;
        this.d.qr();
        this.a.c(obj);
        this.a.sm();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.d.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.d.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.d, aypgVar)) {
            this.d = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (!this.f) {
            this.f = true;
            Object obj = this.b;
            if (obj != null || !this.c) {
                if (obj != null) {
                    this.a.c(obj);
                }
                this.a.sm();
                return;
            }
            this.a.b(new NoSuchElementException());
        }
    }
}
