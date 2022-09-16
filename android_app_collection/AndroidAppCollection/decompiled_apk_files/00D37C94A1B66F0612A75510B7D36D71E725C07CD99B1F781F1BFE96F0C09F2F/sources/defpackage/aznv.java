package defpackage;

import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: aznv  reason: default package */
/* loaded from: classes2.dex */
public final class aznv extends CountDownLatch implements ayoa {
    public Object a;
    public Throwable b;
    public bamf c;
    volatile boolean d;

    public aznv() {
        super(1);
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.a == null) {
            this.b = th;
        } else {
            azqc.d(th);
        }
        countDown();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.a == null) {
            this.a = obj;
            this.c.si();
            countDown();
        }
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.c, bamfVar)) {
            this.c = bamfVar;
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        countDown();
    }
}
