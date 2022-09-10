package defpackage;

import android.content.Context;
import android.os.IBinder;
/* compiled from: PG */
/* renamed from: fvv  reason: default package */
/* loaded from: classes6.dex */
final class fvv<T> implements dzsj<T> {
    final /* synthetic */ fvw a;
    private final int b;

    public fvv(fvw fvwVar, int i) {
        this.a = fvwVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        Object obj2;
        if (this.b != 0) {
            fvw fvwVar = this.a;
            Object obj3 = fvwVar.b;
            if (obj3 instanceof dxjf) {
                synchronized (obj3) {
                    obj2 = fvwVar.b;
                    if (obj2 instanceof dxjf) {
                        fvwVar.c.eg();
                        fvwVar.c.Q();
                        dcmr<Object> dcmrVar = dcmr.a;
                        dxjg.f(dcmrVar);
                        dcep.K(dcmrVar);
                        throw new AssertionError();
                    }
                }
                obj3 = obj2;
            }
            return (T) ((IBinder) obj3);
        }
        fvw fvwVar2 = this.a;
        dbty<awcy> dm = fvwVar2.c.dm();
        fvwVar2.c.dn();
        Object obj4 = fvwVar2.a;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj = fvwVar2.a;
                if (obj instanceof dxjf) {
                    crzm<avzg> dk = fvwVar2.c.dk();
                    dehq tg = fvwVar2.c.a.tg();
                    dxjg.e(tg);
                    awmo awmoVar = new awmo();
                    awmoVar.c = tg;
                    awmoVar.b(4);
                    awmoVar.c(100);
                    awmoVar.b = dk.j();
                    obj = new awnd(awmoVar.a());
                    dxjc.d(fvwVar2.a, obj);
                    fvwVar2.a = obj;
                }
            }
            obj4 = obj;
        }
        awnd awndVar = (awnd) obj4;
        avnk l = fvwVar2.c.l();
        dxio c = dxjc.c(fvwVar2.c.k());
        bvjj rB = fvwVar2.c.a.rB();
        dxjg.e(rB);
        cqat rR = fvwVar2.c.a.rR();
        dxjg.e(rR);
        dxio c2 = dxjc.c(fvwVar2.c.p());
        cjqy tr = fvwVar2.c.a.tr();
        dxjg.e(tr);
        avop y = fvwVar2.c.y();
        Context b = fvwVar2.c.a.b();
        dxjg.e(b);
        fyu fyuVar = fvwVar2.c;
        dzsj dzsjVar = fyuVar.ei;
        if (dzsjVar == null) {
            dzsjVar = new fxy(fyuVar, 749);
            fyuVar.ei = dzsjVar;
        }
        dxjc.c(dzsjVar);
        fvwVar2.c.aH();
        return (T) new avod(dm, awndVar, l, c, rB, rR, c2, tr, y, b);
    }
}
