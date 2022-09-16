package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fbx  reason: default package */
/* loaded from: classes6.dex */
final class fbx<T> implements dzsj<T> {
    final /* synthetic */ fby a;
    private final int b;

    public fbx(fby fbyVar, int i) {
        this.a = fbyVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [bvdz, T, bveb] */
    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            fby fbyVar = this.a;
            T t = (T) fbyVar.a;
            if (t != null) {
                return t;
            }
            dxio c = dxjc.c(fbyVar.c.eW.h());
            bvrb tn = fbyVar.c.eW.a.tn();
            dxjg.e(tn);
            ?? r1 = (T) new bveb(new bvea(c, tn));
            fbyVar.a = r1;
            return r1;
        } else if (i == 1) {
            fby fbyVar2 = this.a;
            dzsj<btvo> V = fbyVar2.c.eW.V();
            dzsj<ccrh> uA = fbyVar2.c.uA();
            dzsj dzsjVar = fbyVar2.b;
            if (dzsjVar == null) {
                dzsjVar = new fbx(fbyVar2, 2);
                fbyVar2.b = dzsjVar;
            }
            return (T) new ccvx(V, uA, dzsjVar);
        } else if (i == 2) {
            fby fbyVar3 = this.a;
            return (T) new ccvu(fbyVar3.c.eW.V(), fbyVar3.c.ad(), fbyVar3.c.uA());
        } else if (i == 3) {
            fby fbyVar4 = this.a;
            return (T) new cczk(fbyVar4.c.eW.V(), fbyVar4.c.eW.m());
        } else if (i != 4) {
            fby fbyVar5 = this.a;
            gga wk = fbyVar5.c.wk();
            Executor sU = fbyVar5.c.eW.a.sU();
            dxjg.e(sU);
            return (T) new cctx(wk, sU, fbyVar5.c.kr(), fbyVar5.c.aB());
        } else {
            fby fbyVar6 = this.a;
            Executor sU2 = fbyVar6.c.eW.a.sU();
            dxjg.e(sU2);
            return (T) new ccrf(sU2, new cctt(fbyVar6.c.wk()));
        }
    }
}
