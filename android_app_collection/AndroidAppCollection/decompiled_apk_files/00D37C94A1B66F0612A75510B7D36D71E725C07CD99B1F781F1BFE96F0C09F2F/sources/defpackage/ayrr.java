package defpackage;

import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: ayrr  reason: default package */
/* loaded from: classes2.dex */
public final class ayrr extends CountDownLatch implements ayom, aypg {
    Object a;
    Throwable b;
    aypg c;
    volatile boolean d;

    public ayrr() {
        super(1);
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.a == null) {
            this.b = th;
        }
        countDown();
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.a == null) {
            this.a = obj;
            this.c.qr();
            countDown();
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.d;
    }

    public final Object f() {
        if (getCount() != 0) {
            try {
                azxy.d();
                await();
            } catch (InterruptedException e) {
                qr();
                throw azom.b(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw azom.b(th);
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.d = true;
        aypg aypgVar = this.c;
        if (aypgVar != null) {
            aypgVar.qr();
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        this.c = aypgVar;
        if (this.d) {
            aypgVar.qr();
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        countDown();
    }
}
