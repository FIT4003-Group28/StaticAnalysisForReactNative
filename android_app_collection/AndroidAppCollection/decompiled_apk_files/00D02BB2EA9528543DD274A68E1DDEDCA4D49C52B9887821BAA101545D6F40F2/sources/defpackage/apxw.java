package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: apxw  reason: default package */
/* loaded from: classes2.dex */
final class apxw implements Runnable {
    private final WeakReference<apxx> a;

    public apxw(apxx apxxVar) {
        this.a = new WeakReference<>(apxxVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        apxx apxxVar = this.a.get();
        if (apxxVar == null || btlu.n(apxxVar.b.a().j()) || !apxxVar.w()) {
            return;
        }
        apxxVar.r = apxxVar.f.a();
        apxxVar.r.a();
        synchronized (apxxVar.p) {
            if (apxxVar.s == null && apxxVar.k.b()) {
                apxxVar.s = new apxu(apxxVar);
                crzm<btlu> C = apxxVar.b.a().C();
                apxu apxuVar = apxxVar.s;
                dbsk.s(apxuVar);
                C.d(apxuVar, apxxVar.h);
            }
        }
        apxxVar.K();
        if (apxxVar.k.b()) {
            apxxVar.i.a().a();
        }
        aqbo aqboVar = apxxVar.r;
        if (aqboVar.c.a().d()) {
            return;
        }
        deha.q(aqboVar.b.a().b().c(), bvqj.b(new aqbn(aqboVar.f, aqboVar.g, aqboVar)), dege.a);
    }
}
