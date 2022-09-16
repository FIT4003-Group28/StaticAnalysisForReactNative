package defpackage;

import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: ayrs  reason: default package */
/* loaded from: classes2.dex */
public final class ayrs extends CountDownLatch implements ayot, ayns, ayod {
    Object a;
    Throwable b;
    aypg c;
    volatile boolean d;

    public ayrs() {
        super(1);
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.b = th;
        countDown();
    }

    public final Object c() {
        if (getCount() != 0) {
            try {
                azxy.d();
                await();
            } catch (InterruptedException e) {
                this.d = true;
                aypg aypgVar = this.c;
                if (aypgVar != null) {
                    aypgVar.qr();
                }
                throw azom.b(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw azom.b(th);
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        this.a = obj;
        countDown();
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        this.c = aypgVar;
        if (this.d) {
            aypgVar.qr();
        }
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        countDown();
    }
}
