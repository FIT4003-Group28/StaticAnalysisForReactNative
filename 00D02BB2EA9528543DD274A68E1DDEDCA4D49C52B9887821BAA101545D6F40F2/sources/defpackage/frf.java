package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: frf  reason: default package */
/* loaded from: classes6.dex */
final class frf<T> implements dzsj<T> {
    final /* synthetic */ frg a;
    private final int b;

    public frf(frg frgVar, int i) {
        this.a = frgVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v30, types: [buni, T] */
    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        int i = this.b;
        if (i == 0) {
            frg frgVar = this.a;
            ftt fttVar = frgVar.c;
            rb rbVar = fttVar.a;
            cqat rR = fttVar.eW.a.rR();
            dxjg.e(rR);
            return (T) new cbat(rbVar, rR, frgVar.c.vB(), frgVar.c.wl(), frgVar.c.eW.jh(), new caza(frgVar.c.eW.mL()));
        } else if (i == 1) {
            return (T) cbdy.b();
        } else {
            if (i != 2) {
                if (i == 3) {
                    frg frgVar2 = this.a;
                    dzsj dzsjVar = frgVar2.b;
                    if (dzsjVar == null) {
                        dzsjVar = new frf(frgVar2, 4);
                        frgVar2.b = dzsjVar;
                    }
                    return (T) new cbeq(dzsjVar, frgVar2.c.ad(), frgVar2.c.y(), frgVar2.c.eW.dd(), frgVar2.c.eW.aw(), dxjh.c(frgVar2.c.bo()), dxjh.c(frgVar2.c.aR()));
                }
                frg frgVar3 = this.a;
                T t = (T) frgVar3.e;
                if (t != null) {
                    return t;
                }
                dxio c = dxjc.c(frgVar3.c.eW.h());
                bvrb tn = frgVar3.c.eW.a.tn();
                dxjg.e(tn);
                ?? r1 = (T) new buni(new bunh(c, tn));
                frgVar3.e = r1;
                return r1;
            }
            frg frgVar4 = this.a;
            Object obj2 = frgVar4.a;
            if (obj2 instanceof dxjf) {
                synchronized (obj2) {
                    obj = frgVar4.a;
                    if (obj instanceof dxjf) {
                        gga wk = frgVar4.c.wk();
                        bujr bujrVar = frgVar4.d;
                        if (bujrVar == null) {
                            dxio c2 = dxjc.c(frgVar4.c.eW.h());
                            bvrb tn2 = frgVar4.c.eW.a.tn();
                            dxjg.e(tn2);
                            bujrVar = bujt.b(bujs.b(c2, tn2));
                            frgVar4.d = bujrVar;
                        }
                        Executor sU = frgVar4.c.eW.a.sU();
                        dxjg.e(sU);
                        obj = new aajk(wk, bujrVar, sU, frgVar4.c.fL(), frgVar4.c.aB(), frgVar4.c.eC());
                        dxjc.d(frgVar4.a, obj);
                        frgVar4.a = obj;
                    }
                }
                obj2 = obj;
            }
            return (T) ((aajk) obj2);
        }
    }
}
